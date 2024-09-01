package NumberTheory_Math_BitManipulation.Math;

import java.util.Scanner;

//Find square roor of a number
public class SqrtOfN2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(mySqrt(n,3));
    }
    public static double mySqrt(int n, int p) {
        int start=0;
        int end=n;
        double root=0.0;
        while (start<=end){
            int mid =start+(end-start)/2;
            if(mid*mid==n){
                return mid;
            }
            if (mid*mid>n) {
                end=mid-1;
            }else{
                start=mid+1
                ;
            }
        }
        double incr=0.1;
        for (int i = 0; i < p; i++) {
            while (root*root<=n){
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;
    }
}
