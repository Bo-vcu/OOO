package domain;

public class LowQualityRentPrice implements RentPrice{


    @Override
    public int calcPrice(int days) {
        return days * 1;
    }

}
