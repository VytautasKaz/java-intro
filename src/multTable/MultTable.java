package multTable;

public class MultTable {
    public static void main(String[] args) {
        int e = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++){
                e = i * j;
                System.out.println(i + " * " + j + " = " + e);
            }
            System.out.println("---------------");
        }
    }
}
