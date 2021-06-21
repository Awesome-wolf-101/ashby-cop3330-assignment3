/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment3.ex42;

import oop.assignment3.ex42.Person;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            //read the file using a file reader and put said file reader into a scanner
            FileReader file1 = new FileReader("src/main/java/oop/assignment3/ex42/exercise42_input.txt");
            Scanner sc = new Scanner(file1);
            // make a string for reading and an arraylist for reading in the input
            String fileNames = sc.nextLine();
            List<Person> myList = new ArrayList<Person>();
            //while loop to read the file
            while(sc.hasNextLine() )
            {
                //split up the string and use that split array to make a new person
                String[] arrOfStr = fileNames.split(",");
                Person tempPerson = new Person(arrOfStr[1], arrOfStr[0], arrOfStr[2]);
                //add a new person to the list
                myList.add(tempPerson);
                //set up the next line
                fileNames = sc.nextLine();

                if (!sc.hasNextLine())
                {
                    //do this once again to make sure the file has been read
                    arrOfStr = fileNames.split(",");
                    tempPerson = new Person(arrOfStr[1], arrOfStr[0], arrOfStr[2]);

                    myList.add(tempPerson);
                    break;
                }


            }
            //close the file and make a new data parser
            file1.close();
            BasicDataParser basicdataparser = new BasicDataParser();
            //make an output string by passing in list, and output the data
            String OutPutString = basicdataparser.OutPutTime(myList);
            System.out.println(OutPutString);
            //close the file
            file1.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

    }
}
