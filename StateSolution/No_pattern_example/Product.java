public class Product {
    //what if you want to add a different state? => new variable and you have to change each function :(
    final static int availabe =0;
    final static int damaged = 1;
    final static int removed = 2;
    final static int rented = 3;


    int state;

    public Product(){
        state = availabe;
    }

    public void rent(){
        if(state == availabe){
            System.out.println("you have rented the product");
            state = rented;
        }
        else if(state == damaged){
            System.out.println("Product cannot be Rented because it is damaged");
        }
        else if(state == removed){
            System.out.println("Product cannot be Rented because it is removed");
        }
        else if(state == rented){
            System.out.println("product is already rented out");
        }
    }

    public void remove(){
        if(state == availabe){
            System.out.println("you have removed the product");
            state = removed;
        }
        else if(state == damaged){
            System.out.println("Product cannot be removed because it is damaged");
        }
        else if(state == removed){
            System.out.println("Product cannot be removed because it is already removed");
        }
        else if(state == rented){
            System.out.println("product cannot be removed because it is rented out.");
        }
    }

    public void setAvailabe(){
        if(state == availabe){
            System.out.println("Product is already available");
        }
        else if(state == damaged){
            System.out.println("Product cannot be set avalable because it is damaged");
        }
        else if(state == removed){
            System.out.println("Product cannot be set available because it is removed");
        }
        else if(state == rented){
            System.out.println("You have set the product available");
            state = availabe;
        }
    }

    public void damage(){
        if(state == availabe){
            System.out.println("Product cannot be damaged");
        }
        else if(state == damaged){
            System.out.println("Product cannot be damaged");
        }
        else if(state == removed){
            System.out.println("Product cannot be damaged");
        }
        else if(state == rented){
            System.out.println("You have damaged the product");
            state = damaged;
        }
    }
}
