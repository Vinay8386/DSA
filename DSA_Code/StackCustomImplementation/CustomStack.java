package StackCustomImplementation;

public class CustomStack {

    // Internally Stack itself also an array only so create an array
    int[] data; //Used default package so that it will be accessible within the package but not outside the package
    private static final int DEFAULT_SIZE=10; //Initialize its default size

    int ptr=0;

    //Initialize a CustomStack object with its default size
    public CustomStack(){
        this(DEFAULT_SIZE); //call another constructor of the same class (CustomStack(int defaultSize)), passing the default size (DEFAULT_SIZE) as an argument. This is a way to avoid duplicating initialization logic.
    }

    //Allowing user to specify the custom size of CustomStack
    public CustomStack(int defaultSize) {
        this.data=new int[defaultSize]; //this.data is used to assign a new integer array to the data member variable of the current object
    }

    //Checking if the stack is full (for fixed-size stacks, though not always applicable).
    public boolean isFull(){
        return ptr== data.length; //When ptr is equal to data.length, it will return false else true
    }

    //Checking if the stack is empty.
    public boolean isEmpty(){
        return ptr==0;
    }

    //Adding an element to the top of the stack.
    public boolean push(int value)throws StackFullException {
        //check if CustomStack is full
        if(isFull()){
            throw new StackFullException("CustomStack is full : ");
        }
        //Place value at pointer index
        data[ptr++]=value;
        return true;
    }

    // Removing and returning the element from the top of the stack.
    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("can't pop from empty stack : ");
        }
        return data[--ptr];
    }

    //Top: Viewing the element at the top of the stack without removing it.
    public int peek()throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty : ");
        }
        return data[ptr-1];
    }
}
/*
A generic Exception might not be the best practice. Consider using more specific exceptions or creating custom exceptions to convey the nature of the error more precisely.
 In this class, the size of stack is full. It will not increase its size dynamically.
 To achieve dynamicnature on its size, check DynamicStack class
 */