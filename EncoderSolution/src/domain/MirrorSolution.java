package domain;

/**Concrete strategy class*/
public class MirrorSolution implements CipherSolution {

    public String code(String text) {
        return mirrorText(text);
    }

    public String decode(String secret) {
        return mirrorText(secret);
    }

    private String mirrorText(String text) {
        return String.valueOf(new StringBuilder().append(text).reverse());
    }
}
