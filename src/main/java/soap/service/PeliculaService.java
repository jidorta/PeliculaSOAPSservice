package soap.service;

import java.util.ArrayList;
import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import soap.model.Pelicula;

@WebService
public class PeliculaService {
	
	private static List<Pelicula> peliculas = new ArrayList<>();
	private static long idCounter = 1;
	
	
	@WebMethod
	 public Pelicula addPelicula(String titulo, String director, int anio) {
		Pelicula p = new Pelicula(idCounter++, titulo, director, anio);
		peliculas.add(p);
		return p;
	}
	
	@WebMethod
	public List<Pelicula> getPeliculas() { return peliculas; }

}
