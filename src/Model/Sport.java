package Model;

import java.time.LocalDate;

public class Sport {
    private String nome;
    private boolean squadra;
    private LocalDate dataNascimento;
    private String inventore;
    private String nazioneInventore;

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public boolean isSquadra() {return squadra;}
    public void setSquadra(boolean squadra) {this.squadra = squadra;}

    public LocalDate getDataNascimento() {return dataNascimento;}
    public void setDataNascimento(LocalDate dataNascimento) {this.dataNascimento = dataNascimento;}

    public String getInventore() {return inventore;}
    public void setInventore(String inventore) {this.inventore = inventore;}

    public String getNazioneInventore() {return nazioneInventore;}
    public void setNazioneInventore(String nazioneInventore) {this.nazioneInventore = nazioneInventore;}
}
