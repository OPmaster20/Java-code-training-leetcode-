/*
Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 */

public class IfExist {

    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i != j){
                    if((0 <= i) && (j < arr.length)){
                        if(arr[i] == 2 * arr[j]){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {3,1,7,11};
        if(checkIfExist(arr)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
