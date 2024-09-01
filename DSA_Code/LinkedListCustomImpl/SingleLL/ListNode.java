package LinkedListCustomImpl.SingleLL;

public class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data){
        this.data=data;
    }

    public ListNode(int data, ListNode next){
        this.data=data;
        this.next=next;
    }

    /*public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public void setNext(ListNode next){
        this.next=next;
    }

    public ListNode getNext(){
        return this.next;
    }*/

    //The purpose of the below method is to compare the content of two ListNode objects.
    @Override
    public boolean equals(Object o) { //It takes an Object as an argument (since equals() is defined in the Object class).
        if (this == o) return true;     //checks if the current object (this) is the same as the one being compared (o).
        if (o == null ||
                getClass() != o.getClass()) //line checks if o is null or if its class is different from the class of the current object (this).
            return false;
        ListNode otherNode = (ListNode) o; //casts the Object reference o to a ListNode reference called otherNode
        return data == otherNode.data; //compares the val (node value) of the current node with the val of the other node.
    }
}
