package Cipher;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class OtherCipherTest {

    @Test
    public void messageCoder() throws FileNotFoundException {
        File file = new File("/Users/johanalejandrorobeltobayona/IdeaProjects/DesingPatternChallenge/src/resource/message.txt");
        Scanner scan = new Scanner(file);
        String message = scan.nextLine(), nstr = "";
        char ch;
        System.out.println("Original Message: " + "\n" + message);

        for (int i = 0; i < message.length(); i++) {
            ch = message.charAt(i); //extracts each character
            nstr = ch + nstr; //adds each character in front of the existing string
        }
        System.out.println("Cipher Message: " + "\n" + nstr);
    }
}