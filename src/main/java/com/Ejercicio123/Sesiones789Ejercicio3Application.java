package com.Ejercicio123;
/**
 *	Ejercicio 1

 Implementar los métodos CRUD en el API REST de Laptop creada en ejercicios anteriores.

 Los métodos CRUD:

 - findAll()
 - findOneById()
 - create()
 - update()
 - delete()
 - deleteAll()

 *	Ejercicio 2

 Implementar swagger sobre el API REST de Laptop y verificar que funciona en la URL:

 http://localhost:8081/swagger-ui/

 *	Ejercicio 3


 Crear casos de test para el controlador de Laptop desde Spring Boot.

 Con click derecho dentro del código de la clase LaptopController utilizar la opción
 Generate > Test para crear la clase con todos los tests unitarios e implementarlos
 siguiente el proceso visto en clase.
 *
 * */
import com.Ejercicio123.entities.Laptop;
import com.Ejercicio123.repository.Laptoprepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Sesiones789Ejercicio3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Sesiones789Ejercicio3Application.class, args);
		Laptoprepository repository =context.getBean(Laptoprepository.class);
		//Crear Laptop
		Laptop laptop1=new Laptop(null,"Dell", "XPS","Procesador Intel® Core™ i5-1135G7 de 11.ª generación",
				"Memoria integrada LPDDR4x de 8 GB a 4267 MHz",
				"SSD de 256 GB","Gráficos Intel® Iris Xe",6);
		repository.save(laptop1);

		Laptop laptop2=new Laptop(null,"Dell", "XPS2","Procesador Intel® Core™ i5-1135G7 de 11.ª generación",
				"Memoria integrada LPDDR4x de 16 GB a 4267 MHz",
				"SSD de 512 GB","Gráficos Intel® Iris Xe",6);
		repository.save(laptop2);

		System.out.println("Num libros en base de datos: " + repository.findAll().size());
	}
}
