package com.company;

public class IntLinkedList {

    //Global property of the class
    private Node head;

    //Forming constructors
    public IntLinkedList(){
        head = new Node();
        head.value = 0;
        head.link = null;
    }

    //insertFront method
    public boolean insertFront(int item){

        Node n = new Node();
        n.value = item;
        n.link = head;
        head = n;
        return true;

    }

    //insertRear method
    public boolean insertRear(int item){

        Node n = new Node();
        Node new_node;
        new_node = head;
        while (new_node.link != null){
            new_node = new_node.link;
        }
        n.value = item;
        n.link = null;
        new_node.link = n;
        return true;

    }

    //printList method
    public void printList(){

        Node x = head.link;
        while (x != null){
            System.out.println(x.value);
            x = x.link;
        }

    }

    //deleteItem method
    public boolean deleteItem(int item){

        if (head.link.value == item){ //if(head.value == item)
            head.link = head.link.link; //head = head.link;
            return true;
        }else{
            Node y = head;
            Node z = head.link;
            while (true){
                if(z == null || z.value == item){
                    break;
                }else {
                    y = z;
                    z = z.link;
                }
            }
            if(y != null){
                y.link = z.link;
                return true;
            }else{
                return false;
            }
        }
    }

    //sortList method
    public void sortList(){

        int temp = 0;
        Node a = head.link;
        while (a.link != null){
            Node b = head.link;
            while (b.link != null){
                if (b.value < b.link.value){
                    temp = b.value;
                    b.value = b.link.value;
                    b.link.value = temp;
                }
                b = b.link;
            }
            a = a.link;
        }

    }

    //Child class
    class Node{
        private int value;
        private Node link;
    }

}
