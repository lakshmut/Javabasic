package com.test.threads;

import com.test.objects.SavingsAccount;
 
public class Ddeadlock {
 
    SavingsAccount account1 = new SavingsAccount();
    
    SavingsAccount account2 = new SavingsAccount(); 
    
    Thread thread1 = new Thread("First Thread"){
        public void run(){
            while(true){
                synchronized(account1){
                    synchronized(account2){
                        System.out.println(account1.getBalance() + account2.getBalance());
                    }
                }
            }
        }
    };
     
    Thread thread2 = new Thread("Second Thread"){
        public void run(){
            while(true){
                synchronized(account1){
                    synchronized(account2){
                        System.out.println(account2.getBalance() + account1.getBalance());
                    }
                }
            }
        }
    };
     
    public static void main(String a[]){
        Ddeadlock mdl = new Ddeadlock();
        mdl.thread1.start();
        mdl.thread2.start();
    }
}