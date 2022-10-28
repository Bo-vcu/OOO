package domain;

public class Auditor implements Observer {

    public Auditor(Bank bank) {

        bank.addObserver(BankEvent.NEW, this);

    }

    public void update(BankEvent e, Rekening ba, int depositamt) {

        System.out.println("New account: "

                + ba.getRekeningnummer());

    }

}
