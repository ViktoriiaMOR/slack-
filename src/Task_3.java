import java.util.Arrays;

public class Task_3 {

    public static void main(String[] args) {

        int num[][] = new int[1][3];
        System.out.println(Arrays.deepToString(num));

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = 10;
            }
        }

        System.out.println(Arrays.deepToString(num));



    }
}