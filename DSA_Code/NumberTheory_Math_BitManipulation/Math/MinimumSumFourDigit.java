package NumberTheory_Math_BitManipulation.Math;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinimumSumFourDigit {
    public static void main(String[] args) {
        System.out.println( minimumSum(2932));
    }
    public static int minimumSum(int num) {
        int digit1=0,digit2=0;
        String[] arr=String.valueOf(num).split("");
        Arrays.sort(arr);
        for(int i=0;i< arr.length;i++){
            if(i%2==0){
                digit1= Integer.parseInt(digit1+arr[i]);
            }else{
                digit2= Integer.parseInt(digit2+arr[i]);
            }
        }
        return digit1+digit2;
    }
}
