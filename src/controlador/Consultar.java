package controlador;

import java.util.List;

import org.hibernate.Session;

import modelo.*;
import vista.*;

public class Consultar {

	public static void listadoEmpresas(Session session) {
		String c = "select i from Empresa i";
		List<Empresa> empresas = session.createQuery(c).list();
		if (empresas.isEmpty()) {
			Mensajes.sinEmpresas();
		}
		for (Empresa x : empresas) {
			ConsultarVista.verEmpresa(x);
		}
	}

	public static void productosEmpresa(Session session) {

		String cif = ConsultarVista.pedirCif();
		String c = "select i from Empresa i where cif='" + cif + "'";
		Empresa empresa = (Empresa) session.createQuery(c).uniqueResult();
		if (empresa != null) {
			ConsultarVista.verProductos(empresa);
		} else {
			Mensajes.empresaNoEncontrada();
		}

	}

	public static void consultarSuplemento(Session session) {

		Temporal temporal = buscarTemporal(session);
		if (temporal != null) {
			ConsultarVista.verNomina(temporal);
			float totalVentas = 0;
			for (Venta v : temporal.getVentas()) {
				totalVentas += v.getImporte();
			}
			if (totalVentas > 100000) {
				temporal.suplementoNomina();
				Mensajes.suplementoConseguido();
			} else {
				Mensajes.sinSuplemento();
			}
		} else {
			Mensajes.empleadoNoEncontrado();
		}

	}

	public static Producto buscarProducto(Session session) {

		String codigoProducto = ConsultarVista.pedirCodigoProducto();
		String c = "select i from Producto i where codigoProducto='" + codigoProducto + "'";
		Producto producto = (Producto) session.createQuery(c).uniqueResult();
		return producto;
	}

	public static Temporal buscarTemporal(Session session) {

		String dni = ConsultarVista.pedirDniEmpleado();
		String c = "select i from Temporal i where dni='" + dni + "'";
		Temporal temporal = (Temporal) session.createQuery(c).uniqueResult();
		return temporal;

	}

	public static Fijo buscarFijo(Session session) {

		String dni = ConsultarVista.pedirDniEmpleado();
		String c = "select i from Fijo i where dni='" + dni + "'";
		Fijo fijo = (Fijo) session.createQuery(c).uniqueResult();
		return fijo;

	}

}
