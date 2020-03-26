package com.zipcodewilmington;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Jhene", "Aiko");
        Person p2 = new Person("Childish", "Gambino");
        Person p3 = new Person("Donald", "Glover");

        Person[] people = {p1, p2, p3};

        PersonHandler everyone = new PersonHandler(people);

        System.out.println(everyone.whileLoop());
        System.out.println("****************************");
        System.out.println(everyone.forLoop());
        System.out.println("****************************");
        System.out.println(everyone.forEachLoop());
        System.out.println("****************************");
    }
}
