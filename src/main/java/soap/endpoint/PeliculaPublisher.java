package soap.endpoint;

import jakarta.xml.ws.Endpoint;
import soap.service.PeliculaService;

public class PeliculaPublisher {

	public static void main(String[] args) {
		 Endpoint.publish("http://localhost:8080/peliculas", new PeliculaService());
		 System.out.println("Servicio corriendo en : http://localhost:8080/peliculas?wsdl");

	}

}
