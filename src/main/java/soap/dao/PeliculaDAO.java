package soap.dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import soap.model.Pelicula;

public class PeliculaDAO {
	
	private EntityManager em;

	public PeliculaDAO(EntityManager em) {
		this.em = em;
	}
	
	public void crear(Pelicula pelicula) {
		em.getTransaction().begin();
		em.persist(pelicula);
		em.getTransaction().commit();
	}
	
	public Pelicula buscarPorId(Long id) {
		return em.find(Pelicula.class, id);
	}
	
	public List<Pelicula>listar() {
		return em.createQuery("SELECT p FROM Pelicula p",Pelicula.class).getResultList();
	}
	
	public void actualizar(Pelicula pelicula) {
		em.getTransaction().begin();
		em.merge(pelicula);
		em.getTransaction().commit();
	}
	
	public void eliminar(Long id) {
		em.getTransaction().begin();
		Pelicula p = em.find(Pelicula.class, id);
		if (p!=null) em.remove(p);
		em.getTransaction().commit();
		
	}
}


