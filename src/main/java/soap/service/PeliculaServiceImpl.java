package soap.service;

import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import soap.dao.PeliculaDAO;
import soap.model.Pelicula;

@WebService(endpointInterface = "soap.service.PeliculaService")
public class PeliculaServiceImpl implements PeliculaService{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("PeliculaPU");
	private EntityManager em = emf.createEntityManager();
	private PeliculaDAO dao = new PeliculaDAO(em);

	
	@Override
	public String crearPelicula(Pelicula pelicula) {
		dao.crear(pelicula);
		return "Pelicula creada con ID: " + pelicula.getId();
	}
	
	@Override
	public Pelicula obtenerPelicula(Long id) {		
		return dao.buscarPorId(id);
	}
	
	
	@Override
	public List<Pelicula> listarPeliculas() {
		return dao.listar();
	}
	
	
	@Override
	public String actualizarPelicula(Pelicula pelicula) {
		dao.actualizar(pelicula);
		return "Pelicula actualizada con ID: " + pelicula.getId();
	}
	
	
	@Override
	public String eliminarPelicula(Long id) {
		dao.eliminar(id);
		return "Pelicula eliminada con ID: " + id;
	}

}
