package EncapsulationExe.PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] pizzaInput=reader.readLine().split("\\s+");
        String[] doughInput = reader.readLine().split("\\s+");
        Pizza pizza=null;
        try {
            pizza=new Pizza(pizzaInput[1],Integer.parseInt(pizzaInput[2]));
            Dough dough=new Dough(doughInput[1],doughInput[2],Double.parseDouble(doughInput[3]));
            pizza.setDough(dough);
            String command = reader.readLine();
            while (!command.equals("END")){
                String[] topping = command.split("\\s+");
                pizza.addTopping(new Topping(topping[1],Double.parseDouble(topping[2])));
                command= reader.readLine();
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return;
        }
        System.out.printf("%s - %.2f\n",pizza.getName(),pizza.getOverallCalories());
    }
}
