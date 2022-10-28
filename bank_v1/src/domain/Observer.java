package domain;

public interface Observer {
    void update(BankEvent e, Rekening ba, int depositamt);

}
