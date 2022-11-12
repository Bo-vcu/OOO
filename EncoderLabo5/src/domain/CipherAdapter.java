package domain;

import java.util.Arrays;

public class CipherAdapter implements Cipher {
    private RandomCypher rcipher;

    public CipherAdapter(){
        rcipher=new RandomCypher();
    }



    @Override
    public String code(String text) {
        return Arrays.toString(rcipher.encypher(text.toCharArray()));
    }

    @Override
    public String decode(String secret) {
        return Arrays.toString(rcipher.decypher(secret.toCharArray()));
    }
}
