package com.theironyard.novauc;

/**
 * Created by vtcurry on 3/30/17.
 */
public class RestUser {

    String username;
    String password;

    public RestUser() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RestUser(String username, String password) {
        this.username = username;
        this.password = password;


    }
}
