package condition;

import java.util.Arrays;

public class ConditionEx7 {
    public static void main(String[] args) {
        int[] xs = {2,3};
        String isOdd;
        for(int i =0; i < xs.length; i++) {
            int x = xs[i];
            isOdd = x % 2 == 0 ? "짝수" : "홀수";
            System.out.println("x = "+ x + "," + isOdd);
        }
    }
}
