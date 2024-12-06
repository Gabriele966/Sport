package Service;

import Model.Atleti;
import Repository.AtletiRepository;

import java.util.ArrayList;
import java.util.List;
import Model.*;

public class AtletiService {
    AtletiRepository oAtletiRepository = new AtletiRepository();

    public List<String> atletiGiovaniTennis(String nomeSport, int etaAtleta) {
        Atleti oAtleti = new Atleti();
        Sport oSport = new Sport();
        oSport.setNome(nomeSport);
        oAtleti.setEta(etaAtleta);
        List<String> list = oAtletiRepository.atletiGiovaniTennis(oAtleti, oSport);
        return list;
    }

    public List<String> altezzaSopraLaMedia(){return oAtletiRepository.altezzaSopraLaMedia();}
}
