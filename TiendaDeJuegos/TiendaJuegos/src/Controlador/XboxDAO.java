
package Controlador;



import Modelo.Xbox;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class XboxDAO {
    public boolean ingresarJuegoXbox(Xbox xb)
    {
        boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="insert into tbxbox (multijugador, duracionjuego, codigo, nombrejuego,nombredistribuidor,preciojuego,stock) values(?,?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            
            ps.setBoolean(1, xb.isMultijugador());
            ps.setInt(2, xb.getDuracionjuego());            
            ps.setString(3, xb.getCodigo());
            ps.setString(4, xb.getNombrejuego());
            ps.setString(5, xb.getNombredistribuidor());
            ps.setInt(6, xb.getPreciojuego());
            ps.setInt(7, xb.getStock());
            
            resultado=ps.executeUpdate()==1;
            ps.close();
            
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(XboxDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        return resultado;
    }
    public Xbox buscarJuegoXbox(String codigo)
    {
        Xbox cod=null;
        try {
            Connection con=Conexion.getConexion();
            String query="select * from tbxbox where codigo='"+codigo+"'";
            PreparedStatement ps=con.prepareStatement(query);
       
            ResultSet rs=ps.executeQuery();
            while(rs.next())
                cod=new Xbox(rs.getBoolean(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7));
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(XboxDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XboxDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cod;
    }
     public boolean modificarJuegoXbox(Xbox xb)
    {
       boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="update tbxbox set multijugador=?,duracionjuego=?,nombrejuego=?,nombredistribuidor=?,preciojuego=?,stock=? where codigo=?";
            PreparedStatement ps=con.prepareStatement(query);
            
            ps.setBoolean(1, xb.isMultijugador());
            ps.setInt(2, xb.getDuracionjuego());            
            ps.setString(3, xb.getNombrejuego());
            ps.setString(4, xb.getNombredistribuidor());
            ps.setInt(5, xb.getPreciojuego());
            ps.setInt(6, xb.getStock());
            ps.setString(7, xb.getCodigo());
            resultado=ps.executeUpdate()==1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(XboxDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XboxDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  resultado;
    }
     public boolean eliminarJuegosXbox(String codigo)
    {
        boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="delete from tbxbox where codigo='"+codigo+"'";
            PreparedStatement ps=con.prepareStatement(query);

       
            resultado=ps.executeUpdate()==1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(XboxDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XboxDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
     public ArrayList <Xbox> obtenerTodos()
    {
        ArrayList <Xbox> xbo=new ArrayList<>();
        try {
            Connection con=Conexion.getConexion();
            String query="Select * from tbxbox";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            Xbox xb;
            while(rs.next())
            {
                xb=new Xbox(rs.getBoolean(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7));
                xbo.add(xb);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(XboxDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(XboxDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return xbo;
    }      
}
