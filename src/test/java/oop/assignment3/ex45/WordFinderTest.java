package oop.assignment3.ex45;

import junit.framework.TestCase;
import oop.assignment3.ex44.GsonConverter;
import oop.assignment3.ex44.JsonItemClass;

public class WordFinderTest extends TestCase {

    public void testWordReplacer() {
        WordFinder wordfinder = new WordFinder();
        String actual = wordfinder.WordReplacer("Don't utilize utilize");
        String expected = "Don't use use";
        assertEquals(expected, actual);
    }
}