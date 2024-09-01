package Recursion;

import java.util.ArrayList;

public class SubsetOfString_2 {
    public static void main(String[] args) {
       // findSubseq(" ","abc");
        System.out.println(findSubseq(" ","abc"));
    }

    //Approach-2 returning list of subset
    public static ArrayList<String> findSubseq(String p, String s) {
        //s-1) Whenever s is empty add value of p in the list and return it
        if(s.isEmpty()){
            ArrayList<String> list=new ArrayList<>(); //create a list object where we will add an answer and return it
            list.add(p);
            return  list;
        }
        //It will find answers from the left side of the recursion call
        ArrayList<String> left=findSubseq(p+s.charAt(0),s.substring(1));

        //It will find answers from the right side of recursion call
        ArrayList<String> right=findSubseq(p,s.substring(1));

        //add both to return exact
        left.addAll(right);

        //return after adding
        return left; //or right
    }
}
