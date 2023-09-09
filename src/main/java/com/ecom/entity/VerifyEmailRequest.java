package com.ecom.entity;

public class VerifyEmailRequest {
    private String token;

    public VerifyEmailRequest(String token) {
        this.token = token;
    }

    public VerifyEmailRequest() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
