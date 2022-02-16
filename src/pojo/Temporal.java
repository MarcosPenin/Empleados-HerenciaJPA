package pojo;

import java.time.LocalDate;
import java.util.Set;

public class Temporal extends Empleado {
	
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private float pagoDia;
	
	private Set<Venta> ventas;
	
	
	public Temporal() {}
	
	public Temporal(String dni,String nombre,String telefono,float porcentajeRetencion,LocalDate fechaInicio,LocalDate fechaFin,float pagoDia) {
		super(dni,nombre,telefono,porcentajeRetencion);
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
		this.pagoDia=pagoDia;
		
	}
	

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public float getPagoDia() {
		return pagoDia;
	}

	public void setPagoDia(float pagoDia) {
		this.pagoDia = pagoDia;
	}

	public Set<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(Set<Venta> ventas) {
		this.ventas = ventas;
	}
	
	public void calculoNomina() {		
		//No implementé la fórmula
		float sueldo=pagoDia;
		super.setSueldo(sueldo);
		
	}
	
	
	
	
	
	
}
