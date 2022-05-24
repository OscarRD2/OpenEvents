package com.androidpprog2.openevents.API;

import java.io.Serializable;

public class Login implements Serializable {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String image;

    public Login(String name, String lastName, String email, String password, String image) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.image = image;
    }
}
