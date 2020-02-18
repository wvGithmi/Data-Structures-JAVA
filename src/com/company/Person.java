package com.company;

public class Person {

    //Declaring variables
    public String name;
    public String roll_no;

    //Forming constructors
    public Person(String name, String roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }

    //getName method
    public String getName(){
        return name;
    }

    public String toString(){
        return "Name : " + this.name + "   Roll No : " + this.roll_no;
    }
}
