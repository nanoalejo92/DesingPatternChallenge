package Cipher;

public class cipherFactory {
    public static Coder construir(int option){
        switch (option){
            case 1:
                return new caesarCipher();
            case 2:
                return new otherCipher();
            default:
                System.out.println("Cipher option no valid");
                return null;

        }

    }
}
