package dad.biblioteca.persistencia;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import dad.biblioteca.modelo.Biblioteca;

public class Persistencia {

	public static void guardar(Biblioteca biblio, File destino) throws Exception {
		JAXBContext context = JAXBContext.newInstance(Biblioteca.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(biblio, destino);
	}
	
	public static Biblioteca leer(File origen) throws Exception {
		JAXBContext context = JAXBContext.newInstance(Biblioteca.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		return (Biblioteca) unmarshaller.unmarshal(origen);
	}
	
}
