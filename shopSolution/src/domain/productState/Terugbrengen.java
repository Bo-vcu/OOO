package domain.productState;

import domain.Product;

public class Terugbrengen extends ProductState {
    Product product;

    public Terugbrengen(Product product) {
        this.product = product;
    }

    @Override
    public void terugbrengen() {
        super.terugbrengen();
    }
}
