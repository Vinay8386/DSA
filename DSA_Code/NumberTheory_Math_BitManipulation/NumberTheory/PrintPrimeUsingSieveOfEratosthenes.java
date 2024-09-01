package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.Scanner;
import java.util.ArrayList;

public class PrintPrimeUsingSieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> list=sieveOfEratosthenes(n);
        System.out.println(list);
    }
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        ArrayList<Integer> primes = new ArrayList<>();
        boolean[] isPrime = new boolean[N + 1];
        //mark each number is prime
        for(int i=2;i<=N;i++){
            isPrime[i]=true;
        }
        //Begin with the first prime number, which is 2.
        //Mark it as a prime number and proceed to mark its multiples as not prime.
        for(int i=2;i*i<=N;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=N;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        //After completing the above steps, the indices in the isPrime array that still have a true value correspond to prime numbers.
        //add all the prime numbers in arraylist
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}
