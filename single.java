/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
 */

public class single {


    public static int singleNumber(int[] nums) {
        int k = 0, t = 0;
        for(int i = 0; i < nums.length; i++){
            k = i;
            t = 0;
            for(int j = 0; j < nums.length; j++){
                if(j != k){
                    if(nums[i] == nums[j]){
                        t = 1;
                    }
                }

            }
            if(t == 0){
                return nums[i];
            }
        }

        return 0;
    }

    public static void main(String[] args){
        int[] a = {4,1,2,1,2};
        int n =singleNumber(a);
        System.out.println(n);
    }
}
