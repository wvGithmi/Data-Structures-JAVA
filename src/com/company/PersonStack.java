package com.company;

public class PersonStack {

    //Declaring variables
    private Person[] stack;
    private int top;
    private int size;

    //Forming constructors
    public PersonStack(){
        top = -1;
        size = 50;
        stack = new Person[50];
    }

    public PersonStack(int size){
        top = -1;
        this.size = size;
        stack = new Person[this.size];
    }

    //Push method
    public boolean Push(Person item){

        if(!isFull()) {
            top++;
            stack[top] = item;
            return true;
        }else{
            return false;
        }

    }

    //Pop method
    public Person  Pop(){
        return stack[top--];
    }

    //isFull method
    public boolean isFull(){
        return (top == stack.length - 1);
    }

    //isEmpty method
    public boolean isEmpty(){
        return (top == -1);
    }

}
