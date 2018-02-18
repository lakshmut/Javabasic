package com.collections.test;
 
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author lakshmut
 *
 */
public class CheckDuplicate {
 
	/**
	 * 
	 * @param input
	 */
    public void verifyDuplicate(String input){
         
        Map<Character, Integer> inputMap = new HashMap<Character, Integer>(); 
        char[] mapChars = input.toCharArray();
        for(Character ch:mapChars){
            if(inputMap.containsKey(ch)){
            	inputMap.put(ch, inputMap.get(ch)+1);
            } else {
            	inputMap.put(ch, 1);
            }
        }
        Set<Character> keylist = inputMap.keySet();
        for(Character ch:keylist){
            if(inputMap.get(ch) > 1){
                System.out.println("The character"+ch + "occurs :"+inputMap.get(ch)+" times in the input string");
            }
        }
    }
     
    /**
     * 
     * @param a
     */
    public static void main(String a[]){
        CheckDuplicate checkDuplicate = new CheckDuplicate();
        checkDuplicate.verifyDuplicate("Millenium Smiles");
    }
}