public class RentedState extends StateContext {
    private Product p;

    public RentedState(Product product){
        this.p = product;
    }

    public void setAvailable(){
        System.out.println("You gave this product back");
        p.setState(p.getAvailableState());
    }

    @Override
    public void damage() {
        System.out.println("You gave damaged this product");
        //p.setState(p.getDamagedState());
    }
}
