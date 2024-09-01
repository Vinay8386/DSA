package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetOfArray2 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<Integer> list = new ArrayList<>();
        System.out.println(findSubseq(list,arr));
    }

    //Approach-2 returning list of subset
    public static List<List<Integer>> findSubseq(List<Integer> list , int[] arr) {
        if(arr.length==0){
            List<List<Integer>> result=new ArrayList<>(); //create a list object where we will add an answer and return it
            result.add(list);
            return result;
        }
        List<List<Integer>> left=
                findSubseq(new ArrayList<>(list){{add(arr[0] );}},
                        Arrays.copyOfRange(arr, 1,arr.length));

        List<List<Integer>> right=
                findSubseq(new ArrayList<>(list),
                        Arrays.copyOfRange(arr, 1,arr.length));

        left.addAll(right);
        return left;
    }
}
