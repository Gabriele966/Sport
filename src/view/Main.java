package view;
import Controller.AtletiController;
import Controller.SportController;


import java.util.*;
public class Main {
    public static void main(String[] args) {
        SportController oSportControler = new SportController();
        AtletiController oAtletiControler = new AtletiController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selezionare azione:");
        System.out.println("1) Lista di tutti gli sport di squadra: ");
        System.out.println("2) Atleti di una specifica disciplina con una specifica eta");
        System.out.println("3) quanti atleti fanno uno specifico sport");
        System.out.println("4) quanti atleti altezza sopra la media");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                oSportControler.sportSquadra();
                break;
            case 2:
                oAtletiControler.atletiGiovaniTennis();
                break;
            case 3:
                oSportControler.atletiPerSport();
                break;
            case 4:
                oAtletiControler.altezzaSopraLaMedia();
                break;
            default:
                System.out.println("Selcta non valida");
                break;
        }
    }
}