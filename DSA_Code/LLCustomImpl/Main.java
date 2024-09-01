package LLCustomImpl;

public class Main {
    public static void main(String[] args) {

        LL l=new LL();
        l.display();
        System.out.println();
        l.insertFirst(2);
        l.display();
        System.out.println();
        //l.deleteLast();
        l.deleteFirst();
        l.display();
        System.out.println();
        l.insertFirst(1);
        l.insertLast(2);
        l.insertLast(4);
        l.insertLast(6);
        l.insertLast(5);
        l.insertLast(8);
        l.insertLast(9);
        l.display();
        System.out.println();
        l.insertAtIndex(3,2);
        l.display();
        System.out.println();
        l.deleteLast();
        l.display();
        System.out.println();
        l.deleteAtParticularIndex(2);
        l.display();
        System.out.println();
        System.out.println(l.getLength());
        l.updateAtIndex(108,2);
        l.display();
        System.out.println();
        l.insertValueAtIndexUsingRec(18,2);
        l.display();
    }
}
