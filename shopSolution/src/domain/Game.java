package domain;

import domain.priceState.LowQualityRentPrice;

public class Game extends Product{

    public Game(int id, String title) {
        super(id, title);
        this.setRentPrice(new LowQualityRentPrice());
    }

    @Override
    public double getPrice(int days) {
        return days * 3;
    }

    @Override
    public String toString() {
        return  "-Game-\n" + super.toString();
    }
}
