package Controller;

import Service.AtletiService;

import java.sql.SQLException;
import java.util.*;

public class AtletiController {
    AtletiService oAtletiService = new AtletiService();

    public void atletiGiovaniTennis(){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Inserire nonme Sport");
        String nSport = scanner.nextLine();
        System.out.println("Inserire eta Atleta");
        int etaAtleta = scanner.nextInt();
        List<String> list = oAtletiService.atletiGiovaniTennis(nSport, etaAtleta);
        for(String s : list){
          System.out.println(s);
        };
    }
    public void altezzaSopraLaMedia(){
        List<String> list = oAtletiService.altezzaSopraLaMedia();
        for(String s : list){
            System.out.println(s);
        }
    }

}
