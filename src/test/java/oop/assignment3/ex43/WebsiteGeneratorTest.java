package oop.assignment3.ex43;

import junit.framework.TestCase;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class WebsiteGeneratorTest extends TestCase {

    public void testWholeFunction() {
        File tmpDir = new File("C:\\Users\\joshu\\IdeaProjects\\untitled\\ashby-cop3330-assignment3\\website\\\\");
        boolean actual = tmpDir.exists();
        boolean expected = true;
        assertEquals(expected, actual);
    }

}