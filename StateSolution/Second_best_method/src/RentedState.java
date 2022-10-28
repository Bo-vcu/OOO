public class RentedState extends StateContext {
    private StateProduct p;

    public RentedState(StateProduct product){
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
