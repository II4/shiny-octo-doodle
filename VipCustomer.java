package com.km;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Default name", 50000, "default@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }


//    public VipCustomer(String name, double creditLimit, String email) {
//        this.name = name;
//        this.creditLimit = creditLimit;
//        this.email = email;
//    }
//
//    public VipCustomer() {
//        this("Joop", 2500, "Joop@hotmail.com");
//    }
}