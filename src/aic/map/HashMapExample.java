package aic.map;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample {
    public static void main(String args[]) {
        // create hash map
        HashMap<Integer, String> newmap = new HashMap();

        // populate hash map
        newmap.put(1, "tutorials");
        newmap.put(2, "point");
        newmap.put(2, "point2");
        newmap.put(3, "is best");

        System.out.print(newmap.get(2));
        // get keyset value from map
        Set<Integer> keyset=newmap.keySet();

        // check key set values
        System.out.println("Key set values are: " + keyset);

        // Todo: Find out in what kind of sort does HashMap store its elements.
    }
}

