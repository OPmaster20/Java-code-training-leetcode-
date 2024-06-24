/*
Given an array nums containing n distinct numbers in
 the range [0, n], return the only number in the range that is missing from the array.
 */

public class Missnumber {


    public static int missingNumber(int[] nums) {
        int len = nums.length;
        boolean g = false;
        for (int i = 0; i <= len; i++) {
            for (int j: nums){
                if(i == j){
                    g = true;
                }
            }
            if(!g){
                return i;
            }else {
                g = false;
            }
        }
        return 0;

    }
    public static void main(String[] args){
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
}
