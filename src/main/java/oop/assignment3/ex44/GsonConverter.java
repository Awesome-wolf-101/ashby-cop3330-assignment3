package oop.assignment3.ex44;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GsonConverter {
    //takes in a String and then turn it into list as a Json Item Class
    public static List<JsonItemClass> deserializeJsonFile( String GeneralInfo){
        //make a new type for the list
        Type JsonListType = new TypeToken<ArrayList<JsonItemClass>>(){}.getType();
        List<JsonItemClass> items = new Gson().fromJson(GeneralInfo, JsonListType);
        //returns the newly created list
        return items;
    }
    //make the string readable to Json
    public static String StringCutter( String InputString)
    {
        //split the string by the brackets and make a new string
        String[] arrOfStr = InputString.split("\\[");
        String NewString1 = arrOfStr[1];
        //split the newly created sting into another string
        String[] arrOfStr2 = NewString1.split("]");
        String NewString2 = arrOfStr2[0];
        //return the new string and add the square brackets back
        return"[" + NewString2 + "]";
    }
    //finds an item in a JsonItemClass list based on a search string and returns that instance JsonItemClass
    public static JsonItemClass FindItem( List<JsonItemClass> items, String SearchString){
        //loop through the items using a foor loop
        for(int i = 0; i < items.size(); i++)
        {
            //if the name is equal to the search string return that JsonItemCLass
            if(items.get(i).getName().equals(SearchString))
            {
            return items.get(i);
            }

        }
        //if the item cannot be found return null
        return null;
    }
    //returns a string based on the JsonItemGlass passed in
    public static String OutPutTime( JsonItemClass item)
    {
        //adds all the variables in the JsonItemClass to a string
String OutputString = "Name: " + item.getName() + "\n" + "Price: " + item.getPrice() + "\n" +"Quantity: " + item.getQuantity() + "\n";
//return the new string
return OutputString;
    }
}
