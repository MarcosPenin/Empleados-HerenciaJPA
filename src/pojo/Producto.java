package pojo;

public class Producto {

	private String codigo;
	private int stockActual;
	private final int stockMinimo=30;
	float precioUnidad;
	
	private Empresa empresa;
	
	public Producto() {}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
		this.codigo = codigo;
		this.stockActual = stockActual;
		this.precioUnidad = precioUnidad;
	}
	
	
	

}
