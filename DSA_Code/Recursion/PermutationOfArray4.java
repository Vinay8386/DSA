package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationOfArray4 {
    public static void main(String[] args) {
        int[] array = {1, 3, 2};
        ArrayList<ArrayList<Integer>> listOfList=new ArrayList<>();
        ArrayList<Integer> list;
        for (int[] val:permutationList(new int[0], array)) {
            list=new ArrayList<>();
            for (int ele:val) {
                list.add(ele);
            }
            listOfList.add(list);
        }
        System.out.println(listOfList);
        //System.out.println(permutationList(new int[0], array));
    }
    //Find permutation of String
    static ArrayList<int[]> permutationList(int[] p, int[] up) {
        if (up.length==0) {
            ArrayList<int[]> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int ch=up[0];
        // local to this call
        ArrayList<int[]> ansArr = new ArrayList<>();

        for (int i = 0; i <= p.length; i++) {
            int[] prefix_subArray = Arrays.copyOfRange(p,0,i);
            int[] suffix_subArray = Arrays.copyOfRange(p,i,p.length);
            int[] newPrefix = Arrays.copyOf(prefix_subArray, prefix_subArray.length + 1);
            newPrefix[newPrefix.length - 1] = ch;

            int[] newP = new int[newPrefix.length + suffix_subArray.length];
            System.arraycopy(newPrefix, 0, newP, 0, newPrefix.length);
            System.arraycopy(suffix_subArray, 0, newP, newPrefix.length, suffix_subArray.length);

            ansArr.addAll(permutationList(newP, Arrays.copyOfRange(up, 1, up.length)));
        }
        return ansArr;
    }
}
