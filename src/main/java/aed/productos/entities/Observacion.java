package aed.productos.entities;

public class Observacion {

	private int codProducto;
	private String observacion;

	public int getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(int codProducto) {
		this.codProducto = codProducto;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	@Override
	public String toString() {
		return this.observacion;
	}

}
