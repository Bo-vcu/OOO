package domain;

/**Strategy interface*/
public interface Cipher {
    String code(String text);
    String decode(String secret);
}
