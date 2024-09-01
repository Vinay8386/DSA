package LinkedListCustomImpl.DoublyLL;

public class DLLNode {

    //attributes for DLL
    public int data;
    public DLLNode next;
    public DLLNode prev;

    // Constructor to initialize node with provided data value.
    // Set prev and next to null since a new node wouldn't have any previous or next nodes initially.
    public DLLNode(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
    // It allows you to create a node with data, and also specify the references to the previous and next nodes.
    // This is useful when you're inserting a node into an existing DLL or creating a new node with specific connections.
    public DLLNode(int data, DLLNode prev, DLLNode next){
        this.data=data;
        this.prev=prev;
        this.next=next;
    }
}
