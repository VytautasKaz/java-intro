package chessGrains;

import java.math.BigInteger;

public class chessGrains {
    public static void main (String[] args)
    {
        BigInteger sum = new BigInteger("1");
        for (int i = 1; i <= 64; i++)
        {
            System.out.println("Square " + i + ": " + sum + " grains.");
            sum = sum.multiply(new BigInteger("2"));
        }
    }
}
