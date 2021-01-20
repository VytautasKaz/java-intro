package PrimeNum;

public class PrimeNum {
    public static void main(String[] args) {
        int start = -20;
        int end = 100;
        for (int i = start; i <= end; i++) {
            if (i < 2){
                continue;
            }
            if (isPrime(i)){
                System.out.println("Number " + i + " is a prime number.");
            }
        }
    }
    static boolean isPrime(int number) {
        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0){
                return false;
            }
        }
        return true;
    }
}
