package Cipher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class otherCipher implements Coder {

    @Override
    public void messageCoder() throws FileNotFoundException {
        File file = new File("./src/resource/message.txt");
        Scanner scan = new Scanner(file);
        String message = scan.nextLine(), reverse = "";
        char ch;

        System.out.println("Original Message: " + "\n" + message);

        for (int i = 0; i < message.length(); i++) {
            ch = message.charAt(i); //extracts each character
            reverse = ch + reverse; //adds each character in front of the existing string
        }
        System.out.println("Cipher Message: " + "\n" + reverse);

        try {
            FileWriter filetxt = new FileWriter("output.txt");
            filetxt.write("Original Message: " + "\n" + message + "\n" + "Cipher Message: " + "\n" + reverse);
            filetxt.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
