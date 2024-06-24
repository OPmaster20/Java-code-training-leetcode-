/*
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */
public class romanToInt {
    public static int romanToInt(String s) {
        char[] arr = s.toCharArray();
        char[] sample = {'I','V','X','L','C','D','M'};
        int[] values = {1,5,10,50,100,500,1000};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1){
                if(arr[i] == 'I' && arr[i + 1] == 'V'){
                    sum += 4;
                    i++;
                } else if (arr[i] == 'I' && arr[i + 1] == 'X') {
                    sum += 9;
                    i++;
                } else if (arr[i] == 'X' && arr[i + 1] == 'L') {
                    sum += 40;
                    i++;
                } else if (arr[i] == 'X' && arr[i + 1] == 'C') {
                    sum += 90;
                    i++;
                } else if (arr[i] == 'C' && arr[i + 1] == 'D') {
                    sum += 400;
                    i++;
                } else if (arr[i] == 'C' && arr[i + 1] == 'M') {
                    sum += 900;
                    i++;
                }else{
                    for(int j = 0; j < sample.length; j++){
                        if(arr[i] == sample[j]){
                            sum += values[j];
                        }
                    }
                }
            }else{
                for(int j = 0; j < sample.length; j++){
                    if(arr[i] == sample[j]){
                        sum += values[j];
                    }
                }
            }


            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(romanToInt("LVIII"));
    }
}
