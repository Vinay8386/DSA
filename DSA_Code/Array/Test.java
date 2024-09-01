package Array;

public class Test {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(sumElement(arr));
    }

    public static int sumElement(int[] arr){
        int sum=0;
        for (int val:arr) {
            sum=sum+val;
        }
        return sum;
    }
}
