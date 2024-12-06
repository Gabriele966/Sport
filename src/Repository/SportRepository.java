package Repository;

import Model.*;
import Config.DbConnection;

import java.sql.*;
import java.util.*;

public class SportRepository {

    public List<String> sportSquadra(){
        List<String> list = new ArrayList<String>();
        try{
            Connection c = DbConnection.openConnection();
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nome, inventore, nazione_inventore\n" +
                    "FROM Sport\n" +
                    "WHERE squadra IS true;");
            while(rs.next()){
                String nome = rs.getString("nome");
                String inventore = rs.getString("inventore");
                String nazioneInventore = rs.getString("nazione_inventore");
                list.add(nome + " "+ inventore + " "+ nazioneInventore);
            }
            stmt.close();
        }catch(ClassNotFoundException | SQLException e){
            System.err.println(e.getMessage());
            System.exit(0);

        }
        return list;
    }

    public List<String> atletiPerSport(){
        List<String> list = new ArrayList<>();
        try{

            Connection c = DbConnection.openConnection();
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT spt.nome, COUNT (gr.id_atleta) AS numero_atleti\n" +
                    "FROM Sport spt\n" +
                    "JOIN Gare gr on gr.id_sport = spt.id_sport\n" +
                    "GROUP BY(spt.nome)\n" +
                    "ORDER BY numero_atleti DESC;");
            while(rs.next()){
                String nome = rs.getString("nome");
                int numero = rs.getInt("numero_atleti");
                list.add(nome + " "+ numero);
            }

        }catch(ClassNotFoundException | SQLException e){
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return list;
    }

}
