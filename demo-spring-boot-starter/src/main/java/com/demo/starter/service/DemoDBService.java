package com.demo.starter.service;

public class DemoDBService {

    private String url;
    private String name;
    private String password;

    public DemoDBService(String url, String name, String password) {
        this.url = url;
        this.name = name;
        this.password = password;
    }

    public String connectToDBserver(){
        return this.url +" !  with name and password success ："  + name +" - " + password;
    }

}
