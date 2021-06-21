/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment3.ex41;

import java.util.HashMap;
import java.util.Map;

public class Person {
    //make two new variables for the first and last names and a map to retrieve them
    String Firstname;
    String Lastname;


    private Map<String, String> map;

    //make a constructor for person by putting the first and last name in the map
    public Person(String firstName, String lastName) {
        map = new HashMap<>();
        map.put("FirstName", firstName);
        map.put("LastName", lastName);

    }

    //make getter methods here
    public Map<String, String> getMap() {
        return map;
    }
    public String getLastName() {
        return map.get("LastName");
    }

    public String getFirstName() {
        return map.get("FirstName");
    }
}
