package Cipher;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class cipherApplication {
    public static void main(String[] args) throws FileNotFoundException {
        String optionCipher;
        System.out.print("Enter a option to cipher the message" + "\n" + "1: Caesar Cipher" + "\n" + "2: Other Cipher" + "\n");
        Scanner scanner = new Scanner(System.in);
        optionCipher = scanner.next();

        if (optionCipher.equals("1")) {
            Coder c1 = cipherFactory.construir(1);
            c1.messageCoder();
        } else {
            Coder c2 = cipherFactory.construir(2);
            c2.messageCoder();
        }

    }
}
