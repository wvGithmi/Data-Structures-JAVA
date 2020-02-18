package com.company;

public class PersonLinkedList {

    //Global property of the class
    private Node head;

    //Forming constructors
    public PersonLinkedList(Person person){
        head = new Node();
        head.person = person;
        head.link = null;
    }

    //insertFront method
    public boolean insertFront(Person person){

        Node n = new Node();
        n.person = person;
        n.link = head;
        head = n;
        return true;

    }

    //insertRear method
    public boolean insertRear(Person person){

        Node n = new Node();
        Node new_node;
        new_node = head;
        while (new_node.link != null){
            new_node = new_node.link;
        }
        n.person = person;
        n.link = null;
        new_node.link = n;
        return true;

    }

    //printList method
    public void printList(){

        Node x = head;
        while (x != null){
            System.out.println(x.person.toString());
            x = x.link;
        }

    }

    //deleteItem method
    public boolean deleteItem(String name){

        if (name.equals(head.person.getName())){
            head.link = head.link.link; //head = head.link;
            return true;
        }else{
            Node y = head;
            Node z = head.link;
            while (z == null && !(z.person.getName().equals(name))){
                y = z;
                z = z.link;
            }
            if(y != null){
                y.link = z.link;
                return true;
            }else{
                return false;
            }
        }

    }

    //Child class
    class Node{
        private Person person;
        private Node link;
    }
}
