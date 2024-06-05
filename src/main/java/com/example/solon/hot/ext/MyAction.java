package com.example.solon.hot.ext;

import org.noear.solon.core.handle.Action;
import org.noear.solon.core.handle.MethodType;

import java.lang.reflect.Method;

public class MyAction {
    Method method;
    String newPath;
    MethodType m1;
    Action action;

    public MyAction(Method method, String newPath, MethodType m1, Action action) {
        this.method = method;
        this.newPath = newPath;
        this.m1 = m1;
        this.action = action;
    }

    public Method getMethod() {
        return method;
    }

    public MyAction setMethod(Method method) {
        this.method = method;
        return this;
    }

    public String getNewPath() {
        return newPath;
    }

    public MyAction setNewPath(String newPath) {
        this.newPath = newPath;
        return this;
    }

    public MethodType getM1() {
        return m1;
    }

    public MyAction setM1(MethodType m1) {
        this.m1 = m1;
        return this;
    }

    public Action getAction() {
        return action;
    }

    public MyAction setAction(Action action) {
        this.action = action;
        return this;
    }
}
