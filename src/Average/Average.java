package Average;

public class Average {
    public static void main(String[] args) {
        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};
        int sum1 = 0;
        int sum2 = 0;
        for (int e : a){
            sum1 += e;
        }
        double avg1 = sum1 / (double) a.length;
        System.out.println("a array average: " + avg1);
        for (int e : b){
            sum2 += e;
        }
        double avg2 = sum2 / (double) b.length;
        System.out.println("b array average: " + avg2);
        double diff = avg2 - avg1;
        if (diff < 0){
            diff *= -1;
        }
        System.out.println("Difference between averages: " + diff);
    }
}
