package modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Temporal extends Empleado {

	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private float pagoDia;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "dni")
	private Set<Venta> ventas = new HashSet<>();

	public Temporal() {
	}

	public Temporal(String dni, String nombre, String telefono, float porcentajeRetencion, LocalDate fechaInicio,
			LocalDate fechaFin, float pagoDia) {
		super(dni, nombre, telefono, porcentajeRetencion);
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.pagoDia = pagoDia;
		calculoNomina();

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

	public void addVenta(Venta venta) {
		this.ventas.add(venta);
	}

	public void suplementoNomina() {
		setSueldo(getSueldo() + 100);
	}

	public void calculoNomina() {
		long resta=this.fechaFin.toEpochDay()-this.fechaInicio.toEpochDay();
		float sueldo = pagoDia*resta-pagoDia*resta*super.getPorcentajeRetencion()/100;
		super.setSueldo(sueldo);

	}

}
