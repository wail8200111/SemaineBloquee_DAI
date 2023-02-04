package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class bd {
	
	/*---------*/
	/* Donn�es */
	/*---------*/

	/*----- Connexion -----*/
	private static Connection cx = null;

	/*----- Donn�es de connexion -----*/
	private static final String URL			= "jdbc:mysql://localhost:3307/db_22005089";
	private static final String LOGIN		= "22005089";
	private static final String PASSWORD	= "4616EH";


	/*----------*/
	/* M�thodes */
	/*----------*/

	/**
	 * Cr�e la connexion avec la base de donn�es.
	 */
	private static void connexion() throws ClassNotFoundException, SQLException {
		/*----- Chargement du pilote pour la BD -----*/
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}
		catch (ClassNotFoundException ex)
			{
			throw new ClassNotFoundException("Exception Bd.connexion() : Pilote MySql introuvable - " + ex.getMessage());
			}

		/*----- Ouverture de la connexion -----*/
		try {
			bd.cx = DriverManager.getConnection(URL,LOGIN,PASSWORD);
			}
		catch (SQLException ex)
			{
			throw new SQLException("Exception connexion() : Probl�me de connexion � la base de donn�es - " + ex.getMessage());
			}
	}
	
	/*----------------------------*/
	/* Programme principal (test) */
	/*----------------------------*/

	public static void main (String[] s){
		
	}

}	

 /*----- Fin de la classe Bd -----*/
