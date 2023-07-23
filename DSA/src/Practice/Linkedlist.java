package Practice;

import LinkedlList.LinkedList;
import org.w3c.dom.Node;

public class Linkedlist {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public Linkedlist(int value){
        Node n=new Node(value);
        head=n;
        tail=n;
        length=1;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void append(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }
    public Node removeLast(){
        if(length==0) return null;
        Node temp=head;
        Node pre=head;
        while(temp.next!=null){
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if(length==0){
            tail=null;
            head=null;
        }
        return temp;
    }
    public void prePend(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        length++;
    }
    public Node removeFirst(){
        if(length==0){
            return null;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;
        length--;
        if(length==0){
            tail=null;
        }
        return temp;
    }
    public Node get(int index){
        if(index<0 || index>=length){
            return null;
        }
        Node n=head;
        for(int i=0;i<i;i++){
            n=n.next;
        }
        return  n;
    }



}


