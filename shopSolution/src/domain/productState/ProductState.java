package domain.productState;

public abstract class ProductState {
    public void uitlenen(){
        throw new IllegalStateException("aaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
    public void terugbrengen(){
        throw new IllegalStateException("product is al uitgeleend");
    }
    public void beschadigd(){}
    public void verwijderd(){}

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
