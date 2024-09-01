package LLCustomImpl;

public class CircularLL {

    private Node head;
    private Node tail;

    public CircularLL(){
        this.head=null;
        this.tail=null;
    }

    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }

    public void insert(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void display(){
        Node temp=head;
        //we have to print this atleast once, we will keep on goint till we reach again
        //For this do-while loop is the best option
        if(temp!=null){
            do{
                System.out.print(temp.value+"->");
                temp=temp.next;
            } while (temp!=head);
        }
    }

    public void delete(int value){
        Node temp=head;
        if(head==null){
            return;
        }
        //delete first value
        if(temp.value==value){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n=temp.next;
            if(n.value==value){
                temp.next=n.next;
                break;
            }
            temp=temp.next;
        }while (temp!=head);
    }
}
