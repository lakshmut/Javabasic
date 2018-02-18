package com.other.program;
 
public class Fibinocci_Series {
 
    public static void main(String a[]){
         
         int count = 15;
         int[] fibinocci_array = new int[count];
         fibinocci_array[0] = 0;
         fibinocci_array[1] = 1;
         for(int i=2; i < count; i++){
        	 fibinocci_array[i] = fibinocci_array[i-1] + fibinocci_array[i-2];
         }
 
         for(int i=0; i< count; i++){
                 System.out.print(fibinocci_array[i] + " ");
         }
    }
}