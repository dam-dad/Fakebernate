package aed.productos.entities;

public class Familia {

	private int codFamilia;
	private String denoFamilia;

	public int getCodFamilia() {
		return codFamilia;
	}

	public void setCodFamilia(int codFamilia) {
		this.codFamilia = codFamilia;
	}

	public String getDenoFamilia() {
		return denoFamilia;
	}

	public void setDenoFamilia(String denoFamilia) {
		this.denoFamilia = denoFamilia;
	}
	
	@Override
	public String toString() {
		return this.denoFamilia;
	}

}
