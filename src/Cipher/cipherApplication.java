package Cipher;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cipherApplication {
    public static void main(String[] args) throws FileNotFoundException {
        String optionCipher;
        System.out.print("Enter an1 option to cipher the message" + "\n" + "1: Caesar Cipher" + "\n" + "2: Other Cipher" + "\n");
        Scanner scanner = new Scanner(System.in);
        optionCipher = scanner.next();

        if (optionCipher.equals("1")) {
            Coder c1 = cipherFactory.construir(1);
            c1.messageCoder();

        } else if (optionCipher.equals("2")) {
            Coder c2 = cipherFactory.construir(2);
            c2.messageCoder();
        } else {
            System.out.println("Cipher method don't exist");
        }

    }
}
