package soap.model;

public class Pelicula {
	
	private Long id;
	private String titulo;
	private String director;
	private int anio;
	
	public Pelicula() {
		
	}

	public Pelicula(Long id, String titulo, String director, int anio) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.director = director;
		this.anio = anio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
	
	

}
