package com.dhakre.impls;

import com.dhakre.beans.HelloRequestScopeData;

import java.util.Date;

/**
 * Created by vivek on 11/4/17.
 */
public class HelloRequestScopeDataImpl implements HelloRequestScopeData{

    private final Date date;

    public HelloRequestScopeDataImpl(Date date) {
        this.date = date;
    }


    public String getDate() {
        return date.toString();
    }
}
