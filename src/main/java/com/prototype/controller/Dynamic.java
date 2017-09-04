package com.prototype.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Dynamic {

    @RequestMapping(value = "/{formName}")
    public String formName(@PathVariable String formName){
        return "embed/"+formName;
    }

}
