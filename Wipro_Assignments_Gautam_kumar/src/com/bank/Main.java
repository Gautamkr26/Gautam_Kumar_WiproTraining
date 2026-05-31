package com.bank;

public class Main {
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        System.out.println("SBI Interest Rate: " + b.getInterestRate());

        b = new HDFC();
        System.out.println("HDFC Interest Rate: " + b.getInterestRate());

        b = new ICICI();
        System.out.println("ICICI Interest Rate: " + b.getInterestRate());
    }
}