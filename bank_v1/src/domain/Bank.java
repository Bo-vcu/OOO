package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank implements Subject {

    private Map<Integer,Rekening> accounts;

    private int nextacct;

    private Map<BankEvent,List<Observer>> observers

            = new HashMap<>();

    public Bank(Map<Integer,Rekening> accounts, int n) {

        this.accounts = accounts;

        nextacct = n;

        for (BankEvent e : BankEvent.values())

            observers.put(e, new ArrayList<Observer>());

    }
    @Override
    public void addObserver(BankEvent e, Observer obs) {

        observers.get(e).add(obs);

    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifyObservers(BankEvent e, Rekening ba,

                                int depositamt) {

        for (Observer obs : observers.get(e))

            obs.update(e, ba, depositamt);

    }

    public int newAccount(int type) {

        int acctnum = nextacct++;

        Rekening ba =

                AccountFactory.createAccount(type, acctnum);

        accounts.put(acctnum, ba);

        notifyObservers(BankEvent.NEW, ba, 0);

        return acctnum;

    }

    public void deposit(int acctnum, int amt) {

        Rekening ba = accounts.get(acctnum);

        ba.deposit(amt);

        notifyObservers(BankEvent.DEPOSIT, ba, amt);

    }

//...

}
