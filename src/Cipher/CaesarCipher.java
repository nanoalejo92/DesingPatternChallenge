package Cipher;

import java.io.*;
import java.util.Scanner;

public class CaesarCipher implements Coder {

    @Override
    public void messageCoder() throws FileNotFoundException {

        File file = new File("./src/resource/message.txt");
        Scanner scan = new Scanner(file);
        String message = scan.nextLine();
        char[] chars = message.toCharArray();
        int key = 5;

        System.out.println("Original Message: " + "\n" + message);
        System.out.println("Cipher Message: ");

        for (char c : chars) {
            c += key;
            System.out.print(c);
        }

        try {
            FileWriter filetxt = new FileWriter("output.txt");
            filetxt.write("Original Message: " + "\n" + message + "\n" + "Cipher Message: " + "\n");
            filetxt.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

