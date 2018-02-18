package com.collections.test;
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
 
public class IterateCollctns {
 
    public static void main(String a[]){
         
        List<String> fruitList = new ArrayList<String>();
        fruitList.add("Apple");
        fruitList.add("Mango");
        fruitList.add("Orange");
        fruitList.add("Grape");
        fruitList.add("Banana");
        Iterator<String> itr = fruitList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        
        //using List iterator
        ListIterator<String> litr = null;
        litr = fruitList.listIterator();
        System.out.println("Elements in forward directiton");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("Elements in backward directiton");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}