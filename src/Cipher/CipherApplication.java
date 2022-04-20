package Cipher;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class CipherApplication {
    public static void main(String[] args) throws FileNotFoundException {
        String optionCipher;
        System.out.print("Enter an option to cipher the message" + "\n" + "1: Caesar Cipher" + "\n" + "2: Other Cipher" + "\n");
        Scanner scanner = new Scanner(System.in);
        optionCipher = scanner.next();

        if (optionCipher.equals("1")) {
            Coder c1 = CipherFactory.construir(1);
            c1.messageCoder();

        } else if (optionCipher.equals("2")) {
            Coder c2 = CipherFactory.construir(2);
            c2.messageCoder();
        } else {
            System.out.println("Cipher method don't exist");
        }

    }
}
