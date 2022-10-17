package domain;

import java.util.HashMap;
import java.util.List;

public class Bank implements Subject {

    private List<Observer> observers;
    private HashMap<Integer,Rekening> rekeningen;
    public void openRekening(Rekening rekening){
        rekeningen.put(rekening.getRekeningnummer(), rekening);
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {

    }
}
