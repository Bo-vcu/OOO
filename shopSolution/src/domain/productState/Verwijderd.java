package domain.productState;

import domain.Product;

public class Verwijderd extends ProductState{
    Product product;

    public Verwijderd(Product product){
        this.product=product;
    }
}
