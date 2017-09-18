package com.prototype.dto;

import com.prototype.entity.Person;
import com.prototype.enums.PersonStateEnum;

/**
 * 封装登录等用户信息操作执行后结果
 */
public class PersonExecution {
//    ID
    private String id;
//    执行结果状态
    private int state;
//    状态信息
    private String stateInfo;
//    用户对象
    private Person person;

    //登录失败
    public PersonExecution(PersonStateEnum personStateEnum) {
        this.state = personStateEnum.getState();
        this.stateInfo = personStateEnum.getStateInfo();
    }
//登录，插入人员信息成功
    public PersonExecution(String id, PersonStateEnum personStateEnum, Person person) {
        this.id = id;
        this.state = personStateEnum.getState();
        this.stateInfo = personStateEnum.getStateInfo();
        this.person = person;
    }
//    插入人员信息失败，修改密码失败/成功
    public PersonExecution(String id, PersonStateEnum personStateEnum){
        this.id = id;
        this.state = personStateEnum.getState();
        this.stateInfo = personStateEnum.getStateInfo();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "PersonExecution{" +
                "id='" + id + '\'' +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", person=" + person +
                '}';
    }
}
