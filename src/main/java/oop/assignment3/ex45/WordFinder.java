package oop.assignment3.ex45;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WordFinder {
    //replaces all forms of the word "utilize" with the word "use"
    public static String WordReplacer(String InputString){
        //creates a new string that is the result of replacing
        //all instances of "utilize" with "use"
        String OutPutString = "";
        OutPutString = InputString.replaceAll( "utilize" , "use" );
        //return the new string
        return OutPutString;
    }
    //writes an inputstring to a file based on the newfilename
    public static void FileWriter(String InputString, String NewFileName){
        //get the current user directoty then add the new file name to
        // that string and pass it into a new file object
        File file4 = new File( System.getProperty("user.dir") + NewFileName);
        try {
            //create a newphile based on the new file object
            file4.createNewFile();
            //make a new filewrite using the newfilename
            FileWriter myWriter = new FileWriter(NewFileName + ".txt");
            //write the input to the file and close the file writer
            myWriter.write(InputString);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
