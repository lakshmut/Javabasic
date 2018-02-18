package com.test.objects;
 
/**
 * 
 * @author lakshmut
 *
 */
public class Singleton {
 
    private static Singleton obj;
     
    static{
        obj = new Singleton();
    }
     
    private Singleton(){
     
    }
    
    /**
     * 
     * @return
     */
    public static Singleton getInstance(){
        return obj;
    }
     
    /**
     * 
     */
    public void checkSingleton(){
        System.out.println("Accessing singleton using getInstance only");
    }
     
    /**
     * 
     * @param a
     */
    public static void main(String a[]){
        Singleton ms = getInstance();
        ms.checkSingleton();
    }
}