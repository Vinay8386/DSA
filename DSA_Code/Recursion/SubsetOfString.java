package Recursion;

import java.util.ArrayList;

public class SubsetOfString {
    public static void main(String[] args) {
        findSubset("","abc");
    }
    public static void findSubset(String p,String s) {
        //s-1) Whenever s is empty, print p and return it
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        //s-2)If s is not empty, either take it or leave it
        //to take one by one character
        char ch=s.charAt(0);

        //s-2.1) call function if you take value
        findSubset(p+ch,s.substring(1));
        //s-2.1) call function if not take value
        findSubset(p,s.substring(1));  //If we take this before than it will print in the opposite way
    }
}
