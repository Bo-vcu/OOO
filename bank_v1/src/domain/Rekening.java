package domain;

public class Rekening {
    private int rekeningnummer;
    private double saldo;

    public Rekening(int rekeningnummer, double saldo) {
        this.rekeningnummer = rekeningnummer;
        this.saldo = saldo;
    }

    public int getRekeningnummer() {
        return rekeningnummer;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposit(int amt) {
    }
}
