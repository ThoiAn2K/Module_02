package com.codegym.has_srp;

import java.sql.Connection;

public class DbConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/product_management";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "12345";

    public Connection openConnection() {
        //code to open connection to database here
        return null;
    }
}
