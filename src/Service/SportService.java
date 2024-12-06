package Service;

import Repository.SportRepository;
import java.util.*;

public class SportService {
    SportRepository sportRepository = new SportRepository();

    public List<String> sportSquadra(){return sportRepository.sportSquadra();}

    public List<String> atletiPerSport(){return sportRepository.atletiPerSport();}
}
