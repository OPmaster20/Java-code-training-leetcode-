/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
 */
public class Remove2 {

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int[] tmp = new int[nums.length];
        for (int i = 0,j = 0; i < nums.length; i++) {
            if(val != nums[i]){
                tmp[j] = nums[i];
                j++;
                //System.out.println(tmp[i]);
                k += 1;
            }
        }

        for (int j = 0; j < k; j++) {
            nums[j] = tmp[j];
            System.out.println(nums[j]);
        }


        return k;
    }

    public static void main(String[] args){

        int[] arr = {0,1,2,2,3,0,4,2};
        System.out.println("k = " + removeElement(arr, 2));
    }
}
