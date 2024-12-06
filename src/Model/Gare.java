package Model;


import java.time.LocalDate;

public class Gare {
    private Atleti atleti;
    private Sport sport;
    private LocalDate inizioGara;
    private String luogo;
    private int partecipanti;

    public Atleti getIdA() {return atleti;}
    public void setIdA(Atleti atleti) {this.atleti = atleti;}

    public Sport getSport() {return sport;}
    public void setSport(Sport sport) {this.sport = sport;}

    public LocalDate getInizioGara() {return inizioGara;}
    public void setInizioGara(LocalDate inizioGara) {this.inizioGara = inizioGara;}

    public String getLuogo() {return luogo;}
    public void setLuogo(String luogo) {this.luogo = luogo;}

    public int getPartecipanti() {return partecipanti;}
    public void setPartecipanti(int partecipanti) {this.partecipanti = partecipanti;}
}
