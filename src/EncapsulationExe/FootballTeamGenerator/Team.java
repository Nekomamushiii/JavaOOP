package EncapsulationExe.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
    public void addPlayer(Player player){
        this.players.add(player);
    }
    public void removePlayer(String name){
      boolean isRemoved=players.removeIf(e->e.getName().equals(name));
      if(!isRemoved)
          throw new NullPointerException(String.format("Player %s is not in %s team.",name,this.name));

    }
    public double getRating(){
        double sum =0;
        for(Player player:this.players){
            sum+=player.overallSkillLevel();
        }
        return sum/players.size();
    }
}
