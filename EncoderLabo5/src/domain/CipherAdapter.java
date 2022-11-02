package domain;

public class CipherAdapter extends RandomCypher {
    private Cipher cipher;

    public CipherAdapter(Cipher cipher){
        this.cipher=cipher;
    }

    @Override
    public char[] encypher(char[] message) {
        return cipher.code(String.valueOf(message)).toCharArray();
    }

    @Override
    public char[] decypher(char[] message) {
        return cipher.decode(String.valueOf(message)).toCharArray();
    }
}
