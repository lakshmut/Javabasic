package com.collections.test;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
 
public class SortValue {
 
    public static void main(String a[]){
        Map<String, Integer> fruitsMap = new HashMap<String, Integer>();
        fruitsMap.put("apple", 9);
        fruitsMap.put("mango", 100);
        fruitsMap.put("orange", 40);
        fruitsMap.put("grapes", 52);
        fruitsMap.put("banana", 25);
        fruitsMap.put("pineapple", 79);
        fruitsMap.put("pomegranate", 66);
        fruitsMap.put("guava", 18);
        fruitsMap.put("chikku", 94);
        fruitsMap.put("water melon", 35);
        Set<Entry<String, Integer>> fruitSet = fruitsMap.entrySet();
        List<Entry<String, Integer>> fruitList = new ArrayList<Entry<String, Integer>>(fruitSet);
        Collections.sort( fruitList, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2 )
            {
                return (obj1.getValue()).compareTo( obj2.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> sortedMap:fruitList){
            System.out.println("The sorted map key and values are :"+sortedMap.getKey() +", "+ sortedMap.getValue());
        }
    }
}