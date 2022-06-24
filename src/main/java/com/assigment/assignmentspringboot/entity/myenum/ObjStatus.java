package com.assigment.assignmentspringboot.entity.myenum;

public enum ObjStatus {
    ACTIVE(1),DEACTIVE(0),DELETED(-1),UNDEFINED(-2);
    private final int value;
    ObjStatus(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public static ObjStatus getObjStatus(int value) {
        for (ObjStatus objStatus : ObjStatus.values()) {
            if (objStatus.getValue() == value) {
                return objStatus;
            }
        }
        return UNDEFINED;
    }
}
