public class AvailableState extends StateContext {

    private StateProduct p;

    public AvailableState(StateProduct product){
        this.p = product;
    }

    @Override
    public void rent(){
        System.out.println("you have rented this product out.");
        p.setState(p.getRentedState());
    }

    @Override
    public void remove(){
        System.out.println("you have removed this product.");
    }
}
