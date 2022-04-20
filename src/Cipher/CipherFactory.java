package Cipher;

public class CipherFactory {
    public static Coder construir(int option){
        switch (option){
            case 1:
                return new CaesarCipher();
            case 2:
                return new OtherCipher();
            default:
                System.out.println("Cipher option no valid");
                return null;

        }

    }
}
