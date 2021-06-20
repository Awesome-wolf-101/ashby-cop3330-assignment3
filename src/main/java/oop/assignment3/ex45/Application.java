package oop.assignment3.ex45;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            //make a new file reader based on the input class and pass that filereader into a scanner
            FileReader file1 = new FileReader("src/main/java/oop/assignment3/ex45/exercise45_input.txt");
            Scanner sc = new Scanner(file1);
            //make a new input string to read the file
            String InputString = "";
            //make a while loop fow while the scanner has a next line
            while (sc.hasNextLine()) {
                //add the temp string to the input string to make a string for the whole file
                String TempString = sc.nextLine();
                InputString +=   TempString + "\n";
            }
            //make a scanner for the console
            Scanner in = new Scanner(System.in);
            //prompt for the name of the file and store it in a string
            System.out.println("What should the name of the outputfile be?");
            String OutPutFileName = in.nextLine();
            //make a new instance of the wordfinderclass and pass the user's answer
            //string into the word replacer function and store the answer in a new string
            WordFinder wordfinder = new WordFinder();
            String OutPutString = wordfinder.WordReplacer(InputString);
            //print out the new string to the file using the file writer function
            wordfinder.FileWriter(OutPutString,OutPutFileName);



        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
