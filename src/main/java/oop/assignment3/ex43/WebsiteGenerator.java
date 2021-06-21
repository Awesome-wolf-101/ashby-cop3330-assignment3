/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Joshua Ashby
 */
package oop.assignment3.ex43;

import oop.assignment3.ex42.Person;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.lang.String;
import java.lang.*;

public class WebsiteGenerator {
//declare a series of private and static string as well as a file
    private static final Scanner in = new Scanner(System.in);
    private static String  inputString1;
    private static String  inputString2;
    private static String  inputString3;
    private static String  inputString4;
    private static String Pathname1 = System.getProperty("user.dir") + "@";
    private static String Pathname = Pathname1.replaceAll("@","\\\\");
    private static File file1 = new File(Pathname);
    public static void InputTime()
    {
        //prompt for the input to store into strings
        //which will help to create a new file
        System.out.println("Site name: ");
        inputString1 = in.nextLine();
        System.out.println("Author:");
        inputString2 = in.nextLine();
        System.out.println("Do you want a folder for JavaScript? ");
        inputString3 = in.nextLine();
        System.out.println("Do you want a folder for CSS? ");
        inputString4 = in.nextLine();
        //add website directory to the path name and
        //make a new directory using that pathname
        Pathname += "website"  + "\\\\";
         file1 = new File(Pathname);
         //make a new directory for the site name
        Pathname += inputString1 + "\\\\";
        File file5 = new File(Pathname);
        file5.mkdirs();
        //print out the path of the new file
        System.out.println("Created " + Pathname);
    }
    //make a new js directory
    public static void JsDirectoryMaker()
    {
        //if the user enters yes
        if(inputString3.equals("y"))
        {
            //make a new directory and print out that it has been created
            File file3 = new File(Pathname + "js\\\\");
            System.out.println("Created " + Pathname + "js\\\\");
             file3.mkdirs();
        }

    }
    //make a new css directory
    public static void CSSDirectoryMaker()
    {
        if(inputString4.equals("y"))
        {
            //make a new directory and print out that it has been created
            File file2 = new File(Pathname + "css\\\\");
            System.out.println("Created " + Pathname + "css\\\\");
            file2.mkdirs();
        }

    }
    //make a new html directory
    public static void HTMLFileMaker()
    {
        //make a new file and print out that it has been created
        File file4 = new File(Pathname + "index.html");
        System.out.println("Created " + Pathname + "index.html");
        try {

             file4.createNewFile();
             //make a file writer and write the author and site name inside of a meta and title tag
            FileWriter myWriter = new FileWriter(Pathname + "index.html");
            myWriter.write("<title>" + inputString1+ "</title>" + "\n" + "<meta>" + inputString2+ "</meta>");
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
