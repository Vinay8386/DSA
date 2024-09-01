package StackCustomImplementation;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super(); //It will call superclass default/no-args constructor
    }

    public DynamicStack(int size){
        super(size); //It will call superclass parametrize constructor
    }

    @Override
    public boolean push(int value) throws StackFullException {
        if(this.isFull()){
            //Double the array size
            int[] temp=new int[data.length*2];
            //copy all the element from data array and put it into temp
            System.arraycopy(data,0,temp,0,data.length);
            data=temp; //assigning temp to data
        }
        return super.push(value);
    }
}

/*
CustomStack Class:

Implements basic stack functionality correctly, including push, pop, peek, isFull, and isEmpty methods.
The use of package-private access for the data array is appropriate since it allows access within the same package but not outside of it.
Proper exception handling is included for cases such as stack overflow (push) and stack underflow (pop and peek).
DynamicStack Class:

Extends CustomStack to provide dynamic resizing functionality.
Overrides the push method to double the array size and copy elements when the stack is full.
The logic for resizing and copying elements in the push method appears to be correct.
Overall, both classes seem well-structured and fulfill their respective purposes. However, you might consider adding some additional functionality or error checking, such as:

Error handling for cases where the array size becomes too large after doubling.
Potential synchronization if the stack is to be used concurrently.
Documentation to clarify the purpose and usage of each method.
 */