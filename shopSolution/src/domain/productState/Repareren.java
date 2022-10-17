package domain.productState;

import domain.Product;

public class Repareren extends ProductState{
    Product product;

    public Repareren(Product product) {
        this.product = product;
    }
}
