package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        String s=" ";
        System.out.println(findSubseq(s,arr));
    }

    //Approach-2 returning list of subset
    public static ArrayList<String> findSubseq(String s,int[] arr) {
        //s-1) Whenever s is empty add value of p in the list and return it
        if(arr.length==0){
            ArrayList<String> l=new ArrayList<>(); //create a list object where we will add an answer and return it
            l.add(s);
            return  l;
        }
        //It will find answers from the left side of the recursion call
        ArrayList<String> left=findSubseq(s+arr[0], Arrays.copyOfRange(arr, 1,arr.length));

        //It will find answers from the right side of recursion call
        ArrayList<String> right=findSubseq(s,Arrays.copyOfRange(arr, 1,arr.length));

        //add both to return exact
        left.addAll(right);

        //return after adding
        return left; //or right
    }
}
