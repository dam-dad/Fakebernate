package aed.productos.dao;

import java.util.ArrayList;
import java.util.List;

import aed.productos.entities.Familia;

public class FamiliaDAO {
	
	private static List<Familia> familias;
	
	static {
		
		familias = new ArrayList<Familia>();
		
		Familia f1 = new Familia();
		f1.setCodFamilia(1);
		f1.setDenoFamilia("Juguetes");
		familias.add(f1);

		Familia f2 = new Familia();
		f2.setCodFamilia(2);
		f2.setDenoFamilia("Alimentación");
		familias.add(f2);

		Familia f3 = new Familia();
		f3.setCodFamilia(3);
		f3.setDenoFamilia("Petardos");
		familias.add(f3);
		
	}
	
	public static List<Familia> getFamilias() {
		return familias;
	}
	
	public static Familia findById(int codFamilia) {
		return familias
				.stream()
				.filter(f -> f.getCodFamilia() == codFamilia)
				.findFirst()
				.get();
	}

}
