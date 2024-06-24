import java.util.Arrays;

/*
Given an integer array nums, retur
n true if any value appears at least twice in the array, and return false if every element is distinct.
 */
public class Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        if(containsDuplicate(arr)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
