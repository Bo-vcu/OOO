package domain;

public interface Subject {
    public void addObserver(BankEvent e, Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(BankEvent e, Rekening ba,

                                int depositamt);
}
