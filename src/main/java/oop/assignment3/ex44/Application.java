package oop.assignment3.ex44;

import com.google.gson.Gson;
import oop.assignment3.ex41.Person;
import oop.assignment3.ex41.PersonSorter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {
        try{
            //read the file in by using the path and passing it into file reader
            //then pass that file reader into a scanner and intialize an input string
            FileReader file1 = new FileReader("src/main/java/oop/assignment3/ex44/exercise44_input.json");
            Scanner sc = new Scanner(file1);
            String InputString = "";
            //make a while loop and read in the input string
            while(sc.hasNextLine() )
            {
                String TempString = sc.nextLine();
            InputString += TempString;
            }
            //make a new instance of GsonConverter and use string cutter to
            //make the input more readable
            GsonConverter gsonConverter = new GsonConverter();
             String InputString2 = gsonConverter.StringCutter(InputString);
             //make a new list by deserializeing the Json File
            List<JsonItemClass> items = gsonConverter.deserializeJsonFile(InputString2);
            //make a new scanner and make a while loop to take in user input.
            Scanner in = new Scanner(System.in);
            while(true)
            {
                //prompt for and then search for the product name
                System.out.println("What is the product name?");
                String SearchString = in.nextLine();
                if (gsonConverter.FindItem(items, SearchString ) == null)
                {
                    System.out.println("Sorry, that product was not found in our inventory.");
                }
                //if the object is found print out the details using "OutPutTime"
                //and break out of the loop
                else
                {
                  JsonItemClass item = gsonConverter.FindItem(items, SearchString );
                    String OutPutString  = gsonConverter.OutPutTime(item);
                    System.out.println(OutPutString);

                    break;
                }

            }



        }
        catch (IOException e)
        {
            System.out.println(e);
        }

    }
}
