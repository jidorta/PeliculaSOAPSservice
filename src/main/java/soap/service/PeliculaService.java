package soap.service;


import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import soap.model.Pelicula;

@WebService
public interface PeliculaService {
	 @WebMethod
	String crearPelicula(Pelicula pelicula);
	 @WebMethod
	Pelicula obtenerPelicula(Long id);
	 @WebMethod
	List<Pelicula>listarPeliculas();
	 @WebMethod
	String actualizarPelicula(Pelicula pelicula);
	 @WebMethod
	String eliminarPelicula(Long id);

}
