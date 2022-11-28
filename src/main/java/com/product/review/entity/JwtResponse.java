package com.product.review.entity;

public class JwtResponse {


    private User1 user;
    private String jwtToken;

    public JwtResponse(User1 user, String jwtToken) {
        this.user = user;
        this.jwtToken = jwtToken;
    }

    public User1 getUser() {
        return user;
    }

    public void setUser(User1 user) {
        this.user = user;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
