
package Controlador;

import Modelo.Play;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlayDAO {
    public boolean ingresarJuegoPlay(Play pl)
    {
        boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="insert into tbplay (annolanzamiento,dlc, codigo, nombrejuego,nombredistribuidor,preciojuego,stock) values(?,?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);

            ps.setInt(1, pl.getAnnolanzamiento());
            ps.setBoolean(2, pl.isDlc());
            ps.setString(3, pl.getCodigo());
            ps.setString(4, pl.getNombrejuego());
            ps.setString(5, pl.getNombredistribuidor());
            ps.setInt(6, pl.getPreciojuego());
            ps.setInt(7, pl.getStock());
            
            resultado=ps.executeUpdate()==1;
            ps.close();
            
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(PlayDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        return resultado;
    }
    public Play buscarJuegoPlay(String codigo)
    {
        Play cod=null;
        try {
            Connection con=Conexion.getConexion();
            String query="select * from tbplay where codigo='"+codigo+"'";
            PreparedStatement ps=con.prepareStatement(query);
       
            ResultSet rs=ps.executeQuery();
            while(rs.next())
                cod=new Play(rs.getInt(1),rs.getBoolean(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7));
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PlayDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cod;
    }
       public boolean modificarJuegoPlay(Play pl)
    {
       boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="update tbplay set annolanzamiento=?,dlc=?,nombrejuego=?,nombredistribuidor=?,preciojuego=?,stock=? where codigo=?";
            PreparedStatement ps=con.prepareStatement(query);
            
            ps.setInt(1, pl.getAnnolanzamiento());
            ps.setBoolean(2, pl.isDlc());
            ps.setString(3, pl.getNombrejuego());
            ps.setString(4, pl.getNombredistribuidor());
            ps.setInt(5, pl.getPreciojuego());
            ps.setInt(6, pl.getStock());
            ps.setString(7, pl.getCodigo());
            resultado=ps.executeUpdate()==1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(PlayDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  resultado;
    }
       public boolean eliminarJuegosPlay(String codigo)
    {
        boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="delete from tbplay where codigo='"+codigo+"'";
            PreparedStatement ps=con.prepareStatement(query);

       
            resultado=ps.executeUpdate()==1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(PlayDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public ArrayList <Play> obtenerTodos()
    {
        ArrayList <Play> pla=new ArrayList<>();
        try {
            Connection con=Conexion.getConexion();
            String query="Select * from tbplay";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            Play pl;
            while(rs.next())
            {
                pl=new Play(rs.getInt(1),rs.getBoolean(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7));
                pla.add(pl);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PlayDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlayDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pla;
    }      
}
