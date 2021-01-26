package chessGrains;

import java.math.BigInteger;

public class chessGrains {
    public static void main(String[] args) {
        int sum = 0;
        int number = 2;
        for (int i = 0; i <= 64; i++){
            sum += Math.pow(number, i);
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
