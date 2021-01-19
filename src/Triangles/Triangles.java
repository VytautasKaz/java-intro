package Triangles;

public class Triangles {
    public static void main(String[] args) {
        int[][] tri = {{3, 4, 5}, {2, 10, 8}, {5, 6, 5}, {5, 5, 5}};
        for (int i = 0; i < tri.length; i++) {
            int[] t = tri[i];
            if (t[0] < t[1] + t[2] && t[1] < t[0] + t[2] && t[2] < t[0] + t[1]) {
                if (t[0] == t[1] && t[1] == t[2]) {
                    System.out.println("Equilateral triangle.");
                } else if (t[0] == t[1] || t[0] == t[2] || t[1] == t[2]) {
                    System.out.println("Isosceles triangle.");
                } else {
                    System.out.println("Scalene triangle.");
                }
            } else {
                System.out.println("Invalid triangle.");
            }
        }
    }
}
