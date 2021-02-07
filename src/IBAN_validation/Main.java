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

//        IBAN iban = new IBAN();

        while (true) {
            System.out.print("Enter IBAN: ");

            String acc = scanner.nextLine();

            if (acc.length() == 0) break;

            System.out.println("IBAN: " + acc + "; Validity: " + IBAN.isValidIBAN(acc));
        }
    }

    private static void fileMode(String filename){
        try {
            Reader reader = new FileReader(filename);

            String filenameOut = filename + ".out";

            Writer writer = new FileWriter(filenameOut);

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
