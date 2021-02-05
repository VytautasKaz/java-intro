package IBAN_validation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter IBAN: ");

            String iban = scanner.nextLine();

            if (iban.length() == 0) break;

            System.out.println("IBAN: " + iban);
        }
    }
}
