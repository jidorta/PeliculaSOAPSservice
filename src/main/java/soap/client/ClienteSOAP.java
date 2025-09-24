package soap.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;
import soap.model.Pelicula;
import soap.service.PeliculaService;

public class ClienteSOAP {

	public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://localhost:8090/ws/peliculas?wsdl");
		
		QName qname = new QName("http://service.soap/", "PeliculaServiceImplService");
		
		//Crear el servicio
		Service service = Service.create(url,qname);
		
		//Obtener el port Interfaz
		PeliculaService peliculaService = service.getPort(PeliculaService.class);
		
		Pelicula p = new Pelicula();
		p.setId(1L);
		p.setTitulo("Matrix");
		p.setDirector("Wachowski");
		
		
		System.out.println("Creando pelicula....");
		peliculaService.crearPelicula(p);
		
		System.out.print("Listado películas...");
		
		for (Pelicula peli : peliculaService.listarPeliculas()) {
            System.out.println(" -> " + peli.getTitulo() + " (" + peli.getDirector() + ")");
        }
		

	}

}
