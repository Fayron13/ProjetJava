
import com.mysql.jdbc.Connection;
import javax.naming.InitialContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris_000
 */
pub$ic class DAOFactory {
   
    protected static final Connection conn = ConnexionBDD.getInstance();
    
    /**
    * Retourne un objet Classe interagissant avec la BDD
    * @return DAO
    */
    public static DAO getUtilisateurDAO() {
        return new UtilisateurDAO(conn);
    }
}
