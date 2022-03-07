package modelo;

import modelo.Empleado;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn()
public class Fijo extends Empleado {

	private int salarioBase;
	private int trienios;
	

	public Fijo() {
	}

	public Fijo(String dni, String nombre,String telefono, float porcentajeRetencion, int salarioBase, int trienios) {
		super(dni, nombre, telefono,porcentajeRetencion);
		this.salarioBase = salarioBase;
		this.trienios = trienios;
		calculoNomina();
	}

	
	public int getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getTrienios() {
		return trienios;
	}

	public void setTrienios(int trienios) {
		this.trienios = trienios;
	}


	public void calculoNomina() {
		float sueldo=(salarioBase+trienios)-(salarioBase+trienios)*super.getPorcentajeRetencion()/100;
		super.setSueldo(sueldo);
	}
	

}
