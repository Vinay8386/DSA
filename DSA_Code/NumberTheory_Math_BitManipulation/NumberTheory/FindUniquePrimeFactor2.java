package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.ArrayList;
import java.util.Scanner;

public class FindUniquePrimeFactor2 {
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
        //Create an array. Add all elements in it and mark it as prime
        boolean[] isPrime= new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i]=true;
        }
        //Mark multiples of each prime number as non-prime
        for (int i = 2; i*i <=N ; i++) {
            if(isPrime[i]){
                for (int j = i*i; j <N ; j+=i) {
                    isPrime[j]=false;
                }
            }
        }
        //Collect unique prime factor
        int j = 0;
        ArrayList<Integer> primeFactorsList = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (isPrime[i] && N % i == 0) {
                primeFactorsList.add(i);
                while (N%i==0){
                    N/=i;
                }
            }
        }
        // Convert the list to an array
        int[] arr = new int[primeFactorsList.size()];
        for (int factor : primeFactorsList) {
            arr[j++] = factor;
        }
        return arr;
    }
}
//The overall time complexity is dominated by the Sieve of Eratosthenes algorithm,
// so the total time complexity is approximately O(N log log N).