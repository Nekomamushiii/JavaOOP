package EncapsulationExe.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;


    public Pizza(String name, int numberOfTopping) {
        this.setName(name);
        this.setToppings(numberOfTopping);
    }

    public String getName() {
        return name;
    }


    private void setName(String name) {
        if(name.trim().length()<1 || name.length()>15)
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }


    public void setToppings(int numberOfTopping) {
        if(numberOfTopping<0|| numberOfTopping>10)
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        this.toppings=new ArrayList<>();

    }
    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }
    public double getOverallCalories(){
        return this.toppings.stream().mapToDouble(Topping::calculateCalories).sum() + this.dough.calculateCalories();
    }
}
