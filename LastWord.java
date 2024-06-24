/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.
 */

public class LastWord {

    public static int lengthOfLastWord(String s) {
        int sum = 0;
        char[] arr = s.toCharArray();

        for (int i = arr.length - 1; i >= 0 ; i--) {
            if(('a' <= arr[i] && arr[i] <= 'z') || ('A' <= arr[i] && arr[i] <= 'Z')){
                sum += 1;
            }
            if(sum != 0 && arr[i] == ' '){
                break;
            }
        }

        return sum;
    }

    public static void main(String[] args){
        int n = lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(n);
    }
}
