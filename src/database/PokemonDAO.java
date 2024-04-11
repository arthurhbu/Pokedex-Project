package database;

import Entities.Pokemon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PokemonDAO {
    
    public Pokemon BuscaPokemonPorId(Pokemon pokemon){
        
        String busca_sql = "SELECT * FROM pokemon_infos WHERE id = ?";
        String sql = "SELECT name_pokemon FROM pokemon_infos WHERE id = ?";
        
        
        
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try{
            
            con = database_connection.createConnection();
            pstm = con.prepareStatement(sql);
            pstm.setString(1, String.valueOf(pokemon.getId()));

            rs = pstm.executeQuery();

            if(rs.next()){
                
                pstm = con.prepareStatement(busca_sql);
                pstm.setString(1, String.valueOf(pokemon.getId()));
                rs = pstm.executeQuery();
                while(rs.next()){

                    pokemon.setAltura(rs.getFloat("height_m"));
                    pokemon.setAtaque(rs.getInt("attack"));
                    pokemon.setClassificacao(rs.getString("classification"));
                    pokemon.setDefesa(rs.getInt("defense"));
                    pokemon.setGeração(rs.getInt("generation"));
                    pokemon.setId(rs.getInt("id"));
                    pokemon.setIs_legendary(rs.getBoolean("is_legendary"));
                    pokemon.setNome(rs.getString("name_pokemon"));
                    pokemon.setPeso(rs.getInt("weight_kg"));
                    pokemon.setTipo1(rs.getString("type1"));
                    pokemon.setTipo2(rs.getString("type2"));
                    pokemon.setVelocidade(rs.getInt("speed"));
                    pokemon.setVida(rs.getInt("health_points"));
                    pokemon.setImg(rs.getBytes("img"));
                }
            } 
            else{
                JOptionPane.showMessageDialog(null, "Pokemon não encontrado");
            }
        } catch(Exception e){
            System.out.println("Erro: " + e);
        } finally {
            try{
                if (pstm!=null){
                    pstm.close();
                }
                if (con!=null){
                    con.close();
                }
                if(rs != null){
                    rs.close();
                }
            } catch(SQLException e){
                System.out.println("Erro: "+ e);
            }
        }
        
        return pokemon;
    }
    
    public boolean ResultadoBuscaId(Pokemon pokemon){
        String sqlId = "SELECT name_pokemon FROM pokemon_infos WHERE id = ?";
        try{
            Connection con = database_connection.createConnection();
            PreparedStatement pstm = con.prepareStatement(sqlId);
            pstm.setString(1,String.valueOf(pokemon.getId()));
            ResultSet rs = pstm.executeQuery();
            if(!rs.next()){
                return false;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return true;
    }
    
    public boolean ResultadoBuscaNome(Pokemon pokemon){
        String sqlId = "SELECT name_pokemon FROM pokemon_infos WHERE name_pokemon = ?";
        try{
            Connection con = database_connection.createConnection();
            PreparedStatement pstm = con.prepareStatement(sqlId);
            pstm.setString(1,pokemon.getNome());
            ResultSet rs = pstm.executeQuery();
            if(!rs.next()){
                return false;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return true;
    }
    
    public Pokemon BuscaPokemonporNome(Pokemon pokemon){
        
        String sql = "SELECT * FROM pokemon_infos WHERE name_pokemon = ?";
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try{
            
            con = database_connection.createConnection();
            pstm = con.prepareStatement(sql);
            pstm.setString(1, String.valueOf(pokemon.getNome()));

            rs = pstm.executeQuery();

            if(rs.next()){
                
                pstm = con.prepareStatement(sql);
                pstm.setString(1, String.valueOf(pokemon.getNome()));
                rs = pstm.executeQuery();
                while(rs.next()){

                    pokemon.setAltura(rs.getFloat("height_m"));
                    pokemon.setAtaque(rs.getInt("attack"));
                    pokemon.setClassificacao(rs.getString("classification"));
                    pokemon.setDefesa(rs.getInt("defense"));
                    pokemon.setGeração(rs.getInt("generation"));
                    pokemon.setId(rs.getInt("id"));
                    pokemon.setIs_legendary(rs.getBoolean("is_legendary"));
                    pokemon.setNome(rs.getString("name_pokemon"));
                    pokemon.setPeso(rs.getInt("weight_kg"));
                    pokemon.setTipo1(rs.getString("type1"));
                    pokemon.setTipo2(rs.getString("type2"));
                    pokemon.setVelocidade(rs.getInt("speed"));
                    pokemon.setVida(rs.getInt("health_points"));
                    pokemon.setImg(rs.getBytes("img"));
                }
            } 
            else{
                JOptionPane.showMessageDialog(null, "Pokemon não encontrado");
            }
            
        }catch(Exception e){
            System.out.println(e);
        }finally{
            try{
                if (pstm!=null){
                    pstm.close();
                }
                if (con!=null){
                    con.close();
                }
                if(rs != null){
                    rs.close();
                }
            } catch(SQLException e){
                System.out.println("Erro: "+ e);
            }
        }
        return pokemon;
    }
}
