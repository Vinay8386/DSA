/*
package NumberTheory_Math_BitManipulation.BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class SubsetWithXOR {
    public static void main(String[] args) {
        int[] nums={6,9,4,2};
        System.out.println(subsetXOR(nums, nums.length, 6));
    }
    static int subsetXOR(int arr[], int N, int K) {
        // code here
        int count=0;
        List<Integer> list;
        for(int i=0;i<(1<<N);i++){
            list=new ArrayList<>();
            for(int j=0;j<N;j++){
                if((i&(1<<j))!=0){
                    list.add(arr[j]);
                }
            }
            int bit=0;
            for(int val:list){
                bit^=val;
            }
            if(bit==K){
                count++;
            }
        }
        return count;
    }
}
*/
/*
In this case, it is explicitely generating all the subset, so complexity is 2 to pow n.
Check optimize code in SubsetWithXOR2
 */
