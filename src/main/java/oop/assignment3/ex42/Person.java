package oop.assignment3.ex42;


import java.util.HashMap;
import java.util.Map;

public class Person {
    //variable
    String Firstname;
    String Lastname;
    String Salary;

    private Map<String, String> map;

    //constructor for the person class
    //also adds all the variables to the map
    public Person(String firstName, String lastName, String Salary) {
        map = new HashMap<>();
        map.put("FirstName", firstName);
        map.put("LastName", lastName);
        map.put("Salary", Salary);

    }

    //getter methods
    public Map<String, String> getMap() {
        return map;
    }
    public String getLastName() {
        return map.get("LastName");
    }

    public String getFirstName() {
        return map.get("FirstName");
    }

    public String getSalary() {
        return map.get("Salary");
    }
}

