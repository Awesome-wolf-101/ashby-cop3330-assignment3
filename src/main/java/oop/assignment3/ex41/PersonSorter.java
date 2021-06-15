package oop.assignment3.ex41;

import java.io.*;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.File;
import java.util.Scanner;

public class PersonSorter {
    public static List<Map<String, String>> ListMaker(Person[] PersonArray) {
        List<Map<String, String>> myList = new ArrayList<Map<String, String>>();
        for (int i = 0; i < PersonArray.length; i++) {
            Map<String, String> tempmap = new HashMap<String, String>();
            Person tempperson = PersonArray[i];
            tempmap = tempperson.getMap();
            myList.add(tempmap);
        }

        return myList;
    }
/*
    public static Employee[] EmployeeArrayMaker() {
        Employee[] EmployeeArray = new Employee[6];
        Employee John = new Employee("John", "Johnson", "Manager", "2016-12-31");
        Employee Tou = new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05");
        Employee Michaela = new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19");
        Employee Jake = new Employee("Jake", "Jacobson", "Programmer", "");
        Employee Jacquelyn = new Employee("Jacquelyn", "Jackson", "DBA", "");
        Employee Sally = new Employee("Sally", "Webber", "Web Developer", "2015-12-18");
        EmployeeArray[0] = John;
        EmployeeArray[1] = Tou;
        EmployeeArray[2] = Michaela;
        EmployeeArray[3] = Jake;
        EmployeeArray[4] = Jacquelyn;
        EmployeeArray[5] = Sally;
        return EmployeeArray;
    }
*/

    public static List<Map<String, String>>  SortEmployeeMapList(List<Map<String, String>> myList)
    {
        for (int i = 0; i < myList.size(); i++) {
            for (int j = 0; j < myList.size(); j++) {
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
            }

        }
        return myList;
    }

    public static String OutPutTime(List<Map<String, String>> myList)
    {
        String OutputString = "Name                | Position          | Separation Date" + "\n--------------------|-------------------|----------------";
        for (int i=0; i<myList.size(); i++) {
            String str1 = myList.get(i).get("FirstName") + " " +myList.get(i).get("LastName");
            String str4 = String.format("%-20s|", str1);
            String str2 = String.format(" %-18s|", myList.get(i).get("Position"));
            String str3 = String.format(" %-20s",  myList.get(i).get("SeparationDate"));
            String OutputStringAdder ="\n" + str4 + str2 + str3;
            OutputString += OutputStringAdder;
        }
        return OutputString;
    }

    public static void InputGetter()
    {

        File file = new File("src/main/java/oop/assignment3/ex41/exercise41_input.txt");
        Scanner sc = new Scanner(file);
       // FileReader filereader = new FileReader("exercise41_input.txt");
        /*
        URL path = PersonSorter.class.getResource("exercise41_input.txt");
        File f = new File(path.getFile());
        BufferedReader reader = new BufferedReader(new FileReader(f));

        //BufferedReader br = new BufferedReader();
        //String line = null;
        //Path path = Paths.get("exercise41_input.txt");
        //Path absPath = path.toAbsolutePath();
        //System.out.printf("%s", absPath);
     */

       //Scanner sc = new Scanner(filereader);
       /*

        try {
            Scanner sc = new Scanner(filereader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Path path = Paths.get("exercise41_input.txt");
        //Path absPath = path.toAbsolutePath();
        //System.out.printf("%s", absPath);
*/

    }




}
