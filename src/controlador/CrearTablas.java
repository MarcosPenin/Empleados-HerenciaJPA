package controlador;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

import org.hibernate.Session;

import modelo.Empleado;
import modelo.Empresa;
import modelo.Fijo;
import modelo.Producto;
import modelo.Temporal;
import modelo.Venta;

public class CrearTablas {

	public static void crearTablas(Session session) {

		session.beginTransaction();
		
		Fijo f1 = new Fijo("39453679P", "Fijo 1", "986454545", 10, 1000, 5);
		Fijo f2 = new Fijo("39453678P", "Fijo 2", "986454545", 11, 1111, 6);
		Fijo f3 = new Fijo("39453677P", "Fijo 3", "986454545", 13, 2222, 7);

		
		LocalDate fecha1 = LocalDate.of(2018, 1, 30);
		LocalDate fecha2 = LocalDate.of(2018, 3, 30);
		LocalDate fecha3 = LocalDate.of(2018, 4, 30);
		LocalDate fecha4 = LocalDate.of(2018, 5, 30);
		LocalDate fecha5 = LocalDate.of(2018, 7, 30);
		LocalDate fecha6 = LocalDate.of(2018, 9, 30);

		Temporal t1 = new Temporal("39453676P", "Temporal 1", "986454545", 10, fecha1, fecha2, 50);
		Temporal t2 = new Temporal("39453675P", "Temporal 2", "986454545", 10, fecha3, fecha4, 50);
		Temporal t3 = new Temporal("39453674P", "Temporal 3", "986454545", 10, fecha5, fecha6, 50);
		
		
		Producto p1=new Producto("1",50,100);
		Producto p2=new Producto("2",100,111);
		Producto p3=new Producto("3",10,222);
		
		LocalDateTime fechaCompra=LocalDateTime.of(2018, 1, 30, 10, 30);
		LocalDateTime fechaCompra2=LocalDateTime.of(2018, 1, 30, 15, 30);
			
		
		Venta v1=new Venta(fechaCompra,p1,10,200,t1);
		Venta v2=new Venta(fechaCompra2,p2,10,200,t1);
		
		
		t1.addVenta(v1);
		t1.addVenta(v2);
		
		Empresa e1=new Empresa("1","Empresa 1", "Calle calle", "654654654");
		Empresa e2=new Empresa("2","Empresa 2", "Calle calle", "654654654");
		Empresa e3=new Empresa("3","Empresa 3", "Calle calle", "654654654");
		
	
		e1.addEmpleado(f1);
		e1.addEmpleado(f2);
		e1.addEmpleado(f3);
		e1.addEmpleado(t1);
		e1.addEmpleado(t2);
		e1.addEmpleado(t3);
		
		e1.addProducto(p1);
		e1.addProducto(p2);
		e1.addProducto(p3);
		
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		

		session.getTransaction().commit();
	}

}
