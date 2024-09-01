package Array;

import java.util.Arrays;

public class CopyArrayElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] num={9,10,11};
        //To copy elements from one array to another array
        System.arraycopy(arr,3,num,0,2); //now num array is: 4,5,11
        System.out.println(Arrays.toString(num));
        System.arraycopy(arr,3,num,0,3);//now num array is: 4,5,6
        System.out.println(Arrays.toString(num));
        System.arraycopy(arr,3,num,2,1);//now num array is: 4,5,4
        System.out.println(Arrays.toString(num));

        //To copy elements in specific range
        int[] specificRange = Arrays.copyOfRange(arr, 1,4);
        System.out.println("output using copyOfRange"+Arrays.toString(specificRange));

        //To copy n number of elements from first position
        int[] copyNElementFromZerothPosition = Arrays.copyOf(arr, 4);
        System.out.println(Arrays.toString(copyNElementFromZerothPosition));
        System.out.println(Arrays.toString(Arrays.copyOf(arr, 8)));

        //To copy whole array elements, use Object.clone()
        int[] fullCopy = arr.clone();
        System.out.println(Arrays.toString(fullCopy));
    }
}
