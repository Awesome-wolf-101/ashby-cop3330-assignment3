package oop.assignment3.ex46;

import java.util.*;
import java.util.*;
import java.lang.*;

public class WordFrequencyFinder {
    //this function finds the frequency of words in a string and stores them in a map
    public static Map<String, Integer> WordFrequencyFinder(String InputString) {
        // initialize a new map for storing the words and their frequencies
        Map<String, Integer> WordMap = new HashMap<>();
        //split the string based on spaces
        String arr[] = InputString.split(" ");
        //make a for loop
        for (int i = 0; i < arr.length; i++) {
            //if the word map contains an instance if the word in the array
            //add one to that word's frequency
            if (WordMap.containsKey(arr[i])) {
                WordMap.put(arr[i], WordMap.get(arr[i]) + 1);
            }
            //otherwise make a new entry inside of the map for a new word
            else {
                WordMap.put(arr[i], 1);
            }
        }
        //return the world map
        return WordMap;

    }
    // prints the frequency of the words present in a map
    public static String WordFrequencyPrinter(Map<String, Integer> WordMap) {
        //make an output string
        String OutPutString = "";
        //make a for loop
        for (Map.Entry<String, Integer> entry : WordMap.entrySet()) {
            //for every entry in the array add tha key and value expressed as a series
            //of "*" characters to the output strings
            OutPutString += entry.getKey() + ":" + CreateSpecialString(entry.getValue()) + "\n";
        }
        //return the output string
        return OutPutString;
    }
//creaters a sting of "*" characters based on a number
    public static String CreateSpecialString(int NumSpecialChar) {
        //create the output string
        String OutPutString = "";
        //make a for loop to add "*" characters to the output string a certain number of times
        for (int i = 0; i < NumSpecialChar; i++) {
            OutPutString += "*";
        }
        //return the output string
        return OutPutString;
    }


    // function to sort hashmap by values
    public static Map<String, Integer> sortByValue(Map<String, Integer> hm) {
        //create a new list of map entries
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hm.entrySet());

        //sort in reverse order usion the collections sort function
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });

        //clear the map
        hm= new LinkedHashMap<>();
        for (int i = 0; i <list.size(); i++)
        {
            hm.put(list.get(i).getKey(), list.get(i).getValue());
        }

        //return the new map
        return hm;
    }
}

