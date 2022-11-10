package stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gestionA")
public class gestionAlmacen {
	
	//Aqui se realiza la inyeccion de dpendencias 
	@Autowired
	repoProducto1 repo1;
	@Autowired
	repoProducto2 repo2;
	
	public void insertarProducto1(Producto1 producto1) {
		repo1.insertar(producto1);
	}
	
	public void insertarProducto2(Producto2 producto2) {
		repo2.insertar(producto2);
	}
	
	public List<Producto1> ListarProductos1() {
		return repo1.listarTodos();
	}
	
	public List<Producto2> ListarProductos2() {
		return repo2.listarTodos();
	}

}
