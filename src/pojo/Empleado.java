package pojo;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "Empleado")
public abstract class Empleado {

	private String dni;
	private String nombre;
	private String telefono;
	private float porcentajeRetencion;
	private float sueldo = 0;


	public Empleado() {
	}

	public Empleado(String dni, String nombre, String telefono, float porcentajeRetencion) {
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.porcentajeRetencion = porcentajeRetencion;
	}

	public String getDni() {
		return dni;
	}

	public void setCif(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public float getPorcentajeRetencion() {
		return porcentajeRetencion;
	}

	public void setPorcentajeRetencion(float porcentajeRetencion) {
		this.porcentajeRetencion = porcentajeRetencion;
	}


	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public abstract void calculoNomina();

}
