package oop.assignment3.ex44;

import junit.framework.TestCase;

import java.util.Scanner;

public class GsonConverterTest extends TestCase {
    public void testStringCutter() {
        GsonConverter gsonconverter = new GsonConverter();
        String StringToCut = "memes are [not] cool";
        String actual = gsonconverter.StringCutter(StringToCut);
        String expected = "[not]";
        assertEquals(expected, actual);
    }

    public void testOutPutTime() {
        GsonConverter gsonconverter = new GsonConverter();
        JsonItemClass item = new JsonItemClass();
        item.name = "Thing";
        item.price = 0.00;
        item.quantity = 0;
        String actual = gsonconverter.OutPutTime(item);
        String expected = "Name: " + "Thing" + "\n" + "Price: " + 0.00 + "\n" +"Quantity: " + 0 + "\n";
        assertEquals(expected, actual);
    }
}