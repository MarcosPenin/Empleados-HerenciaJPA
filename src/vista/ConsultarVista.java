package vista;

import java.util.Scanner;

import modelo.Empleado;
import modelo.Empresa;
import modelo.Producto;
import utilidades.ControlData;

public class ConsultarVista {

	static Scanner sc = new Scanner(System.in);

	public static String pedirCodigoProducto() {
		System.out.println("Introduce el código del producto");
		String codigo = sc.nextLine();
		return codigo;
	}

	public static String pedirDniEmpleado() {
		System.out.println("Introduce el dni del empleado");
		String dni = sc.nextLine();
		return dni;
	}

	public static void verEmpresa(Empresa x) {
		System.out.println(x.toString());

	}

	public static void verProductos(Empresa x) {

		System.out.println("Productos de la empresa: " + x.getNombre());
		if (x.getProductos().isEmpty()) {
			System.out.println("Esta empresa no tiene productos asociados");
		}
		for (Producto y : x.getProductos()) {
			System.out.println(y.toString());
		}

	}

	public static void verNomina(Empleado x) {
		System.out.println("Nómina: " + x.getSueldo());

	}

	public static String pedirCif() {
		System.out.println("Introduce el cif de la empresa");
		String cif = sc.nextLine();
		return cif;
	}

	public static float pedirPrecio() {
		System.out.println("Introduce el nuevo precio");
		float precio = ControlData.lerFloat(sc);
		return precio;
	}

	public static int pedirSalarioBase() {
		System.out.println("Introduce el nuevo salario base");
		int salarioBase = ControlData.lerInt(sc);
		return salarioBase;
	}

	public static float pedirRetencion() {
		System.out.println("Introduce la nueva retención");
		float retencion = ControlData.lerFloat(sc);
		return retencion;
	}

	public static float pedirPagoDia() {
		System.out.println("Introduce el nuevo pago por día");
		float pagoDia = ControlData.lerFloat(sc);
		return pagoDia;

	}
}
