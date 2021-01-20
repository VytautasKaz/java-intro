package PerfectNumber;

public class PerfectNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if(isPerfectNumber(i)){
                System.out.println("Skaicius " + i + " yra tobulas.");
            }
        }
    }
    static boolean isPerfectNumber(int number){
        int sum = 0;
        for (int j = 1; j <= number / 2; j++){
            if(number % j == 0){
                sum += j;
            }
        }
        return sum == number;
    }
}
