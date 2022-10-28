package domain;

/**Strategy interface*/
public interface CipherSolution {
    String code(String text);
    String decode(String secret);
}
