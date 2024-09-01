package CircularQueueCustomImpl;

public class DynamicCircularQueue extends CircularQueue{

    public DynamicCircularQueue(){
        super();
    }

    public DynamicCircularQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) throws Exception {
        if(isFull()){
            //double the size of array
            int[] temp=new int[data.length*2];
            //Copy elements from data and put it in temp
            System.arraycopy(data,0,temp,0,data.length);
            data=temp;
        }
        return super.insert(item);
    }
}
