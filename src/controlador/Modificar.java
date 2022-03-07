package controlador;

import org.hibernate.Session;

import modelo.Empleado;
import modelo.Fijo;
import modelo.Producto;
import modelo.Temporal;
import vista.ConsultarVista;
import vista.Mensajes;

public class Modificar {

	public static void precioProducto(Session session) {
		
		String codigo=ConsultarVista.pedirCodigoProducto();	
		String c = "select i from Producto i where codigoProducto='" + codigo + "'";
		Producto producto = (Producto) session.createQuery(c).uniqueResult();
		if (producto != null) {
			float precio=ConsultarVista.pedirPrecio();
			producto.setPrecioUnidad(precio);
			session.beginTransaction();
			session.update(producto);
			session.getTransaction().commit();		
			Mensajes.precioActualizado(producto);			
		} else {
			Mensajes.productoNoEncontrado();
		}

	}
	
	
	public static void sueldoEmpleadoFijo(Session session) {

		String dni=ConsultarVista.pedirDniEmpleado();	
		String c = "select i from Fijo i where dni='" + dni + "'";
		Fijo fijo = (Fijo) session.createQuery(c).uniqueResult();
		if (fijo != null) {
			int salarioBase=ConsultarVista.pedirSalarioBase();
			fijo.setSalarioBase(salarioBase);
			fijo.calculoNomina();
			session.beginTransaction();
			session.update(fijo);
			session.getTransaction().commit();		
			Mensajes.salarioBaseActualizado(fijo);
			
		} else {
			Mensajes.empleadoNoEncontrado();
		}


	}

	public static void porcentajeRetencion(Session session) {
		
		String dni=ConsultarVista.pedirDniEmpleado();	
		String c = "select i from Empleado i where dni='" + dni + "'";
		Empleado empleado = (Empleado) session.createQuery(c).uniqueResult();
		if (empleado != null) {
			float retencion=ConsultarVista.pedirRetencion();
			empleado.setPorcentajeRetencion(retencion);
			empleado.calculoNomina();
			session.beginTransaction();
			session.update(empleado);
			session.getTransaction().commit();		
			Mensajes.retencionActualizada(empleado);
			
		} else {
			Mensajes.empleadoNoEncontrado();
		}

	}

	public static void importeDiaEmpleadoTemporal(Session session) {
	
		String dni=ConsultarVista.pedirDniEmpleado();	
		String c = "select i from Temporal i where dni='" + dni + "'";
		Temporal temporal = (Temporal) session.createQuery(c).uniqueResult();
		if (temporal != null) {
			float pagoDia=ConsultarVista.pedirPagoDia();
			temporal.setPagoDia(pagoDia);
			temporal.calculoNomina();
			session.beginTransaction();
			session.update(temporal);
			session.getTransaction().commit();	
			Mensajes.pagoDiaActualizado(temporal);
			
		} else {
			Mensajes.empleadoNoEncontrado();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
