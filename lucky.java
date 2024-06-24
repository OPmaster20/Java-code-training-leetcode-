import java.util.ArrayList;
import java.util.List;

public class lucky {

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        int n = matrix[i][j];
        while ((i < matrix.length)){
            if(n > matrix[i][j]){
                n = matrix[i][j];
            }
            if(j < matrix[i].length - 1){
                j++;
            }else{
                System.out.println(n);
                list.add(n);
                i++;
                j = 0;
                if(i < matrix.length){
                    n = matrix[i][j];
                }

            }
        }

        int e = list.get(0);
        for (int c:list){
            if(e < c){
                e = c;
            }
        }
        list.clear();
        list.add(e);
        return list;
    }

    public static List<Integer> luckyNumbers2 (int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int t = matrix[0][0];
        int k = 0, i = 0, pop = 0;
        while (i <= matrix.length - 1){
            for (int j = 0; j < matrix[i].length; j++) {
                if(t > matrix[i][j]){
                    t = matrix[i][j];
                }
            }
            System.out.println(t);
            if(pop < matrix[0].length){
                for(int z = 0; z < matrix.length; z++){
                    System.out.println("k" + matrix[z][i]);
                    if(t < matrix[z][i]){
                        k = 1;
                        break;
                    }
                }
                pop++;
            }
            i++;
            if(k == 0){
                list.add(t);
                return list;
            }else{
                k = 0;
            }
            if(i <= matrix.length - 1){
                t = matrix[i][0];
            }
        }
        return list;
    }

    public static void main(String[] args){
        int[][] arr = {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> s = luckyNumbers2(arr);
        System.out.println(s);
    }
}
