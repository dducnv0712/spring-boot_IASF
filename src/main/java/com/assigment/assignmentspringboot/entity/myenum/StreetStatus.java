package com.assigment.assignmentspringboot.entity.myenum;

public enum StreetStatus {
    USING(1),UNDER_CONSTRUCTION(0),REPAIRING(-1),UNDEFINED(-2);
    private final int value;
    StreetStatus(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public static StreetStatus getObjStatus(int value) {
        for (StreetStatus objStatus : StreetStatus.values()) {
            if (objStatus.getValue() == value) {
                return objStatus;
            }
        }
        return UNDEFINED;
    }
}
