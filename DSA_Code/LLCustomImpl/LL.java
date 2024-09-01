package LLCustomImpl;

import java.util.LinkedList;

public class LL {
    //LinkedList have node, head, tail & size
    private Node head;
    private Node tail;
    private int size;

    //Default Constructor
    public LL(){
        this.size=0;
    }

    public class Node {

        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }

    //display the element of the list
    public void display(){
        Node temp=head; //Create a reference of Node which will move to whole LL and LL structure will remain same
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
    }

    //Insert element at first position in given linked-list
    public void insertFirst(int value){
        //create a new node
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    //Insert at last index
    public void insertLast(int value){
        //If tail is null means no element is present in the list
        if(tail==null){
            insertFirst(value);
        }
        //create a new node
        Node n=new Node(value);
        tail.next=n;
        tail=n;
        size+=1;
    }
    //Insert element at particular index
    public void insertAtIndex(int value, int index){

        //chceck for first index
        if(index==0){
            insertFirst(value);
        }
        //Check for last index
        if(index==size){
            insertLast(value);
        }
        Node temp=head;
        int i=0;
        while (i<index-1){
            temp=temp.next;
            i++;
        }
        //create a new node and point it to the third index node
        Node newNode=new Node(value,temp.next);
        temp.next=newNode;
        size++;
    }

    //Insertion using recursion
    public void insertValueAtIndexUsingRec(int value, int index){
        head=insertValueAtIndexUsingRec(value,index,head); //passing head as parameter doesn't directly modify the structure of the linked list
        //Instead, it allows the method to access the current state of the linked list (i.e., the reference to the head node) during the recursive insertion process.
        //Assigning method result in head: In a linked list, when you insert a new node at a specific index, if that index is 0, the new node becomes the new head of the list. Therefore, after inserting the node at index 0, the head pointer needs to be updated to point to this new node.
        //after assigning newNode as head the previous node automatically point to newNode and remove its pointer from previous head node.
    }
    public Node insertValueAtIndexUsingRec(int value, int index,Node node){
        if(index==0){
            Node newNode=new Node(value,node);
            size++;
            return newNode;
        }
        node.next=insertValueAtIndexUsingRec(value,index-1,node.next);
        return node;
    }

    //delete first element and return deleted value
    public int deleteFirst(){
        int value=head.value;
        head=head.next;
        //If LL have only one element in this case, tail will still point to that element but head will point null
        if(head==null){
            tail=null;
        }
        return value;
    }
    //delete last element of ll
    public int deleteLast(){
        //If no element is available
        if(tail==null){
            return -1;
        }
        //If only one element is present
        if(head==tail){
            int deletedValue= head.value;
            head=null;
            tail=null;
            return deletedValue;
        }
        //If we have more than one element
        int value=tail.value;
        //get refrence of the second last element
        Node secondLast=get(size-2);
        tail=secondLast;
        tail.next=null;
        return value;
    }

    //deleteAtIndex
    public int deleteAtParticularIndex(int index){
        if(index==0){
            deleteFirst();
        }
        if(index==size){
            deleteLast();
        }
        Node prevIndex=get(index-1);
        int deletedValue=prevIndex.next.value;
        Node temp=prevIndex.next;
        prevIndex.next=prevIndex.next.next;
        temp.next=null;
        return deletedValue;
    }
    //getFirst
    public Node getFirstIndex() {
        return head;
    }

    //getLast
    public Node getLastIndex(int index) {
        return tail;
    }

    //Get reference of particular index
    public Node get(int index) {
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }
    //traverse
    //get length of LL
    public int getLength(){
        int count=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    //updateAtIndex
    public void updateAtIndex(int newValue, int index){
        Node updateIndex=get(index);
        updateIndex.value=newValue;
    }
}
