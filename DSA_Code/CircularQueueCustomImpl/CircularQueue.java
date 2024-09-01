package CircularQueueCustomImpl;

public class CircularQueue {

    int[] data;
    private static final int DEFAULT_SIZE=10;

    //Initialize a CircularQueue object with its default size
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    protected int end=0;
    protected int front=0;
    protected int size=0;

    //Allowing user to specify the custom size of CircularQueue
    public CircularQueue(int size){
        data=new int[size];
    }

    //If CircularQueue is full
    public boolean isFull(){
        return size == data.length; //because end may not equal to data.length
    }

    //If CircularQueue is empty
    public boolean isEmpty(){
        return size==0;
    }

    //Insert
    public boolean insert(int item)throws Exception{
        if(isFull()){
            throw new Exception("CircularQueue is full, please increase the size to insert elements int it : ");
        }
        data[end++]=item;
        end%=data.length; //once ptr move outside the lenth, it will start from zero again
        size++; //increase the size after insertion
        return true;
    }

    //Remove
    public int remove()throws Exception{
        if(isEmpty()){
            throw new Exception("Circular queue is empty, please insert element first");
        }
        int removedElement = data[front]; // Store the element to be removed
        data[front] = 0; // Optional: Clear the removed element from the array (if needed) (e.g., setting it to a default value).
        front = (front + 1) % data.length; // Move the front pointer to the next element
        size--; // Decrease the size of the queue
        return removedElement; // Return the removed element
    }

    //Display
    public void display()throws Exception{
        if(isEmpty()){
            throw new Exception("CircularQueue is empty, please insert element first : ");
        }
        int i=front;
        do{
            System.out.print(data[i]+" ");
            i++;
            i%= data.length; //when i reaches the end of the array (data.length), it wraps around to the beginning by taking the modulus (%) with the length of the array
        }while (i!=end); //Once the index i becomes equal to the end index, the loop terminates.
        System.out.println();
    }
}
/*
Leaving the removed elements in the array can be more efficient in terms of memory and time complexity, as it avoids unnecessary shifting of elements. However,
if the circular queue undergoes many insertions and removals, the array may gradually fill up with null or default values, potentially affecting performance.
Data Integrity: Keeping removed elements in the array maintains the integrity of the data structure, ensuring that the indices of the elements remain consistent.
This can simplify certain operations, such as indexing or iterating over the elements.
Complexity: Clearing the removed elements from the array adds complexity to the implementation and may require additional logic to handle edge cases,
such as determining when to resize the array or when to shift elements.
 */