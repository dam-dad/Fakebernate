package aed.productos.entities;

public class Producto {

	private int codProducto;
	private String denoProducto;
	private double precioBase;
	private boolean congelado;
	private Observacion observacion;
	private Familia familia;

	public int getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}

	public String getDenoProducto() {
		return denoProducto;
	}

	public void setDenoProducto(String denoProducto) {
		this.denoProducto = denoProducto;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isCongelado() {
		return congelado;
	}

	public void setCongelado(boolean congelado) {
		this.congelado = congelado;
	}

	public Observacion getObservacion() {
		return observacion;
	}

	public void setObservacion(Observacion observacion) {
		this.observacion = observacion;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}
	
	@Override
	public String toString() {
		return denoProducto;
	}

}
