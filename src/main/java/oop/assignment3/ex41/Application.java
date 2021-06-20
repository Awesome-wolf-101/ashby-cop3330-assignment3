package oop.assignment3.ex41;

import java.io.*;
import java.util.Scanner;
import java.io.*;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileReader;

import static java.lang.System.load;

public class Application {
    public static void main(String[] args) throws FileNotFoundException{

        try{
            //make a file reader that corresponds to the correct file
            FileReader file1 = new FileReader("src/main/java/oop/assignment3/ex41/exercise41_input.txt");
            //make a scanner to read from the file
            Scanner sc = new Scanner(file1);
            //make a new string to take in the new names and a new list
            // to hold a group of people
            String fileNames = sc.nextLine();
            List<Person> myList = new ArrayList<Person>();
            //set a variable for the number of names and set it to zero
            int NumNames=0;
            //make a while loop to read in data from the file
            while(sc.hasNextLine() )
            {
                //split each line by a "," and make a new person based on the first
                //and last name
                String[] arrOfStr = fileNames.split(",");
                Person tempPerson = new Person(arrOfStr[1], arrOfStr[0]);
                //put a new person in the list and add one to the number of names
                //then go to the next line
                myList.add(tempPerson);
                NumNames++;
                fileNames = sc.nextLine();

                if (!sc.hasNextLine())
                {
                    //do this one more time to account for the number of lines
                     arrOfStr = fileNames.split(",");
                     tempPerson = new Person(arrOfStr[1], arrOfStr[0]);
                    myList.add(tempPerson);
                    NumNames++;
                    break;
                }


            }
            //close the file
            file1.close();
            //make a new person sorter
            PersonSorter personsorter = new PersonSorter();
            //sort the new list
            personsorter.SortPersonMapList(myList);
            //make an output string using the OutPutTime function
            String OutPutString = personsorter.OutPutTime(myList, NumNames);
            personsorter.FileWriter(OutPutString);
            //print out the output string
            System.out.println(OutPutString);
            file1.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }


    }
}

