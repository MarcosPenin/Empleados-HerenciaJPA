package pojo;

import java.util.Set;

public class Empresa {

	private String cif;
	private String nombre;
	private String direccion;
	private String telefono;

	private Set<Producto> productos;
	private Set<Empleado> empleados;
	
	public Empresa() {}
	
	public Empresa(String cif, String nombre, String direccion, String telefono) {
		super();
		this.cif = cif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public Set<Producto> getProductos() {
		return productos;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

	public Set<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Set<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void addProducto(Producto producto) {
		productos.add(producto);
	}

	public void addEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

}
