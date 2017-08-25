package com.km;

public class Main {

    public static void main(String[] args) {
	VipCustomer Customer1 = new VipCustomer();
        System.out.println(Customer1.getName());

        VipCustomer Customer2 = new VipCustomer("Bob", 25000);
        System.out.println(Customer2.getName());

        VipCustomer Customer3 = new VipCustomer("Tim", 100, "tim@email.com");
        System.out.println(Customer3.getName());
        System.out.println(Customer3.getEmail());
    }
}
