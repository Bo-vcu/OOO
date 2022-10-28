public class StateProduct {

    private StateContext rentedState;
    private StateContext availableState;

    private StateContext state;

    public StateProduct(){
        rentedState = new RentedState(this);
        availableState = new AvailableState(this);
    }

    public StateContext getState(){
        return state;
    }

    public void setState(StateContext state){
        this.state = state;
    }

    public StateContext getRentedState(){
        return rentedState;
    }

    public StateContext getAvailableState(){
        return availableState;
    }

    public void setAvailable(){
        state.setAvailable();
    }

    public void rent(){
        state.rent();
    }

}
