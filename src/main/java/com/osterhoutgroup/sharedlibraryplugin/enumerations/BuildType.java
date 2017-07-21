package com.osterhoutgroup.sharedlibraryplugin.enumerations;

@SuppressWarnings("unused")
public enum BuildType {
    USER(0), USERDEBUG(1);

    private Integer value;

    BuildType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
