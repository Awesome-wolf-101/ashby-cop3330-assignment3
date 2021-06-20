package oop.assignment3.ex46;

import junit.framework.TestCase;

import java.util.Map;

public class WordFrequencyFinderTest extends TestCase {

    public void testWordFrequencyFinder() {
        WordFrequencyFinder wordfrequencyfinder = new WordFrequencyFinder();
        Map<String,Integer> WordMap =  wordfrequencyfinder.WordFrequencyFinder("Badger Badger Badger");
        int expected = 3;
        int actual = WordMap.get("Badger");
        assertEquals(expected, actual);
    }

    public void testWordFrequencyPrinter() {
        WordFrequencyFinder wordfrequencyfinder = new WordFrequencyFinder();
        Map<String,Integer> WordMap =  wordfrequencyfinder.WordFrequencyFinder("Badger Badger Badger");
        String actual = wordfrequencyfinder.WordFrequencyPrinter(WordMap);
        String expected = "Badger:" + "***" + "\n";
        assertEquals(expected, actual);
    }

    public void testCreateSpecialString() {
        WordFrequencyFinder wordfrequencyfinder = new WordFrequencyFinder();
        String actual = wordfrequencyfinder.CreateSpecialString(3);
        String expected = "***";
        assertEquals(expected, actual);
    }

    public void testSortByValue() {
        WordFrequencyFinder wordfrequencyfinder = new WordFrequencyFinder();
        Map<String,Integer> WordMap =  wordfrequencyfinder.WordFrequencyFinder("Badger Badger Badger Meme Meme Meme Meme Meme");
        WordMap =  wordfrequencyfinder.sortByValue(WordMap);
        int actual = (int) WordMap.values().toArray()[0];
        int expected = 5;



        assertEquals(expected, actual);
    }
}