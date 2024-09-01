package QueueCustomImplementation;

import java.util.Queue;

public class CustomQueue {

    // Internally Queue itself also an array only so create an array
    int[] data;
    private static final int DEFAULT_VALUE=10;

    int ptr=0;

    //Initialize the default size in default constructor
    public CustomQueue(){
        this(DEFAULT_VALUE);
    }

    //Allowing user to specify the custom size of CustomQueue
    public CustomQueue(int defaultValue) {
        data=new int[defaultValue];
    }

    //Check if the queue is full or not
    public boolean isFull(){
        return ptr== data.length;
    }

    //Check if the queue is empty
    public boolean isEmpty(){
        return ptr==0;
    }

    //Get size of queue
    public int size(){
        return data.length;
    }

    // insert: Inserts the specified element into this queue
    public boolean insert(int item)throws Exception{
        if(isFull()){
            throw new Exception("Queue is full Please increase the size : ");
        }
        //Insert data in current position
        data[ptr++]=item;
        return true;
    }

    //remove: Retrieves and removes the head of this queue.
    public int remove()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty, please insert the element first : ");
        }
        //Since ptr is at lat position, but we need to remove a first position element first ((FIFO)
        int removedElement=data[0];
        //Now move all elements in queue to one position back
        for (int i = 1; i < data.length; i++) {
            data[i-1]=data[i];
        }
        //move ptr also to one position back
        ptr--;
        return removedElement;
    }

    //return first position elements of queue
    public int peekFront()throws Exception{
        if(isEmpty()){
            throw new Exception("No elements available in the queue, please insert elements first : ");
        }
        return data[0];
    }

    //return last position elements of queue
    public int peekBack()throws Exception{
        if(isEmpty()){
            throw new Exception("No elements available in the queue, please insert elements first : ");
        }
        return data[ptr-1];
    }

    //Display all the elements of the queue
    public void display(){
        for (int i = 0; i < ptr; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
/*
Constructor: You have two constructors, one without parameters that initializes the queue with a default size, and another that allows the user to specify a custom size.

isFull(): Checks if the queue is full by comparing the pointer to the length of the array.

isEmpty(): Checks if the queue is empty by checking if the pointer is at the beginning of the array.

insert(int item): Insert an element into the queue. It throws an exception if the queue is full.

remove(): Removes and returns the element at the front of the queue. It throws an exception if the queue is empty. After removal, it shifts all elements one position to the front to maintain the FIFO order.

peekFront(): Returns the element at the front of the queue without removing it. It throws an exception if the queue is empty.

peekBack(): Returns the element at the back of the queue without removing it. It throws an exception if the queue is empty.

display(): Displays all the elements of the queue.

Overall, this custom implementation provides a basic FIFO queue functionality using an array-based approach. However, note that shifting all elements in the array for each removal operation (remove method) may not be efficient for large queues. Using a circular array or linked list approach could offer better performance for frequent insertion and removal operations.
 */