package vista;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import modelo.*;
import utilidades.ControlData;




public class InsertarVista {

	static Scanner sc=new Scanner(System.in);
	
	public static Empresa pedirEmpresa() {
		System.out.println("Introduce el cif de la empresa");
		String cif=sc.nextLine();
		System.out.println("Introduce el nombre de la empresa");
		String nombre=sc.nextLine();
		System.out.println("Introducela dirección de la empresa");
		String direccion=sc.nextLine();
		System.out.println("Introduce el teléfono de la empresa");
		String telefono=sc.nextLine();

		Empresa e = new Empresa(cif,nombre,direccion,telefono);		
		return e;

	}
	
	public static Fijo pedirFijo() {
		
		System.out.println("Introduce el dni del empleado");
		String dni=sc.nextLine();
		System.out.println("Introduce el nombre del empleado");
		String nombre=sc.nextLine();
		System.out.println("Introduce el telefono del empleado");
		String telefono=sc.nextLine();
		System.out.println("Introduce el porcentaje de retención del empleado");
		float porcentajeRetencion=ControlData.lerFloat(sc);
		System.out.println("Introduce el salario base del empleado");
		int salarioBase=ControlData.lerInt(sc);
		System.out.println("Introduce los trienios del empleado");
		int trienios=ControlData.lerInt(sc);
		
		Fijo f=new Fijo(dni,nombre,telefono,porcentajeRetencion,salarioBase,trienios);
		return f;
	

	}

	public static Temporal pedirTemporal() {
		
		System.out.println("Introduce el dni del empleado");
		String dni=sc.nextLine();
		System.out.println("Introduce el nombre del empleado");
		String nombre=sc.nextLine();
		System.out.println("Introduce el telefono del empleado");
		String telefono=sc.nextLine();
		System.out.println("Introduce el porcentaje de retención del empleado");
		float porcentajeRetencion=ControlData.lerFloat(sc);
		System.out.println("Introduce la fecha de inicio (formato yyyy-mm-dd)");
		String fechaInicio=sc.nextLine();
		LocalDate fechaI=LocalDate.parse(fechaInicio);
		System.out.println("Introduce la fecha de finalización (formato yyyy-mm-dd)");
		String fechaFin=sc.nextLine();
		LocalDate fechaF=LocalDate.parse(fechaFin);
		System.out.println("Introduce el salario por día");
		float pagoDia=ControlData.lerFloat(sc);
		
		Temporal t= new Temporal(dni,nombre,telefono,porcentajeRetencion,fechaI,fechaF,pagoDia);
		return t;
	}

	

	public static Producto pedirProducto() {
		System.out.println("Introduce el código del producto");
		String codigo=sc.nextLine();
		System.out.println("Introduce el stock del producto");
		int stock=ControlData.lerInt(sc);
		System.out.println("Introduce el precio del producto");
		Float precio=ControlData.lerFloat(sc);
		
		Producto p = new Producto(codigo,stock,precio);
		return p;

	}

	public static Venta pedirVenta(Producto producto, Temporal temporal) {

		System.out.println("Introduce las unidades");
		int unidades=ControlData.lerInt(sc);
		float precio=producto.getPrecioUnidad()*unidades;

		Venta v = new Venta(LocalDateTime.now(), producto, unidades, precio, temporal);
		return v;
		
			
	}


}
