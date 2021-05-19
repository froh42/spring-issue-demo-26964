package com.example.problem;

public class ChiliConCarne {
    private final KidneyBean kidneyBean;

    public ChiliConCarne(KidneyBean kidneyBean) {
        this.kidneyBean = kidneyBean;
    }

    public String taste() { return "some ChiliConCarne containing " + kidneyBean.taste(); }
}
