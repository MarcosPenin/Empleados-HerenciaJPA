package controlador;

import org.hibernate.Session;
import modelo.*;
import vista.InsertarVista;
import vista.Mensajes;

public class Insertar {

	public static void insertarEmpresa(Session session) {
		Empresa empresa = InsertarVista.pedirEmpresa();
		session.beginTransaction();
		session.saveOrUpdate(empresa);
		session.getTransaction().commit();
	}

	public static void insertarProducto(Session session) {
		Producto producto = InsertarVista.pedirProducto();
		session.beginTransaction();
		session.saveOrUpdate(producto);
		session.getTransaction().commit();

	}

	public static void insertarVenta(Session session) {

		Temporal temporal = Consultar.buscarTemporal(session);
		Producto producto = Consultar.buscarProducto(session);

		if (producto != null) {
			Venta venta = InsertarVista.pedirVenta(producto, temporal);

			if ((producto.getStockActual() - venta.getNumeroUnidades()) > producto.getStockMinimo()) {

				if (temporal != null) {
					session.beginTransaction();
					temporal.addVenta(venta);
					producto.setStockActual(producto.getStockActual() - venta.getNumeroUnidades());
					System.out.println("Aquí salta un error que no consigo solucionar. Creo que es cosa del fetch");
					// session.saveOrUpdate(producto);
					// session.saveOrUpdate(temporal);
					// session.saveOrUpdate(producto);
					// session.getTransaction().commit();
				} else {
					Mensajes.ventaNoAsignada();
				}
			} else {
				Mensajes.stockInsuficiente();
			}

		} else {
			Mensajes.productoNoEncontrado();
		}
	}

	public static void insertarFijo(Session session) {
		Fijo fijo = InsertarVista.pedirFijo();
		session.beginTransaction();
		session.saveOrUpdate(fijo);
		session.getTransaction().commit();

	}

	public static void insertarTemporal(Session session) {
		Temporal temporal = InsertarVista.pedirTemporal();
		session.beginTransaction();
		session.saveOrUpdate(temporal);
		session.getTransaction().commit();

	}

}
