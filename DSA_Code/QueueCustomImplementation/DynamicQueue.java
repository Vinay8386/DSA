package QueueCustomImplementation;

public class DynamicQueue extends CustomQueue{

    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) throws Exception {
        if(isFull()){
            //double the size of the queue
            int[] temp=new int[data.length*2];
            //copy all elements from data and put in the temp
            System.arraycopy(data,0,temp,0,data.length);
            data=temp; //assigning temp to data
        }
        return super.insert(item);
    }
}
