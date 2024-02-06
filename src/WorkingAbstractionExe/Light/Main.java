package WorkingAbstractionExe.Light;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] lights = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        List<TrafficLight> lightList = new ArrayList<>();
        for(String light:lights){
           Color color =Color.valueOf(light);
           TrafficLight trafficLight = new TrafficLight(color);
           lightList.add(trafficLight);
        }
        for(int i=0;i<n;i++){
            for(TrafficLight light:lightList){
                light.change();
                System.out.print(light.getColor()+" ");
            }
            System.out.println();
        }
    }
}
