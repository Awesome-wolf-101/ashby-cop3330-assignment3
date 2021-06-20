package oop.assignment3.ex42;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class BasicDataParserTest extends TestCase {

    public void testOutPutTime() {
        BasicDataParser basicdataparser = new BasicDataParser();
        List<Person> myList = new ArrayList<Person>();
        Person tempPerson = new Person("Joshua", "Ashby", "1,000,000");
        myList.add(tempPerson);
        String actual = basicdataparser.OutPutTime(myList);
        String strx = String.format("%-20s", "Last ");
        String stry = String.format(" %-20s", "First" );
        String strz = String.format(" %-20s", "Salary");
        String OutPutString = ""+ strx + stry + strz + "\n------------------------------------------------";
        String expected = OutPutString + "\n" +
                "Ashby                Joshua               1,000,000" + "           ";

        assertEquals(expected, actual);
    }
}