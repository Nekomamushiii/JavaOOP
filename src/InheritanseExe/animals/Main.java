package InheritanseExe.animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("Beast!")){
             String type = input;
             String[] data = scanner.nextLine().split("\\s+");
             try {
                 switch (type){
                     case "Dog": {
                         Dog dog=new Dog(data[0],Integer.parseInt(data[1]),data[2]);
                         System.out.println(dog.toString());
                     }break;
                     case "Cat":Cat cat=new Cat(data[0],Integer.parseInt(data[1]),data[2]);
                         System.out.println(cat.toString());break;
                     case "Frog": Frog frog=new Frog(data[0],Integer.parseInt(data[1]),data[2]);
                         System.out.println(frog.toString());break;
                     case "Kitten":  Kitten kitten=new Kitten(data[0],Integer.parseInt(data[1]));
                         System.out.println(kitten.toString());  break;
                     case "Tomcat":Tomcat tomcat=new Tomcat(data[0],Integer.parseInt(data[1]));
                         System.out.println(tomcat.toString());break;
                     default:
                         System.out.println("Invalid input!");break;
                 }
             }catch (IllegalArgumentException e){
                 System.out.println(e.getMessage());

             }

             input=scanner.nextLine();
        }
    }
}
