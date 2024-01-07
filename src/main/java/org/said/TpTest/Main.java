package org.said.TpTest;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Person person = new Person("Josh", "Hayden", LocalDate.parse("2013-01-12"));
        String displayName = person.getDisplayName()  + ": " + person.getAge() + " years";
        System.out.printf(displayName);
        // Doe, Joey: 4 years

    }
}