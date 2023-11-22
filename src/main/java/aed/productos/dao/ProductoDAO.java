package aed.productos.dao;

import java.util.ArrayList;
import java.util.List;

import aed.productos.entities.Observacion;
import aed.productos.entities.Producto;

public class ProductoDAO {
	
	private static List<Producto> productos = new ArrayList<Producto>();
	
	static {
		
		Producto p1 = new Producto();
		p1.setCodProducto(1);
		p1.setCongelado(true);
		p1.setDenoProducto("Alcachofas");
		p1.setFamilia(FamiliaDAO.findById(1));
		p1.setObservacion(new Observacion());
		p1.getObservacion().setCodProducto(p1.getCodProducto());
		p1.getObservacion().setObservacion("Están buenas");
		p1.setPrecioBase(5);
		addProducto(p1);
		
		Producto p2 = new Producto();
		p2.setCodProducto(2);
		p2.setCongelado(false);
		p2.setDenoProducto("MacBook Pro");
		p2.setFamilia(FamiliaDAO.findById(2));
		p2.setObservacion(new Observacion());
		p2.getObservacion().setCodProducto(p2.getCodProducto());
		p2.getObservacion().setObservacion("Ni loco me lo compro");
		p2.setPrecioBase(3000);
		addProducto(p2);
		
		Producto p3 = new Producto();
		p3.setCodProducto(3);
		p3.setCongelado(false);
		p3.setDenoProducto("Cristiano Ronaldo");
		p3.setFamilia(FamiliaDAO.findById(3));		
		p3.setObservacion(new Observacion());
		p3.getObservacion().setCodProducto(p3.getCodProducto());
		p3.getObservacion().setObservacion("Acabado");
		p3.setPrecioBase(-10);
		addProducto(p3);
		
	}
	
	public static List<Producto> getProductos() {
		System.out.println("Obteniendo productos del DAO");
		return productos;
	}
	
	public static void addProducto(Producto producto) {
		System.out.println("Producto añadido al DAO: " + producto);
		productos.add(producto);
	}

}
