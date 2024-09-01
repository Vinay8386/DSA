package NumberTheory_Math_BitManipulation.BitManipulation;

public class SumOfAllSubsetUsingXOR {
    public static void main(String[] args) {
        int[] nums={1,3,5};
        System.out.println(subsetXORSum(nums));
    }
    public static int subsetXORSum(int[] nums) {
        int result = 0;
        for(int i=0;i<(1<<nums.length);i++){
            int subset_sum=0;
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))!=0)subset_sum^=nums[j];
            }
            result+=subset_sum;
        }
        return result;
    }
}
