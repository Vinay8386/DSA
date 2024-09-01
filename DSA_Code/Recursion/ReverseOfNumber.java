package Recursion;

public class ReverseOfNumber {
    public static void main(String[] args) {
        reverse(134);
        System.out.print(sum);
    }
    static int sum=0;
    public static void reverse(int n){
        if(n==0){
            return;
        }
        sum=sum*10+(n%10);
        reverse(n/10);
    }
}
