package edu.java.packages.javaNet.PassAutentication;

public class Autentication {

    private final String userName;
    private final String password;

    public Autentication(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }
}