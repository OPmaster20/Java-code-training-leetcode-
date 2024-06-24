import java.util.Arrays;

/*
You are given an integer array nums of even length. You have to split the array into two parts nums1 and nums2 such that:

nums1.length == nums2.length == nums.length / 2.
nums1 should contain distinct elements.
nums2 should also contain distinct elements.
Return true if it is possible to split the array, and false otherwise.
 */
public class Split {
    public static boolean isPossibleToSplit(int[] nums) {
        int[] num1 = new int[nums.length / 2];
        int[] num2 = new int[nums.length / 2];
        Arrays.sort(nums);
        for (int i = 0,j = 0; i < nums.length; i+=2,j++) {
            if(nums[i] == nums[i + 1]){
                num1[j] = nums[i];
                num2[j] = nums[i + 1];
            }else{
                num1[j] = nums[i];
                num2[j] = nums[i + 1];
            }
        }

        for(int z = 0; z < num1.length; z++){
            for(int k = z + 1; k < num1.length; k++) {
                if ((num1[z] == num1[k]) || (num2[z] == num2[k])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr = {8,9,8,5,9,3,3,1,2,1};
        if(isPossibleToSplit(arr)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
