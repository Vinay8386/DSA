package Collection.LinkedList;

//
public class LL {
    private Node head; //pointer pointing to the node
    private Node tail; //pointer pointing to the node
    private int size;
    public LL() {
        this.size = 0; //assign intial size is zero
    }

    //Define Node
    class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    //Method to get head value
    public void getHead(){
        if(head==null){
            System.out.println("Head is null");
        }else{
            System.out.println("value of head is : "+head.value);
        }
    }
    //Method to get tail value
    public void getTail(){
        if(tail==null){
            System.out.println("tail is null");
        }else{
            System.out.println("Value of tail is : "+tail.value);
        }
    }
    //Method to get length of LL
    public void getLength(){
        System.out.println("Length : "+size);
    }
    //Display all elements of LL
    public void displayList(){
        //If we move head to print elements than entire structure of LL will change, so use temprory variable
        Node temp=head; //Now temp and head both will point to the same object
        while (temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
    }


    //insert first element
    public void insertFirst(int val){
        Node node=new Node(val); //create node with value
        //assign head as first element and tail as last element
        node.next=head; //Now node and head both will point to the same object
        head=node; //now head will point node (first element of a list)
        if(tail==null){  //It means LL is empty
            tail=head; //So, tail and head both will point the same object
        }
        size+=1;
    }
    //insert last element
    public void insertLast(int val){
        if(tail==null){ //Check if a list is empty: if tail is null means list is empty
            insertFirst(val); //Insert value at first position only
        }else{
            Node node=new Node(val); //create node with value
            tail.next=node;
            tail=node;
            size++;
        }
    }
    //insert  element at particular index
    public void insert(int index,int value){
        //check if the index is valid,
        if(index<0 || index>size){
            System.out.println("Error : Index value is not valid");
        }
        //check if the index is zero, insert at the begining of the list
        if(index==0) {
            insertFirst(value);
            return;
        };
        //check if the index is at the end, insert at the end of the list
        if(index==size) {
            insertLast(value);
            return;
        };
        // If the index is in the middle, insert the node
        Node newNode=new Node(value); //create node with given value
        Node temp=head;
        for (int i = 1; i < index; i++) { //Get a pointer to the node at previous index
            temp=temp.next;
        }
        //Insert new node bu updating the next pointer
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }


    //Delete first element
    //Delete last element
    //Delete element at particular index
}
