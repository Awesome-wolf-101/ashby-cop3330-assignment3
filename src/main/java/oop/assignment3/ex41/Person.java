package oop.assignment3.ex41;

import java.util.HashMap;
import java.util.Map;

public class Person {
    String Firstname;
    String Lastname;


    private Map<String, String> map;

    public Person(String firstName, String lastName, String position, String SeparationDate) {
        map = new HashMap<>();
        map.put("FirstName", firstName);
        map.put("LastName", lastName);

    }

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
