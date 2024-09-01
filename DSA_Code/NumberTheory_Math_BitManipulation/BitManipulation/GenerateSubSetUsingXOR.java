package NumberTheory_Math_BitManipulation.BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubSetUsingXOR {
    public static void main(String[] args) {
        int[] nums={1,3,5};
        System.out.println(subsetXORSum(nums));

    }
    public static int subsetXORSum(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> s;
        int result = 0;
        for(int i=0;i<(1<<nums.length);i++){
            s = new ArrayList<>(); // Create a new ArrayList for each subset
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))!=0){ //checking ith bit is 0 or 1
                    s.add(nums[j]);
                }
            }
            subsets.add(s);
            System.out.println(subsets);
        }
        for (List<Integer> list:subsets) {
            int bits=0;
            for (int val:list) {
                bits^=val;
            }
            result+=bits;
        }
        return result;
    }
}
