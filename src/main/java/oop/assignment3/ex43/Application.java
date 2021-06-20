package oop.assignment3.ex43;

import java.io.File;
import java.io.FileNotFoundException;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        //makes a new instance of website generator and calls all of the necessary methods
        //from main to create the directories
        WebsiteGenerator websiteGenerator = new WebsiteGenerator();
        websiteGenerator.InputTime();
        websiteGenerator.JsDirectoryMaker();
        websiteGenerator.CSSDirectoryMaker();
        websiteGenerator.HTMLFileMaker();

    }
}
