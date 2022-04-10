package Cipher;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class caesarCipherTest {

    @Test
    public void messageCoder() throws FileNotFoundException {

        File file = new File("/Users/johanalejandrorobeltobayona/IdeaProjects/DesingPatternChallenge/src/resource/message.txt");
        Scanner scan = new Scanner(file);
        String message = scan.nextLine();
        char[] chars = message.toCharArray();

        System.out.println("Original Message: " + "\n" + message);
        System.out.println("Cipher Message: ");

        for (char c : chars) {
            c += 5;
            System.out.print(c);
        }


    }
}