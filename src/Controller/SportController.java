package Controller;

import Service.SportService;
import java.util.*;

public class SportController {
    SportService sportService = new SportService();

    public void sportSquadra(){
        List<String> list = sportService.sportSquadra();
        for(String s: list){
            System.out.println(s);
        }
    }

    public void atletiPerSport(){
        List<String> list = sportService.atletiPerSport();
        for(String s: list){
            System.out.println(s);
        }
    }
}
