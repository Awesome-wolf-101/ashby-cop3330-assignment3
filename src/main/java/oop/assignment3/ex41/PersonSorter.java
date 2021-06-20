package oop.assignment3.ex41;

import java.io.*;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.File;
import java.util.Scanner;

public class PersonSorter {
    //sort a list of people
    public static List<Person>  SortPersonMapList(List<Person> myList)
    {
                //sort this person list, but change the comparator to take into account
                //first and last name
                Collections.sort(myList, new Comparator() {

                    public int compare(Object o1, Object o2) {
                        Person p1 = (Person) o1;
                        Person p2 = (Person) o2;
                        int res =  p1.getLastName().compareToIgnoreCase(p2.getLastName());
                        if (res != 0)
                            return res;
                        return p1.getFirstName().compareToIgnoreCase(p2.getFirstName());
                    }
                });
                //return the new list
        return myList;
    }
//Output the new list to a string
    public static String OutPutTime(List<Person> myList, int NumNames)
    {
        //print out the begining/top of thestring with the number of names
        String OutputString = "Total of " + NumNames +" names" + "\n-----------------";
        //go through the list and add them to the output string
        for (int i=0; i<myList.size(); i++) {
            String str1 ="\n" + myList.get(i).getLastName() +", "+ myList.get(i).getFirstName();
            OutputString += str1;
        }
        //return the output string
        return OutputString;
    }
    //writes a string to an input file
    public static void FileWriter(String InputString){
        //make a new file by getting my current directory and adding the name
        //of the output file in this case "exercise41_output.txt"
        File file4 = new File( System.getProperty("user.dir") + "exercise41_output.txt");
        //use try catch ro create a new file then, write to the file and close the file writer
        try {
            boolean newFile = file4.createNewFile();
            FileWriter myWriter = new FileWriter("exercise41_output.txt");
            myWriter.write(InputString);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }


}
