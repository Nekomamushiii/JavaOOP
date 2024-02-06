package WorkingAbstractionExe.Greedy;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        Bag bag= new Bag(capacity);
        String[] items = scanner.nextLine().split("\\s+");
        Map<String,Map<String,Integer>> map = new LinkedHashMap<>();
        for(int i=0;i<items.length;i+=2){
            String name = items[i];
            int value = Integer.parseInt(items[i+1]);
            Item item = new Item(name,value);

            if(bag.check(item)){
                if (!map.containsKey(bag.getName())) {
                    map.put(bag.getName(), new LinkedHashMap<>());

                }
                if(map.get(bag.getName()).containsKey(item.getName()))
                    map.get(bag.getName()).put(item.getName(),map.get(bag.getName()).get(item.getName())+item.getValue());
                else
                    map.get(bag.getName()).put(item.getName(),item.getValue());
            }
        }
        for (Map.Entry<String,Map<String,Integer>>entry:map.entrySet()){
            if(bag.getCheckItem().containsKey(entry.getKey())){
                System.out.printf("<%s> %d\n",entry.getKey(),bag.getCheckItem().get(entry.getKey()));
                Map<String,Integer> sortedMap=new TreeMap<>(Collections.reverseOrder());
                sortedMap.putAll(entry.getValue());
                sortedMap.forEach((k, v)->System.out.printf("##%s - %d\n",k,v));
               // entry.getValue().forEach((k,v)-> System.out.printf("##%s - %d\n",k,v));
            }
        }
    }
}
