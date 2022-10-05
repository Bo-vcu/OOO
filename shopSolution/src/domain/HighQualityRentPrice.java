package domain;

public class HighQualityRentPrice implements RentPrice {


    @Override
    public int calcPrice(int days) {
        return days * 2;
    }
}
