package controlador;



import org.hibernate.Session;

import modelo.Fijo;
import modelo.Temporal;
import vista.Mensajes;

public class Borrar {

	public static void borrarFijo(Session session) {
		Fijo fijo = Consultar.buscarFijo(session);
		if (fijo != null) {
			session.beginTransaction();
			session.remove(fijo);
			session.getTransaction().commit();
		} else {
			Mensajes.empleadoNoEncontrado();
		}
	}

	public static void borrarTemporal(Session session) {
		Temporal temporal=Consultar.buscarTemporal(session);
		if (temporal != null) {
			session.beginTransaction();
			session.remove(temporal);
			session.getTransaction().commit();
		} else {
			Mensajes.empleadoNoEncontrado();
		}

	}

}
