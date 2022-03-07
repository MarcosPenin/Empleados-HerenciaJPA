package modelo;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
public class Venta implements Serializable {
	@Id
	private LocalDateTime fechaVenta;
	
	private int numeroUnidades;
	private float importe;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="codigoProducto")
	@Id
	private Producto producto;
	
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="dni")
	private Temporal temporal;

	public Venta() {
	}

	public Venta(LocalDateTime fechaVenta, Producto producto, int numeroUnidades, float importe, Temporal t1) {
		this.fechaVenta = fechaVenta;
		this.producto = producto;
		this.numeroUnidades = numeroUnidades;
		this.importe = importe;
		this.temporal=t1;
	}

	public LocalDateTime getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDateTime fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(String codigoArticulo) {
		this.producto =producto;
	}

	public int getNumeroUnidades() {
		return numeroUnidades;
	}

	public void setNumeroUnidades(int numeroUnidades) {
		this.numeroUnidades = numeroUnidades;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

}
