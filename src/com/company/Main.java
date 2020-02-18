package com.company;

public class Main {

    public static void main(String[] args) {

        //Stack Coding
        System.out.println("Stack Coding");
        IntStack stk = new IntStack();

        if(!stk.isFull()){
            stk.Push(5);
            stk.Push(9);
            stk.Push(10);
            stk.Push(-2);
        }

        System.out.println(stk.Pop());
        System.out.println(stk.Pop());

        Person pr1 = new Person("Githmi", "111");
        Person pr2 = new Person("Bimali", "112");
        Person pr3 = new Person("Chamodi", "113");

        PersonStack prStk = new PersonStack();

        prStk.Push(pr1);
        prStk.Push(pr2);
        prStk.Push(pr3);

        System.out.print("\n");
        System.out.println(prStk.Pop().toString());
        System.out.println(prStk.Pop().toString());
        System.out.println(prStk.Pop().toString());
        System.out.print("\n\n");

        //DeQueue Coding
        System.out.println("Dequeue Coding");
        IntQue q = new IntQue();

        q.EnQue(3);
        q.EnQue(4);
        q.EnQue(5);

        System.out.println(q.DeQue());
        System.out.println(q.DeQue());
        System.out.println(q.DeQue());

        //System.out.println("\n");
        //q.showAll();

        System.out.print("\n");

        PersonQue prq = new PersonQue();

        prq.EnQue(new Person("Pasindu", "124"));
        prq.EnQue(new Person("Sunanda", "125"));
        prq.EnQue(new Person("Padma", "126"));

        prq.showAll();
    }

}
