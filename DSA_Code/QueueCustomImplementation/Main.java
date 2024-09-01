package QueueCustomImplementation;

public class Main {
    public static void main(String[] args) throws Exception {
        /*CustomQueue c=new CustomQueue();

        c.insert(2);c.insert(4);c.insert(6);c.insert(8);c.insert(10);
        c.insert(12);c.insert(14);c.insert(16);c.insert(18);c.insert(20);
        System.out.println(c.peekFront());
        System.out.println(c.peekBack());
        c.display();
        c.insert(22); //throw exception because of its size*/

        CustomQueue d=new DynamicQueue();
        d.insert(5);d.insert(10);d.insert(15);d.insert(20);d.insert(25);
        d.insert(30);d.insert(35);d.insert(40);d.insert(45);d.insert(50);
        d.display();
        System.out.println(d.size());
        System.out.println("Default size is 10 but now size will double after inserting next element elements : ");
        d.insert(55);
        System.out.println(d.size());
        d.display();
        System.out.println(d.peekFront());
        System.out.println(d.peekBack());
    }
}
