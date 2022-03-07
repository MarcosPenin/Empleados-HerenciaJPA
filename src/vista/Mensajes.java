package vista;

import java.util.Scanner;

import modelo.Empleado;
import modelo.Fijo;
import modelo.Producto;
import modelo.Temporal;

public class Mensajes {

	static Scanner sc = new Scanner(System.in);



	public static void sesionTerminada() {
		System.out.println("Sesión terminada. ¡Hasta la próxima!");

	}

	public static void productoNoEncontrado() {
		System.out.println("No se ha podido registrar la venta, el producto no se ha encontrado");
		
	}

	public static void ventaNoAsignada() {
		System.out.println("La venta se ha registrado, pero no se ha encontrado al vendedor asociado");
		
	}

	public static void stockInsuficiente() {
		System.out.println("No se puede registrar la venta, no hay suficiente stock");
		
	}

	public static void empleadoNoEncontrado() {
		System.out.println("No se ha encontrado a ese empleado");
		
	}

	public static void sinEmpleados() {
		System.out.println("No se han añadido empleados");
		
	}

	public static void sinEmpresas() {
		System.out.println("No se han añadido empresas");
		
	}

	public static void suplementoConseguido() {
		System.out.println("Este empleado ha conseguido un suplemento de 100€");
		
	}

	public static void sinSuplemento() {
		System.out.println("Este empleado no tiene derecho a suplemento");
		
	}

	public static void empresaNoEncontrada() {
		System.out.println("No se ha encontrado a esa empresa");
		
	}

	public static void precioActualizado(Producto producto) {
		System.out.println("Se ha actualizado el precio del producto "+producto);
		
	}

	public static void salarioBaseActualizado(Fijo fijo) {
		System.out.println("Se ha actualizado el salario base del trabajador "+fijo.toString());
			
	}

	public static void retencionActualizada(Empleado empleado) {
		System.out.println("Se ha actualizado la retención del trabajador "+empleado.toString());
		
	}

	public static void pagoDiaActualizado(Temporal temporal) {
		System.out.println("Se ha actualizado el pago por día del trabajador "+temporal.toString());
		
	}


}
