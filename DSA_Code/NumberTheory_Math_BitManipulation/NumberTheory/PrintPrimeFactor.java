package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrintPrimeFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(printPrimeFactor(n));
    }
    private static ArrayList<Integer> printPrimeFactor(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i*i <= n; i++) {
            if(n%i==0){
                list.add(i);
                list.add(n/i);
            }
        }
        Collections.sort(list);
        return list;
    }
}
