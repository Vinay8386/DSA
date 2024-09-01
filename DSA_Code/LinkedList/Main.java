package Collection.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list=new LL(); //here size=0,head and tail will be initialized
        list.getHead();list.getTail();list.getLength();
        list.displayList();
        list.insertFirst(4);
        list.insertFirst(9);
        list.insertFirst(5);
        list.insertFirst(17);
        list.displayList();
        System.out.println();
        list.insertLast(22);
        list.displayList();
        System.out.println();
        list.insert(3,11);
        list.displayList();
    }
}
