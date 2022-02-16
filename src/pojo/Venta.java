package pojo;

import java.time.LocalDateTime;

public class Venta {

	private LocalDateTime fechaVenta;
	private String codigoArticulo;
	private int numeroUnidades;
	private float importe;
	
	public Venta() {}

	public Venta(LocalDateTime fechaVenta, String codigoArticulo, int numeroUnidades, float importe) {
		this.fechaVenta = fechaVenta;
		this.codigoArticulo = codigoArticulo;
		this.numeroUnidades = numeroUnidades;
		this.importe = importe;
	}

	public LocalDateTime getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDateTime fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public String getCodigoArticulo() {
		return codigoArticulo;
	}

	public void setCodigoArticulo(String codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
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
