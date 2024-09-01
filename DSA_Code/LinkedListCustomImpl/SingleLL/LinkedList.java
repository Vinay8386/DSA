package LinkedListCustomImpl.SingleLL;

public class LinkedList {

    //Length of the LinkedList
    private int length=0;

    //Default constructor
    LinkedList(){
        this.length=0;
    }

    ListNode head;
    //Return the first node/head in the list
    public synchronized ListNode getHead(){
        return head;
    }

    //Insert a node at the beginning of the list
    public synchronized void insertAtBegin(ListNode newNode){
        newNode.next=head;
        head=newNode;
        length++;
    }

    //Insert a node at the end of the list
    public synchronized void insertAtEnd(ListNode newNode){
        /*if(head==null){
            head=newNode;
        }else {
            ListNode p,q;
            for (p=head;(q=p.next)!=null;p=q);
            p.next=newNode;
        }
        length++;*/
        if(head==null){             //second way using while loop
            head=newNode;
        }else {
            ListNode temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        length++;
    }

    //Add a new value to the List at a given position
    public void insert(int data, int position){
        //fix the position
        if(position<0){
            position=0;
        }
        if(position>length){
            position=length;
        }
        //If the list is empty, make it first element
        if(head==null){
            head=new ListNode(data);
        } else if (position==0) {   //if adding at the front of the list
            ListNode newNode=new ListNode(data);
            newNode.next=head;
            head=newNode;
        } else {                //find the correct position and insert
            ListNode newNode=new ListNode(data);
            ListNode temp=head;
            for (int i = 1; i <position ; i++) {
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        length++;
    }
    //Remove and return the node at the head of the list
    public synchronized ListNode removeFromBegin(){
        ListNode temp=head;
        if(temp!=null){
            head=temp.next;
            temp.next=null;
        }
        return temp;
    }
    //Remove and return the node at the end of the list
    public synchronized ListNode removeFromEnd(){
        if(head==null) {
            return null;
        }
        if(head.next==null){
            ListNode removedNode = head;
            head = null; // Single-node list
            return removedNode;
        }
        ListNode temp = head;
        ListNode tail = head.next;
        while (tail.next != null) {
            temp = tail;
            tail = tail.next;
        }
        temp.next = null; // Disconnect the second-to-last node from the last node
        return tail; // Return the removed last node
    }
    //Remove a node matching the specific node from the list
    //Use equal() instead of == to test for a matched node
    public synchronized void removeMatchedNode(ListNode node){
        if(head==null){
            return;
        }
        if(node.equals(head)){
            head=head.next;
            return;
        }
        ListNode p=head, q=null;
        while ((q=p.next)!=null){
            if(node.equals(q)){   //Make sure equals method will do content comparison not reference comparison
                p.next=q.next;
                return;
            }
            p=q;
        }
    }
    //Remove the value at given position.
    //If the position is less than (), remove the value at first position.
    //If the position is greater than (), remove the value at last position.
    public void remove(int position){
        //fix the position
        if(position<0){
            position=0;
        }
        if(position>=length){
            position=length-1;
        }
        //For empty list do nothing
        if(head==null) return;

        //if removing the head element remove head else find correct position and remove
        if(position==0) {
            head=head.next;
        } else {
            ListNode temp=head;
            for (int i = 1; i < position; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        length--;
    }

    //Return a String representation of this collection in the form of ["str1","str2",....]
    public String toString(){
        String result="[";
        if(head==null){
            return result+"]";
        }
        result=result+head.data;
        ListNode temp=head.next;
        while (temp!=null){
            result=result+","+temp.data;
            temp=temp.next;
        }
        return result+"]";
    }
    //Return the current length of the list
    public int length(){
        return length;
    }
    //Find the position of the first value that is equal to a given value
    //The equal value is not used to determine equality
    public int getPosition(int data){
        ListNode temp=head;
        int posOfData=0;
        while (temp!=null){
            if(temp.data==data){
                return posOfData; //return position if found
            }
            temp=temp.next;
            posOfData++;
        }
        // Else return -1 if value is not found
        return -1;
    }
    //Remove everything from the list
    public void clearList(){
        head=null;
        length=0;
    }
}
