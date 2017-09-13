package com.prototype.enums;

/**
 * 人员信息枚举信息
 */
public enum PersonStateEnum {

    PERSON_FAIL_0(0,"账号不存在"),

    PERSON_SUCCESS(1,"登录成功"),
    PERSON_FIAL_1(-1,"验证失败，密码错误"),

    PERSON_INSERT_SUCCESS(2,"插入人员信息成功"),
    PERSON_INSERT_FAIL(-2,"插入人员信息失败,可能是用户信息已存在"),

    PERSON_UPDATE_SUCCESS(3,"修改人员信息成功"),
    PERSON_UPDATE_FAIL(-3,"修改人员信息失败,可能是用户信息不存在"),

    PERSON_UPDATE_PASSWORD_SUCCESS(4,"密码修改成功"),
    PERSON_UPDATE_PASSWORD_FAIL(-4,"密码修改失败"),

    PERSON_REQUEST_ILLEGAL(-416,"请求非法"),
    INNER_PERSON(-500,"系统异常,数据被篡改")
    ;
    private int state;

    private String stateInfo;

    PersonStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static PersonStateEnum stateOf(int index){
        for(PersonStateEnum state : values()){
            if (state.getState()==index){
                return null;
            }
        }
        return null;
    }
}
