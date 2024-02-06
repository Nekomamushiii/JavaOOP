package InterfacesAbstractionExe.birthdayCelebration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();
        List<Birthable> birthableList=new ArrayList<>();
        while (!input.equals("End")){
            String[] data = input.split("\\s+");
            switch (data[0]){
                case "Citizen":
                    birthableList.add( new Citizen(data[1],Integer.parseInt(data[2]),data[3],data[4]));
                    break;
                case "Pet": birthableList.add(new Pet(data[1],data[2]));break;

            }
            input=scanner.nextLine();
        }
        String date = scanner.nextLine();
        boolean haveBirthdate=false;
        for(Birthable birthable:birthableList){
            if(birthable.getBirthDate().endsWith(date)){
                System.out.println(birthable.getBirthDate());
                haveBirthdate=true;
            }
        }
        if(!haveBirthdate)
            System.out.println("<no output>");
    }
}
