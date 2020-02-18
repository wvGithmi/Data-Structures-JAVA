package com.company;

public class IntStack {

    //Declaring variables
    private int[] stack;
    private int top;
    private int size;

    //Forming constructors
    public IntStack(){
        top = -1;
        size = 50;
        stack = new int[50];
    }

    public IntStack(int size){
        top = -1;
        this.size = size;
        stack = new int[this.size];
    }

    //Push method
    public boolean Push(int item){

        if(!isFull()) {
            top++;
            stack[top] = item;
            return true;
        }else{
            return false;
        }

    }

    //Pop method
    public int  Pop(){
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
