package oop.assignment3.ex46;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            //make a new file reader based on the current directory and pass that file reader
            //into a new scanner
            FileReader file1 = new FileReader("src/main/java/oop/assignment3/ex46/exercise46_input.txt");
            Scanner sc = new Scanner(file1);
            //make an input string to read the file
            String InputString = "";
            //make a while loop to read each line of the file
            while (sc.hasNextLine()) {
                //add each line to a string
                String TempString = sc.nextLine();
                InputString +=   TempString + " ";
            }
            //create a new instance of the wordfrequency finder class
            WordFrequencyFinder wordfrequencyfinder = new WordFrequencyFinder();
            //make a new map to hold in the result of the word frequency finder after
            //passing in the input string
            Map<String,Integer> WordMap =  wordfrequencyfinder.WordFrequencyFinder(InputString);
            //make another map to hold in the result of the sort by value function after
            //passing in the old map
            Map<String,Integer> WordMap2 =  wordfrequencyfinder.sortByValue(WordMap);
            //make the output string by passing in the new map to the word frequency printer function
            String OutPutString = wordfrequencyfinder.WordFrequencyPrinter(WordMap2);
            //print out the output string
            System.out.println(OutPutString);


        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
