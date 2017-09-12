package com.prototype.enums;

/**
 * 登录信息枚举信息
 */
public enum PersonStateEnum {

    PERSON_SUCCESS(1,"登录成功"),
    PERSON_FAIL_0(0,"登录失败，账号不存在"),
    PERSON_FIAL_1(-1,"登录失败，密码错误"),
    INNER_PERSON(-2,"系统异常,数据被篡改")
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
