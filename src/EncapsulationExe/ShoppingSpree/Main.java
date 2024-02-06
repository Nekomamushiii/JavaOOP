package EncapsulationExe.ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] personInput = reader.readLine().split(";");
        String[] productInput = reader.readLine().split(";");
        List<Person> people = new ArrayList<>();
        List<Product> productList=new ArrayList<>();
        try {
            for(String per:personInput){
                String[] data = per.split("=");
                Person person = new Person(data[0],Double.parseDouble(data[1]));
                people.add(person);
            }
            for(String pro:productInput){
                String[] data = pro.split("=");
                Product product=new Product(data[0],Double.parseDouble(data[1]));
                productList.add(product);
            }

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return;
        }
        String command = reader.readLine();
        while (!command.equals("END")){
            String[] comm = command.split("\\s+");
            try{
                for(Person p:people){
                    if(p.getName().equals(comm[0])){
                        for(Product pro:productList){
                            if(pro.getName().equals(comm[1]))
                                p.buyProduct(pro);
                        }
                    }
                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            command= reader.readLine();
        }
        for(Person person:people){
            if(person.getProducts().isEmpty())
                System.out.printf("%s - Nothing bought\n",person.getName());
            else{
                System.out.printf("%s - %s\n",person.getName(),person.getProducts().stream().map(Product::getName).collect(Collectors.joining(", ")));

            }
        }

    }
}
