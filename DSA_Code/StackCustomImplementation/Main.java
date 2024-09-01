package StackCustomImplementation;

public class Main {
    public static void main(String[] args) throws Exception {

        CustomStack c=new CustomStack();
        /*c.push(1);c.push(2);c.push(3);c.push(4);
        System.out.println(c.peek());
        System.out.println(c.pop());
        System.out.println(c.peek());*/

        /*c.push(1);c.push(2);c.push(3);c.push(4);c.push(5);
        c.push(6);c.push(7);c.push(8);c.push(9);c.push(10);
        c.push(11);//throw IOOBException*/

        DynamicStack d=new DynamicStack();  //never throw an error because once memory full it will double its size
        d.push(1);d.push(2);d.push(3);d.push(4);
        d.push(5);d.push(6);d.push(7);d.push(8);d.push(9);
        d.push(10);d.push(11);d.push(12);
        System.out.println(d.peek());
        System.out.println(d.pop());
        System.out.println(d.peek());
    }
}
