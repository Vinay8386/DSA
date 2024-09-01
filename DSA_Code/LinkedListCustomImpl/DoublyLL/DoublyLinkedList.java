package LinkedListCustomImpl.DoublyLL;

public class DoublyLinkedList {

    //field needed for the list
    private DLLNode head;
    private DLLNode tail;
    private  int length;

    //create an empty list
    public DoublyLinkedList(){
        head=new DLLNode(Integer.MIN_VALUE,null,null);
        tail=new DLLNode(Integer.MIN_VALUE,null,null);
        head.next=tail;
        length=0;
    }

    //Get length of the list
    public int length(){
        return length;
    }

    //Get the data at specific position
    public int get(int position){
        if(position<0 || position>length){
            return Integer.MIN_VALUE;
        }
        DLLNode temp=head;
        for (int i = 0; i < position; i++) {
            temp=temp.next;
        }
        return temp.data;
    }

    //Insert at the begining of the list
    public void insertAtBegin(int value){
        DLLNode newNode=new DLLNode(value,null,head);
        newNode.next.prev=newNode;
        length++;
    }
    //Insert at specific position of the list
    //Insert at the end of the list
}
