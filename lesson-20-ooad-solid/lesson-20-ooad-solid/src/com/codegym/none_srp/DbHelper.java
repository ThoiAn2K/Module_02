package com.codegym.none_srp;

import com.codegym.entity.Product;
import com.codegym.entity.User;

import java.sql.Connection;
import java.util.List;

public class DbHelper {
    private static final String URL = "jdbc:mysql://localhost:3306/product_management";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "12345";

    public Connection openConnection() {
        //code to open connection to database here
        return null;
    }

    public void saveUser(User user) {
        //code to save new user to database
    }

    public List<Product> getProducts() {
        //code to get list of products from database
        return null;
    }
}
