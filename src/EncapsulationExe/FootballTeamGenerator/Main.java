package EncapsulationExe.FootballTeamGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String comm = reader.readLine();
        Map<String,Team> teamMap=new LinkedHashMap<>();
        Team team=null;
        while (!comm.equals("END")){
            String[] input = comm.split(";");

            switch (input[0]){
                case "Team":{
                    team=new Team(input[1]);
                    teamMap.putIfAbsent(input[1],team);}break;
                case "Add":
                {
                    try {
                        if(teamMap.containsKey(input[1])){
                            teamMap.get(input[1]).addPlayer(new Player(input[2],Integer.parseInt(input[3]),
                                    Integer.parseInt(input[4]),Integer.parseInt(input[5]),Integer.parseInt(input[6]),
                                    Integer.parseInt(input[7])));
                        }else
                            System.out.printf("Team %s does not exist.%n",input[1]);
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    }break;
                case "Remove": {
                    try {
                        teamMap.get(input[1]).removePlayer(input[2]);
                    }catch (NullPointerException e){
                        System.out.println(e.getMessage());
                    }
                }break;
                case "Rating": {
                   if(teamMap.containsKey(input[1]))
                       System.out.printf("%s - %d\n",input[1],Math.round(teamMap.get(input[1]).getRating()));
                   else
                       System.out.printf("Team %s does not exist.\n",input[1]);
                }break;
            }
            comm= reader.readLine();
        }
    }
}
