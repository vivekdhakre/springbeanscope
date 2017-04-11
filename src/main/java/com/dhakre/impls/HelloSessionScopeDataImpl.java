package com.dhakre.impls;

import com.dhakre.beans.HelloSessionScopeData;

import java.util.Date;

/**
 * Created by vivek on 11/4/17.
 */
public class HelloSessionScopeDataImpl implements HelloSessionScopeData {

    private final Date date;

    public HelloSessionScopeDataImpl(Date date) {
        this.date = date;
    }

    public String getDate() {
        return date.toString();
    }
}
