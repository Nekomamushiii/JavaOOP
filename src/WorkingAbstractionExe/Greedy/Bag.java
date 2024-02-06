package WorkingAbstractionExe.Greedy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Bag {
    private int capacity;
    private String name;
    private Map<String,Integer> checkItem;
    private Map<String,List<Item>> itemAddMap;

    public Bag(int capacity) {
        this.capacity = capacity;
        this.checkItem=new LinkedHashMap<>();
        this.itemAddMap=new LinkedHashMap<>();
    }
    public void name(Item item){
        if(item.getName().length()==3)
            this.name="Cash";
        else if(item.getName().toLowerCase().endsWith("gem"))
            this.name="Gem";
        else if(item.getName().toLowerCase().equals("gold"))
            this.name="Gold";
    }

    public boolean check(Item item){
       name(item);
       if(this.name.equals(""))
           return false;
       else if(this.capacity<checkItem.values().stream().mapToInt(e->e).sum()+item.getValue())
           return false;
       switch (this.name){
           case "Gem":{
               if(!checkItem.containsKey(this.name)){
                   if(checkItem.containsKey("Gold")){
                       if(item.getValue()>checkItem.get("Gold"))
                           return false;
                   }else
                       return false;
               }else if(checkItem.get(this.name)+item.getValue()>checkItem.get("Gold"))
                   return false;
           }break;
           case "Cash":{
               if(!checkItem.containsKey(this.name)){
                   if(checkItem.containsKey("Gem")){
                       if(item.getValue()>checkItem.get("Gold"))
                           return false;
                   }else
                       return false;
               }else if(checkItem.get(this.name)+item.getValue()>checkItem.get("Gem"))
                   return false;
           }break;
       }
       if(checkItem.containsKey(this.name))
           checkItem.put(this.name, checkItem.get(this.name)+item.getValue());
       else
           checkItem.put(this.name,item.getValue());
       return true;
    }
    public String getName(){
        return this.name;
    }

    public Map<String, Integer> getCheckItem() {
        return checkItem;
    }
}
