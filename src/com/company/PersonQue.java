package com.company;

public class PersonQue {

    //Declaring variables
    private Person[] que;
    private int size;
    private int tot;
    private int front;
    private int rear;

    //Forming constructors
    public PersonQue(){
        size = 100;
        tot = 0;
        front = 0;
        rear = 0;
        que = new Person[size];
    }

    public PersonQue(int size){
        this.size = size;
        tot = 0;
        front = 0;
        rear = 0;
        que = new Person[this.size];
    }

    //EnQue method
    public boolean EnQue(Person item){

        if (!isFull()){
            tot++;
            que[rear] = item;
            rear = (rear + 1) % size;
            return true;
        }else{
            return false;
        }

    }

    //DeQue method
    public Person DeQue(){

        Person item = que[front];
        tot--;
        front = (front + 1) % size;
        return item;

    }
    //isFull method
    public boolean isFull(){

        if(size == tot){
            return true;
        }else{
            return false;
        }

    }

    //showAll method
    public void showAll(){

        int f = front;
        if(tot != 0) {
            for (int i = 0; i < tot; i++) {
                System.out.println(" " + que[f].toString());
                f = (f + 1) % size;
            }
        }

    }
}
