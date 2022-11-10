package stock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class repoProducto2 {
	
private static List<Producto2> productos2 = new ArrayList<Producto2>();
	
	//Con este static dejamos estos datos en memoria por lo que podremos acceder a ello en otro sitio. 
	static {
		
		productos2.add(new Producto2("Teclado1", 20));
		productos2.add(new Producto2("Teclado2", 35));
		productos2.add(new Producto2("Teclado3", 52));
		
	}
	
	public List<Producto2> listarTodos(){
		
		return productos2;
	}
	
	public void insertar(Producto2 producto2) {
		
		productos2.add(producto2);
		
	}

}
