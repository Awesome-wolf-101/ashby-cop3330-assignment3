package oop.assignment3.ex41;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class PersonSorterTest extends TestCase {

    public void testSortPersonMapList() {
        PersonSorter personsorter = new PersonSorter();
        List<Person> myList = new ArrayList<Person>();
        Person tempPerson2 = new Person("Bean", "Barrel");
        Person tempPerson1 = new Person("Joshua", "Ashby");
        myList.add(tempPerson1);
        myList.add(tempPerson2);
        myList = personsorter.SortPersonMapList(myList);
        String actual = myList.get(0).getFirstName();
        String expected = "Joshua";

        assertEquals(expected, actual);
    }

}