package PolymorphismLab.WildAnimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input=reader.readLine();
        int count=0;
        Animal animal=null;
        List<Animal> animals=new ArrayList<>();
        while (!input.equals("End")){
            String[] data = input.split("\\s+");
            if(count%2==0){
               switch (data[0]){
                   case "Cat": animal=new Cat(data[1],data[0],Double.parseDouble(data[2]),data[3],data[4]);break;
                   case "Tiger":animal=new Tiger(data[1],data[0],Double.parseDouble(data[2]),data[3]);break;
                   case "Zebra":animal=new Zebra(data[1],data[0],Double.parseDouble(data[2]),data[3]);break;
                   case "Mouse":animal=new Mouse(data[1],data[0],Double.parseDouble(data[2]),data[3]);break;
               }
               animals.add(animal);
            }else{
               Food food=null;
               switch (data[0]){
                   case "Vegetable": food=new Vegetable(Integer.parseInt(data[1]));break;
                   case "Meat":food=new Meat(Integer.parseInt(data[1]));break;
               }
               animals.get(animals.size()-1).makeSound();
               animal.eat(food);
            }
            count++;
            input= reader.readLine();
        }
        animals.forEach(System.out::println);
    }
}
