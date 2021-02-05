package IBAN_validation;

import java.math.BigInteger;

public class IBAN {
    public static boolean isValidIBAN(String iban){
        iban = removeSpaces(iban);

        // TODO...
        // 1. Check that the total IBAN length is correct as per the country. If not, the IBAN is invalid

        // 2. Move the four initial characters to the end of the string
        iban = iban.substring(4) + iban.substring(0, 4);

        // 3. Replace each letter in the string with two digits, thereby expanding the string, where A = 10, B = 11, ..., Z = 35
        iban = decode(iban);
        System.out.println(iban);
        // 4. Interpret the string as a decimal integer and compute the remainder of that number on division by 97
        BigInteger ibanNumber = new BigInteger(iban);
        BigInteger remainder = ibanNumber.remainder(BigInteger.valueOf(97));

        return remainder.equals(BigInteger.ONE);
    }
    private static String removeSpaces(String x){
        return x.replace(" ", "");
    }
    private static String decode(String x){
        String res = "";
        for (int i = 0; i < x.length(); i++){
            if (Character.isAlphabetic(x.charAt(i))){
                res += x.charAt(i) - 'A' + 10; // could also just be -55, but this is way it has better readability
            } else {
                res += x.charAt(i);
            }
        }
        return res;
    }
}
