package soap.endpoint;

import jakarta.xml.ws.Endpoint;
import soap.service.PeliculaServiceImpl;

public class PeliculaPublisher {

	public static void main(String[] args) {
		 
		 String url = "http://localhost:8090/ws/peliculas";
		 System.out.println ("Publicando servicio en " + url);
		
		 Endpoint.publish(url, new PeliculaServiceImpl());
		 System.out.println("Servicio SOAP disponible en " + url + "?wsdl");

	}

}
