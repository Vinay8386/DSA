package NumberTheory_Math_BitManipulation.BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class SubsetWithXOR2 {
    public static void main(String[] args) {
        int[] nums={6,9,4,2};
        System.out.println(subsetXORSum(nums));
    }
    public static int subsetXORSum(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result |= nums[i];
        }

        result *= 1 << (nums.length - 1);

        return result;
    }

}
/*
In this case, it is explicitely generating all the subset, so complexity is 2 to pow n.
Check optimize code in SubsetWithXOR2
 */