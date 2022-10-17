package domain;

import domain.priceState.RentPrice;
import domain.productState.*;

public abstract class Product {
    private final int id;
    private final String title;
    private ProductState uitlenen;
    private ProductState terugbrengen;
    private ProductState repareren;
    private ProductState verwijderd;

    private ProductState state=uitlenen;

    private RentPrice rentPrice;

    public Product(int id, String title) {
        this.id = id;
        this.title = title;

        uitlenen = new Uitlenen(this);
        terugbrengen = new Terugbrengen(this);
        repareren = new Repareren(this);
        verwijderd = new Verwijderd(this);
    }

    public ProductState getState() {
        return state;
    }

    public void setState(ProductState state) {
        this.state = state;
    }

    public void setRentPrice(RentPrice rentPrice){
        this.rentPrice = rentPrice;
    }

    public void uitlenen(){
        state.uitlenen();
    }

    public int getRentPrice(int days){
        return this.rentPrice.calcPrice(days);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public abstract double getPrice(int days);

    public ProductState getUitlenen() {
        return uitlenen;
    }

    public ProductState getTerugbrengen() {
        return terugbrengen;
    }

    public ProductState getRepareren() {
        return repareren;
    }

    public ProductState getVerwijderd() {
        return verwijderd;
    }

    public RentPrice getRentPrice() {
        return rentPrice;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nTitle: " + title +
                "\nAvailable: " + state;
    }
}
