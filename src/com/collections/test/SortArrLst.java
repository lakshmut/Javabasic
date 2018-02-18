package com.collections.test;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class SortArrLst {
     
    public static void main(String a[]){
         
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Mahesh",650));
        list.add(new Student("Timothy",800));
        list.add(new Student("Sandhya",900));
        list.add(new Student("Kavitha",350));
        Collections.sort(list,new ScoreComparator());
        System.out.println("Sorted list entries: ");
        for(Student e:list){
            System.out.println(e);
        }
        
        Collections.reverse(list);
        System.out.println("Results after reversing content:");
        for(Student stdt: list){
            System.out.println(stdt);
        }
    }
}
 
class ScoreComparator implements Comparator<Student>{
 
    
    public int compare(Student e1, Student e2) {
        if(e1.getMarks() < e2.getMarks()){
            return 1;
        } else {
            return -1;
        }
    }
}
 
class Student{
     
    private String name;
    private int marks;
     
    public Student(String n, int s){
        this.name = n;
        this.marks = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String toString(){
        return "Name: "+this.name+"-- Marks: "+this.marks;
    }
}