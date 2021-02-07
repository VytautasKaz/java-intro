package IBAN_validation;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0){
            interactiveMode();
        } else if (args.length == 1){
            fileMode(args[0]);
        } else {
            System.err.println("Invalid amount of arguments.");
        }
    }

    private static void interactiveMode(){
        Scanner scanner = new Scanner(System.in);

        IBAN iban = new IBAN();

        while (true) {
            System.out.print("Enter IBAN: ");

            String acc = scanner.nextLine();

            if (acc.length() == 0) break;

            boolean isValid = iban.isValidIBAN(acc);

            System.out.println("IBAN: " + acc + "; Validity: " + isValid);
        }
    }

    private static void fileMode(String filename){
        IBAN iban = new IBAN();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            int dot = filename.lastIndexOf('.');

            String name = dot == -1 ? filename : filename.substring(0, dot);

            String filenameOut = name + ".out";

            BufferedWriter writer = new BufferedWriter(new FileWriter(filenameOut));

            String line;
            while ((line = reader.readLine()) != null) {

                boolean isValid = iban.isValidIBAN(line);

                writer.write(line + "; " + isValid + '\n');
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
