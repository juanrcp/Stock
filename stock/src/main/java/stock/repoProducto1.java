package stock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

//Con esta etiqueta declaramos que esto es un repositorio
@Repository
public class repoProducto1 {
	
	private static List<Producto1> productos1 = new ArrayList<Producto1>();
	
	//Con este static dejamos estos datos en memoria por lo que podremos acceder a ello en otro sitio. 
	static {
		
		productos1.add(new Producto1("Ordenador1", 200));
		productos1.add(new Producto1("Ordenador2", 350));
		productos1.add(new Producto1("Ordenador3", 652));
		
	}
	
	public List<Producto1> listarTodos(){
		
		return productos1;
	}
	
	public void insertar(Producto1 producto1) {
		
		productos1.add(producto1);
		
	}

}
