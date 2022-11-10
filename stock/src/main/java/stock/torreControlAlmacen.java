package stock;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class torreControlAlmacen {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		gestionAlmacen gestor = (gestionAlmacen) context.getBean("gestionA");
		
		System.out.println(gestor.ListarProductos1().get(0).getNombre());
		System.out.println(gestor.ListarProductos2().get(0).getNombre());
		
	}

}
