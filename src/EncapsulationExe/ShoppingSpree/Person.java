package EncapsulationExe.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products=new ArrayList<>();
    }

    private void setName(String name) {
        if(name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    private void setMoney(double money) {
        if(money<0)
            throw new IllegalArgumentException("Money cannot be negative");
        this.money = money;
    }
    public void buyProduct(Product product){
        if(product.getCost()<=this.getMoney()){
            this.products.add(product);
            this.setMoney(this.getMoney()-product.getCost());
            System.out.printf("%s bought %s\n",this.getName(),product.getName());
        }
        else
            throw new IllegalArgumentException(String.format("%s can't afford %s",this.getName(),product.getName()));
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

}
