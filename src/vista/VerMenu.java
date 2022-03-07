package vista;

import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;

import controlador.Borrar;
import controlador.Consultar;
import controlador.Insertar;
import controlador.Modificar;
import utilidades.Menu;
import utilidades.ControlData;

public class VerMenu {

	static Scanner sc = new Scanner(System.in);
	static Menu menuInsertar = new Menu(insertar());
	static Menu menuConsultas = new Menu(consultas());
	static Menu menuEmpleado = new Menu(empleados());
	static Menu menuModificar = new Menu(modificar());

	static byte op;
	static Session session;

	public static void menuPrincipal(Session sesion) {
		session = sesion;
		Menu menuPrincipal = new Menu(opciones());
		byte opMenu;
		System.out.println("*********************************************************************");
		System.out.println("****************************BIENVENIDO*********************** ");

		do {
			System.out.println("*********************************************************************");
			System.out.println("Introduzca la opción que desee realizar:");
			menuPrincipal.printMenu();
			opMenu = ControlData.lerByte(sc);
			switch (opMenu) {
			case 1:
				menuInsertar();
				break;
			case 2:
				menuEmpleadoBorrar();
				break;
			case 3:
				menuConsultar();
				break;
			case 4:
				menuModificar();
				break;
			}
		} while (opMenu != 5);
	}

	public static void menuInsertar() {
		System.out.println("*********************************************************************");
		System.out.println("¿Que desea añadir?");
		menuInsertar.printMenu();
		op = ControlData.lerByte(sc);
		switch (op) {
		case 1:
			Insertar.insertarEmpresa(session);
			break;
		case 2:
			menuEmpleado();
			break;
		case 3:
			Insertar.insertarProducto(session);
			break;

		case 4:
			Insertar.insertarVenta(session);
			break;

		}

	}

	public static void menuEmpleado() {
		System.out.println("*********************************************************************");
		System.out.println("¿Que tipo de empleado?");
		menuEmpleado.printMenu();
		op = ControlData.lerByte(sc);
		switch (op) {
		case 1:
			Insertar.insertarFijo(session);
			break;
		case 2:
			Insertar.insertarTemporal(session);
			break;

		}

	}

	public static void menuEmpleadoBorrar() {
		System.out.println("*********************************************************************");
		System.out.println("¿Que tipo de empleado?");
		menuEmpleado.printMenu();
		op = ControlData.lerByte(sc);
		switch (op) {
		case 1:
			Borrar.borrarFijo(session);
			break;
		case 2:
			Borrar.borrarTemporal(session);
			break;

		}

	}

	public static void menuConsultar() {
		System.out.println("*********************************************************************");
		System.out.println("¿Que desea consultar?");
		menuConsultas.printMenu();
		op = ControlData.lerByte(sc);
		switch (op) {
		case 1:
			Consultar.listadoEmpresas(session);
			break;
		case 2:
			Consultar.productosEmpresa(session);
			break;
		case 3:
			Consultar.consultarSuplemento(session);
			break;

		}
	}

	public static void menuModificar() {
		System.out.println("*********************************************************************");
		System.out.println("¿Que desea modificar?");
		menuModificar.printMenu();
		op = ControlData.lerByte(sc);
		switch (op) {
		case 1:
			Modificar.precioProducto(session);
			break;
		case 2:
			Modificar.sueldoEmpleadoFijo(session);
			break;
		case 3:
			Modificar.porcentajeRetencion(session);
			break;
		case 4:
			Modificar.importeDiaEmpleadoTemporal(session);
			break;

		}
	}

	static ArrayList<String> opciones() {
		ArrayList<String> opciones = new ArrayList<String>();
		opciones.add("Inserciones");
		opciones.add("Borrado de empleados");
		opciones.add("Consultas");
		opciones.add("Modificaciones");
		opciones.add("Salir");
		return opciones;
	}

	static ArrayList<String> empleados() {
		ArrayList<String> opciones = new ArrayList<String>();
		opciones.add("Fijo");
		opciones.add("Temporal");
		opciones.add("Salir");
		return opciones;
	}

	static ArrayList<String> insertar() {
		ArrayList<String> opciones = new ArrayList<String>();
		opciones.add("Empresa");
		opciones.add("Empleado");
		opciones.add("Producto");
		opciones.add("Venta");
		opciones.add("Volver");
		return opciones;
	}

	static ArrayList<String> consultas() {
		ArrayList<String> opciones = new ArrayList<String>();
		opciones.add("Listado de empresas con todos sus empleados");
		opciones.add("Listado de productos de una empresa");
		opciones.add("Comprobar si un empleado temporal tiene derecho a suplemento");
		opciones.add("Volver");
		return opciones;
	}

	static ArrayList<String> modificar() {
		ArrayList<String> opciones = new ArrayList<String>();
		opciones.add("Precio de un producto");
		opciones.add("Sueldo de un empleado fijo");
		opciones.add("Porcentaje de retención de un empleado");
		opciones.add("Salario por día de un empleado");
		opciones.add("Volver");
		return opciones;
	}

}
