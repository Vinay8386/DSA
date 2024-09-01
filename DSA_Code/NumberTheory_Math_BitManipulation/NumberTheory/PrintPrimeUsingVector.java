package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.Scanner;
import java.util.Vector;

//print all prime number less than & equal to n
//This way give Time Limit Exceed(TLE)
public class PrintPrimeUsingVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printPrimes(n));
    }

    private static Vector<Integer> printPrimes(int n) {
        Vector<Integer> prime_list = new Vector<>();
        for (int i = 2; i <= n; i++) {
            prime_list.add(i);
        }
        for (int i = 2; i * i <= n; i++) {
            if (isPrime(i)) {
                return deleteMultiple(i, n, prime_list);
            }
        }
        return prime_list;
    }
    private static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static Vector<Integer> deleteMultiple(int i, int n, Vector<Integer> prime_list) {
        int j = 2;
        while (i * j <= n) {
            prime_list.removeElement(i * j);
            j++;
        }
        return prime_list;
    }
}

//Is there any way
        /*The outer loop in printPrimes runs in O(n).
        The inner loop in isPrime runs in O(sqrt(i)).
        The inner loop in deleteMultiple runs in O(n/i).

        Combining all of these, the overall time complexity becomes O(n * (sqrt(2) + sqrt(3) + sqrt(4) + ... + sqrt(n))).
        This is not an efficient algorithm for finding prime numbers.*/