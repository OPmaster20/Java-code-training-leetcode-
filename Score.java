import static java.lang.Math.abs;

/*
You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.

Return the score of s.
 */
public class Score {

    public static int scoreOfString(String s) {
        char[] arr = s.toCharArray();
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            //int f = abs((int)arr[i] - (int)arr[i + 1]);
            int f = ((int)arr[i] - (int)arr[i + 1]);
            if(f < 0){
                f = f * -1;
            }
            k += f;
        }

        return k;
    }


    public static void main(String[] args){
        int score = scoreOfString("hello");
        System.out.println(score);
    }
}
