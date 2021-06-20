package oop.assignment3.ex42;

import oop.assignment3.ex42.Person;

import java.util.List;

public class BasicDataParser {
    //outputs the data given to it in the form of a list
    //to a formatted string
    public static String OutPutTime(List<Person> myList)
    {
        // format the topp of the string by adding the labels and bottom bar
        String strx = String.format("%-20s", "Last ");
        String stry = String.format(" %-20s", "First" );
        String strz = String.format(" %-20s", "Salary");
        String OutPutString = ""+ strx + stry + strz + "\n------------------------------------------------";
        //add all the elements inside the list using string format to the output string
        for (int i=0; i<myList.size(); i++) {
            String str4 = String.format("%-20s", myList.get(i).getLastName() );
            String str2 = String.format(" %-20s", myList.get(i).getFirstName());
            String str3 = String.format(" %-20s", myList.get(i).getSalary());
            String OutputStringAdder = "\n" + str4 + str2 + str3;
            OutPutString += OutputStringAdder;
        }
        //return the output string
        return OutPutString;
    }
}
