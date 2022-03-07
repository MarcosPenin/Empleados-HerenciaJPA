package main;

import org.hibernate.Session;
import controlador.CrearTablas;
import controlador.Sesion;
import vista.Mensajes;
import vista.VerMenu;

public class Main {

	public static void main(String[] args) {
		Session session = Sesion.abrirSesion();
//		CrearTablas.crearTablas(session);
		VerMenu.menuPrincipal(session);
		Mensajes.sesionTerminada();
		
	}

}
