package Cipher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class caesarCipher implements Coder {

    @Override
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

