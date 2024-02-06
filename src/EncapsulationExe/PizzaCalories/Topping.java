package EncapsulationExe.PizzaCalories;

public class Topping {
    private static final double BASE_CALORIES=2;
    private static final String TYPE_MEAT="Meat";
    private static final double TYPE_MEAT_VAL=1.2;
    private static final String TYPE_VEGGIES="Veggies";
    private static final double TYPE_VEGGIES_VAL=0.8;
    private static final String TYPE_CHEESE="Cheese";
    private static final double TYPE_CHEESE_VAL=1.1;
    private static final String TYPE_SAUCE="Sauce";
    private static final double TYPE_SAUCE_VAL=0.9;
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if(!toppingType.equals(TYPE_MEAT) && !toppingType.equals(TYPE_VEGGIES) && !toppingType.equals(TYPE_CHEESE) && !toppingType.equals(TYPE_SAUCE))
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.",toppingType));
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if(weight<1 || weight>50)
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].",this.toppingType));
        this.weight = weight;
    }
    private double getTypeVal(){
        switch (this.toppingType){
            case TYPE_MEAT : return TYPE_MEAT_VAL;
            case TYPE_VEGGIES: return TYPE_VEGGIES_VAL;
            case TYPE_CHEESE: return TYPE_CHEESE_VAL;
            case TYPE_SAUCE:return TYPE_SAUCE_VAL;
        }
        return 0;
    }
    public double calculateCalories(){
        return BASE_CALORIES*this.weight*getTypeVal();
    }
}
