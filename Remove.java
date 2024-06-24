/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
 */
public class Remove {

    public static int removeDuplicates1(int[] nums) {
        int[] newarr = new int[nums.length];
        int k = 1;
        newarr[0] = nums[0];
        for(int i = 0,j = 1; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1]){
                newarr[j] = nums[i + 1];
                j++;
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(newarr[i] + "\n");
        }
        return k;
    }

    public static int removeDuplicates2(int[] nums) {
        int[] newarr = new int[nums.length];
        int k = 1;
        newarr[0] = nums[0];
        for(int i = 0,j = 1; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1]){
                newarr[j] = nums[i + 1];
                j++;
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            nums[i] = newarr[i];
            System.out.print(nums[i] + "\n");
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,2,9,10,10,10};
        System.out.println("k = " + removeDuplicates2(arr));
    }
}