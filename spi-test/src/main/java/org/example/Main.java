package org.example;

import org.example.api.LicenseFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        var validator = LicenseFactory.getValidator(Main.class);

        System.out.println(validator.validate("d"));

    }
}