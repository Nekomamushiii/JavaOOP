package EncapsulationExe.PizzaCalories;

public class Dough {
    private static final double BASE_CALORIES=2;
    private static final String FLOUR_WHITE="White";
    private static final double FLOUR_WHITE_VAL=1.5;
    private static final String FLOUR_WHOLEGRAIN="Wholegrain";
    private static final double FLOUR_WHOLEGRAIN_VAL=1.0;
    private static final String BAKING_TECH_CRISPY="Crispy";
    private static final double BAKING_TECH_CRISPY_VAL =0.9;
    private static final String BAKING_TECH_CHEWY="Chewy";
    private static final double BAKING_TECH_CHEWY_VAL=1.1;
    private static final String BAKING_TECH_HOMEMADE="Homemade";
    private static final double BAKING_TECH_HOMEMADE_VAL=1.0;

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if(!flourType.equals(FLOUR_WHITE) && !flourType.equals(FLOUR_WHOLEGRAIN))
           throw new IllegalArgumentException("Invalid type of dough.");
        this.flourType=flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if(bakingTechnique.equals(BAKING_TECH_CHEWY) ||
        bakingTechnique.equals(BAKING_TECH_CRISPY) ||
        bakingTechnique.equals(BAKING_TECH_HOMEMADE))
           this.bakingTechnique = bakingTechnique;
        else
            throw new ArithmeticException("Invalid type of dough.");
    }

    private double getFlourTypeVal() {
        if(this.flourType.equals(FLOUR_WHITE))
            return FLOUR_WHITE_VAL;
        else if(this.flourType.equals(FLOUR_WHOLEGRAIN))
            return FLOUR_WHOLEGRAIN_VAL;
        return 0;
    }


    private void setWeight(double weight) {
        if(weight < 1 || weight>200)
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        this.weight = weight;
    }


    private double getBakingTechValue() {
       if(this.bakingTechnique.equals(BAKING_TECH_CHEWY))
           return BAKING_TECH_CHEWY_VAL;
       else if(this.bakingTechnique.equals(BAKING_TECH_CRISPY))
           return BAKING_TECH_CRISPY_VAL;
       else if(this.bakingTechnique.equals(BAKING_TECH_HOMEMADE))
           return BAKING_TECH_HOMEMADE_VAL;
       return 0;
    }
    public double calculateCalories(){
        return BASE_CALORIES*this.weight*getFlourTypeVal()*getBakingTechValue();
    }

}
