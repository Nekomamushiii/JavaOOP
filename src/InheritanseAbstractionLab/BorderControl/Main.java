package InheritanseAbstractionLab.BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String comm = scanner.nextLine();
        List<Identifiable> ids=new ArrayList<>();

        while (!comm.equals("End")){
            String[] input = comm.split(" ");
            if(input.length==3)
                ids.add(new Citizen(input[0],Integer.parseInt(input[1]),input[2]));
            else if(input.length==2)
                ids.add(new Robot(input[0],input[1]));
            comm=scanner.nextLine();
        }
        String id = scanner.nextLine();

        for(Identifiable i:ids){
            if(i.getId().endsWith(id))
                System.out.println(i.getId());
        }


    }
}
