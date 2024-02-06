package InterfacesAbstractionExe.foodShortage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Buyer> map = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            String[] data = scanner.nextLine().split("\\s+");
            Buyer buyer =null;
            if(data.length==4)
                buyer = new Citizen(data[0],Integer.parseInt(data[1]),data[2],data[3]);
            else
                buyer = new Rebel(data[0],Integer.parseInt(data[1]),data[2]);
            map.put(data[0],buyer);
        }
        String name = scanner.nextLine();
        while (!name.equals("End")){
            if(map.containsKey(name))
                map.get(name).buyFood();
            name=scanner.nextLine();
        }
        int sum = 0;
        for(Map.Entry<String,Buyer>entry: map.entrySet()){
            sum+=entry.getValue().getFood();
        }
        System.out.println(sum);
    }
}
