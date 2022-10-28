public class StateContext {
    private StateProduct product;

    public StateContext(){
        product = new StateProduct();
    }

    public void rent() {
        throw new IllegalArgumentException("Product cannot be Rented because it is " );
    }
    public void setAvailable() {
        throw new IllegalArgumentException("Product cannot be Available because it is ");
    }

    public void damage() {
        throw new IllegalArgumentException("Product cannot be Damaged because it is " );
    }

    public void fixDamage() {
        throw new IllegalArgumentException("Product cannot be Fixed because it is ");
    }

    public void remove() {
        throw new IllegalArgumentException("Product cannot be Removed because it is ");
    }

}
