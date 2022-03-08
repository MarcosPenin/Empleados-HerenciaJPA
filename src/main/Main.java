package main;

import org.hibernate.Session;
import controlador.CrearTablas;
import controlador.Sesion;
import vista.Mensajes;
import vista.VerMenu;

public class Main {

	public static void main(String[] args) {
		/*
		 * Ejecutar tal cual la primera vez para crear la base de datos A continuación
		 * comentar línea 18, y cambiar create-drop por update en el fichero de
		 * configuración
		 */

		Session session = Sesion.abrirSesion();
		CrearTablas.crearTablas(session);
		VerMenu.menuPrincipal(session);
		Mensajes.sesionTerminada();

	}

}
