package LLCustomImpl;

public class CircularLLMain {
    public static void main(String[] args) {
        CircularLL c=new CircularLL();
        c.insert(22);
        c.insert(24);
        c.insert(26);
        c.insert(28);
        c.insert(32);
        c.display();
        System.out.println();
        c.delete(28);
        c.display();
    }
}
