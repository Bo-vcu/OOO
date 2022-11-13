package domain;

import java.util.Arrays;

public class CipherAdapter implements Cipher {
    private RandomCypher rcipher;

    public CipherAdapter(){
        rcipher=new RandomCypher();
    }



    @Override
    public String code(String text) {
        char[] secret=rcipher.encypher(text.toCharArray());
        System.out.println(secret);
        StringBuilder res= new StringBuilder();
        for (char c:secret){
            res.append(c);
        }
        return res.toString();
    }

    @Override
    public String decode(String secret) {
        char[] text=rcipher.decypher(secret.toCharArray());
        System.out.println(text);
        StringBuilder res= new StringBuilder();
        for (char c:text){
            res.append(c);
        }
        return res.toString();
    }
}
