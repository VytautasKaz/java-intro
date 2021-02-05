package IBAN_validation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        IBAN iban = new IBAN();

        while (true) {
            System.out.print("Enter IBAN: ");

            String acc = scanner.nextLine();

            if (acc.length() == 0) break;

            System.out.println("IBAN: " + acc + "; Validity: " + IBAN.isValidIBAN(acc));
        }
    }
}
