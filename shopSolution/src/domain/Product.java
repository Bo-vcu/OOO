package domain;

public abstract class Product {
    private final int id;
    private final String title;
    private int available;

    private RentPrice rentPrice;

    public Product(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void setRentPrice(RentPrice rentPrice){
        this.rentPrice = rentPrice;
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

    @Override
    public String toString() {
        return "ID: " + id +
                "\nTitle: " + title +
                "\nAvailable: " + available;
    }

    public void setAvailable (int state) throws IllegalArgumentException {
        if (state>2) throw new IllegalArgumentException("choose valid state");
        if (this.available == state) {
            String m = "Product is already set as "+stateToString(state);
            throw new IllegalArgumentException(m);
        }
        this.available = state;
    }

    private String stateToString(int state) {
        switch (state){
            case 0:
                return "available";
            case 1:
                return "rented";
            case 2:
                return "damaged";
        }
        return "error";
    }
}
