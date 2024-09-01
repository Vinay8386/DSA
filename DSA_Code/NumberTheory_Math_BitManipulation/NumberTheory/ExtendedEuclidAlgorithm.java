package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.Scanner;

//using the Extended Euclidean Algorithm, given a and b calculate the GCD and integer coefficients x, y.
public class ExtendedEuclidAlgorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        extendedEuclidAlgorithm(a,b);
        for (int val:extendedEuclidAlgorithm(a,b)
             ) {
            System.out.print(val+" ");
        }
    }

    static int[] extendedEuclidAlgorithm(int a, int b) {
        if(b==0){
            return new int[]{a, 1, 0};
        }
        // Recursive call
        int[] values = extendedEuclidAlgorithm(b, a % b);
        int gcd = values[0];
        int x = values[2];
        int y = values[1] - (a / b) * values[2];
        return new int[]{gcd, x, y};
    }
}
