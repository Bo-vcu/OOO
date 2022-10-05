package domain;

import java.util.Comparator;

public class ProductTitleComparator implements Comparator<Product> {

    @Override
    public int compare(Product a, Product b) {
        return a.getTitle().compareToIgnoreCase(b.getTitle());
    }
}

