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

public class Application {
    public static void main(String[] args) throws FileNotFoundException{
        //create an isntance of person sorter and then sort all of the people
        //PersonSorter Ps = new PersonSorter();
        //Ps.InputGetter();
        FileReader file1 = new FileReader("src/main/java/oop/assignment3/ex41/exercise41_input.txt");
        Scanner sc = new Scanner(file1);


    }
}
        /* this worked temporarily for some reason
        try{
            FileReader file1 = new FileReader("src/main/java/oop/assignment3/ex41/exercise41_input.txt");
            Scanner sc = new Scanner(file1);
            String fileNames = sc.nextLine();
            while()
            {

            }
            file1.close();
        }
        catch (IOException e)
        {
          System.out.println(e);
        }

*/



        /*
        try{
            FileReader file1 = new FileReader("src/main/java/oop/assignment3/ex41/exercise41_input.txt");
            Scanner sc = new Scanner(file1);
            String fileNames = sc.nextLine();
            for(  fileNames : file1.list())
                System.out.println(fileNames);
        }
catch(Exception e){
    System.out.println("Something went wrong.");
        }
*/
        /*
        try {
            Scanner sc = new Scanner(file1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

         */
        /*
        File file = new File(".");
        for( String fileNames : file.list())
            System.out.println(fileNames);
        //System.out.println(System.getProperty("user.dir"));
*/
