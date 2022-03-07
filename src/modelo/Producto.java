package modelo;

import javax.persistence.*;

@Entity
public class Producto {

	@Id
	private String codigoProducto;
	private int stockActual;
	private final int stockMinimo=30;
	float precioUnidad;
	
	
	@ManyToOne
	@JoinColumn(name="cif")
	private Empresa empresa;
	
	public Producto() {}

	public String getCodigo() {
		return codigoProducto;
	}

	public void setCodigo(String codigo) {
		this.codigoProducto = codigo;
	}

	public int getStockActual() {
		return stockActual;
	}

	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}

	public float getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(float precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public int getStockMinimo() {
		return stockMinimo;
	}

	public Producto(String codigo, int stockActual, float precioUnidad) {
		this.codigoProducto = codigo;
		this.stockActual = stockActual;
		this.precioUnidad = precioUnidad;
	}
	
	public String toString() {
		return "Codigo producto: "+codigoProducto+" Stock actual: "+stockActual+" Precio unidad "+precioUnidad;
	}
	

}
