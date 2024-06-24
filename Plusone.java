import java.util.Arrays;
import java.util.List;

public class Plusone {
    public static int[] plusOne(int[] digits) {
       int i = digits.length - 1;
       while (true) {
           if (digits[i] + 1 <= 9) {
               digits[i] += 1;
               break;
           } else {
               digits[i] = 0;
               if(i != 0){
                   i--;
               } else {
                   int[] tmparr = new int[digits.length + 1];
                   tmparr[0] = 1;
                   int h = 1;
                   for (int j: digits){
                       tmparr[h] = j;
                       h++;
                   }
                   return tmparr;

               }

           }
       }
        return digits;
    }
    public static void main(String[] args){
        int[] arr = {2,9};
        int[] r = plusOne(arr);
        for (int i: r){
            System.out.println(i);
        }
    }
}
