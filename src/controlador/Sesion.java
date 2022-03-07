package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Sesion {

	static SessionFactory sessionFactory =new Configuration().configure().buildSessionFactory();
	private static Session sesion = null;
	
	 
	public static Session abrirSesion() {	

        if (sesion == null) {
        	sesion = sessionFactory.openSession();
        }		
		return sesion;
	}
	
}
