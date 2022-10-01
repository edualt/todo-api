package com.api.todoapp.constants;

public enum TaskStatusEnum {

    ON_TIME(0),
    LATE(1);

    private final int status;

    TaskStatusEnum(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }

}
