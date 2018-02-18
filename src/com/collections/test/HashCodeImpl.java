package com.collections.test;
 
import java.util.HashMap;

/**
 * 
 * @author lakshmut
 *
 */
public class HashCodeImpl {
 
    public static void main(String a[]){
         
        HashMap<Seats, String> vehicleMap = new HashMap<Seats, String>();
        vehicleMap.put(new Seats("Cycle", 1), "Cycle");
        vehicleMap.put(new Seats("Bike", 2), "Bike");
        vehicleMap.put(new Seats("Car", 4), "Car");
        vehicleMap.put(new Seats("Bus", 20), "Bus");
        //creating new object to use as key to get value
        Seats seatHash = new Seats("Cycle", 1);
        System.out.println("Hashcode of the key: "+seatHash.hashCode());
        System.out.println("Value from map: "+vehicleMap.get(seatHash));
    }
}
 
/**
 * 
 * @author lakshmut
 *
 */
class Seats{
     
    private String name;
    private int numberOfSeats;
     
    public Seats(String name, int seat){
        this.name = name;
        this.numberOfSeats = seat;
    }
     
    public int hashCode(){
        System.out.println("Inside hashcode method");
        int hashcode = 0;
        hashcode = numberOfSeats;
        System.out.println("the name hashcode is :"+ name.hashCode());
        hashcode = name.hashCode();
        return hashcode;
    }
     
    public boolean equals(Object obj){
        System.out.println("Inside equals method");
        if (obj instanceof Seats) {
        	System.out.println("inside if block");
            Seats seat = (Seats) obj;
            return (seat.name.equals(this.name) && seat.numberOfSeats == this.numberOfSeats);
        } else {
        	System.out.println("inside else block");
            return false;
        }
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int count) {
        this.numberOfSeats = count;
    }
     
    public String toString(){
        return "name: "+name+"  numberOfSeats: "+numberOfSeats;
    }
}