package com.osterhoutgroup.sharedlibraryplugin.enumerations;

@SuppressWarnings("unused")
public enum DatePeriod {

    ANY(0),
    LAST24HOURS(1),
    LAST7DAYS(7),
    LAST30DAYS(30),
    LAST6MONTHS(180);

    private int value;

    DatePeriod(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
