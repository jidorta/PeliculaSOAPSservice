package soap.test;


import java.util.List;

import soap.model.Pelicula;
import soap.service.PeliculaService;
import soap.service.PeliculaServiceImpl;

public class PeliculaTestClient {

	public static void main(String[] args) {
		
		//Usamos directamente la implementacion n producción sería un cliente SOAP real
		PeliculaService service = new PeliculaServiceImpl();
		
		// Crear algunas películas usando el constructor vacío + setters
        Pelicula p1 = new Pelicula();
        p1.setTitulo("El Padrino");
        p1.setDirector("Francis Ford Coppola");
        service.crearPelicula(p1);

        Pelicula p2 = new Pelicula();
        p2.setTitulo("La La Land");
        p2.setDirector("Damien Chazelle");
        service.crearPelicula(p2);

        System.out.println("Películas creadas:");
        System.out.println(p1.getId() + " - " + p1.getTitulo() + " / " + p1.getDirector());
        System.out.println(p2.getId() + " - " + p2.getTitulo() + " / " + p2.getDirector());

        // Listar todas las películas
        List<Pelicula> todas = service.listarPeliculas();
        System.out.println("\nListado completo:");
        for (Pelicula p : todas) {
            System.out.println(p.getId() + " - " + p.getTitulo() + " / " + p.getDirector());
        }

        // Obtener una película por ID
        Pelicula buscada = service.obtenerPelicula(p1.getId());
        System.out.println("\nPelícula obtenida por ID:");
        System.out.println(buscada.getId() + " - " + buscada.getTitulo() + " / " + buscada.getDirector());

	}

}
