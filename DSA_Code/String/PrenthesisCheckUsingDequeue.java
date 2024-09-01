package String;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

//Check a given String is well-formed/balance or not
public class PrenthesisCheckUsingDequeue {
    public static void main(String[] args) {
        String str="[{()}]";
        System.out.println(checkParenthesis(str));
    }

    public static boolean checkParenthesis(String str) {

        //create a Stack object
        Deque<Character> st=new ArrayDeque<>();

        //Iterate over each character of given String
        for (int i = 0; i < str.length(); i++) {
            //Extract the character
            char ch=str.charAt(i);
            //check if Stack is empty
            if(st.isEmpty()){
                st.push(ch);

            } else if (ch =='[' || ch =='{' || ch =='(') {   //If opening bracket put it in stack
                st.push(ch);
            } else if (ch==']' && st.peek()=='[') {
                st.pop();
            } else if (ch=='}' && st.peek()=='{') {
                st.pop();
            } else if (ch==')' && st.peek()=='(') {
                st.pop();
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}
