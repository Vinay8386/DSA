package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.ArrayList;
import java.util.Scanner;

public class FindUniquePrimeFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int value:AllPrimeFactors(n)
             ) {
            System.out.println(value);
        }
    }
    public static int[] AllPrimeFactors(int N)
    {
        // code here
        int j=0;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if(checkPrime(i)!=false && N%i==0){
                while (N%i==0){
                    N/=i;
                }
                list.add(i);
            }
        }
        //take an element from the list and put it in an array
        int[] arr = new int[list.size()];
        for (int val:list) {
            arr[j]=val;
            j++;
        }
        return arr;
    }
    static boolean checkPrime(int n) {
        if(n<=1) return false;
        for (int j = 2; j*j <= n; j++) {
            if(n%j==0){
                return false;
            }
        }
        return true;
    }
}
//The dominant factor in the overall time complexity is the loop to find prime factors,
// and the time complexity is O(N * sqrt(N)).