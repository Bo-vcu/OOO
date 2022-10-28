package domain;

/**Context class*/
public class CodingContext {
    private CipherSolution cipher;

    /**Behaviour is interchangeable at runtime*/
    public void setCipher(CipherSolution cipher) {
        this.cipher = cipher;
    }

    public String code(String s) {
        return cipher.code(s);
    }
    public String decode(String s) {
        return cipher.decode(s);
    }
}
