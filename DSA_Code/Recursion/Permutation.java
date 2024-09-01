package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<Integer> list = new ArrayList<>();
        System.out.println(perm(list,arr));
    }

    //Approach-2 returning list of subset
    public static List<List<Integer>> perm(List<Integer> list , int[] arr) {
        if(arr.length==0){
            List<List<Integer>> result=new ArrayList<>();
            result.add(list);
            return result;
        }

        // local to this call
        List<List<Integer>> list1 = new ArrayList<>();

        //In permutation no of recursion call is equal to the size of elemens available in the unprocessed list
        for (int i = 0; i < list.size()+1; i++) {
            List<List<Integer>> left=
                    perm(new ArrayList<>(list){{add(arr[0] );}},
                            Arrays.copyOfRange(arr, 1,arr.length));

        }
        return list1;
    }
}
