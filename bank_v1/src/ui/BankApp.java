package ui;

import domain.Auditor;
import domain.Bank;
import domain.Rekening;

import java.util.Map;

public class BankApp {

    public static void main(String[] args) {
        //TO DO
        Map<Integer, Rekening> accounts =  //inlezen accounts uit vb database

        int nextacct = info.nextAcctNum();

        Bank bank = new Bank(accounts, nextacct);

        Auditor aud = new Auditor(bank);

//...

    }

}
