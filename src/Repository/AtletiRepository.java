package Repository;
import Model.*;
import java.sql.*;
import java.util.*;

import Config.DbConnection;

public class AtletiRepository {
    public List<String> atletiGiovaniTennis(Atleti oAtleti, Sport oSport){
        List<String> list = new ArrayList<String>();
        try{
            Connection c =DbConnection.openConnection();
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT atl.nome, atl.cognome, atl.eta " +
                    "FROM Atleti atl " +
                    "JOIN Gare gr ON gr.id_atleta = atl.id_atleta " +
                    "JOIN Sport spt ON spt.id_sport = gr.id_sport " +
                    "WHERE spt.nome LIKE '%" + oSport.getNome() + "%' " +
                    "GROUP BY atl.nome, atl.cognome, atl.eta " +
                    "HAVING atl.eta <= '" + oAtleti.getEta() + "';");
            while(rs.next()){
                String nome = rs.getString("nome");
                String cognome = rs.getString("cognome");
                int eta = rs.getInt("eta");

                list.add(nome + " " + cognome + " " + eta);
            }
            stmt.close();
        }catch(ClassNotFoundException | SQLException e){
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return list;
    }

    public List<String> altezzaSopraLaMedia(){
        List<String> list = new ArrayList<>();
        try{
            Connection c = DbConnection.openConnection();
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Nome,Cognome \n" +
                    "FROM Atleti\n" +
                    "WHERE altezza > (SELECT AVG(Altezza)\n" +
                    "\t\t\t\t  FROM ATLETI);");
            while(rs.next()){
                String nome = rs.getString("Nome");
                String cognome = rs.getString("Cognome");
                list.add(nome + " " + cognome);
            }
            stmt.close();
        }catch (ClassNotFoundException | SQLException e){
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return list;
    }
}
