/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.


 */

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] re = {0,0};
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    re[0] = i;
                    re[1] = j;
                    return re;
                }
            }
        }
        return re;
    }
    public static void main(String[] args) {

        int[] arr = {3,3};
        int[] index = twoSum(arr,6);
        for (int i = 0; i < index.length; i++) {
            System.out.println(index[i]);
        }
    }
}