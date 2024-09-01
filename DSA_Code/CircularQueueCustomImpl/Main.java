package CircularQueueCustomImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        //CircularQueue c=new CircularQueue();
        CircularQueue c=new DynamicCircularQueue();
        c.insert(2);c.insert(4);c.insert(6);c.insert(8);c.insert(10);
        c.insert(12);c.insert(14);c.insert(16);c.insert(18);c.insert(20);
        c.insert(22);c.insert(24);c.insert(26);c.insert(28);c.insert(30);
        c.display();
        System.out.println("Removed element is : ");
        System.out.println(c.remove());
        System.out.println("Now remainng element is : ");
        c.display();
    }
}
