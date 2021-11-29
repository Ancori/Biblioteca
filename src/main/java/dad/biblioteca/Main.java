package dad.biblioteca;

import java.io.File;
import java.util.Date;
import java.util.GregorianCalendar;

import dad.biblioteca.modelo.Biblioteca;
import dad.biblioteca.modelo.Editorial;
import dad.biblioteca.modelo.Libro;
import dad.biblioteca.persistencia.Persistencia;

public class Main {

	public static void main(String[] args) throws Exception {

		// crea la biblioteca
		Biblioteca biblio = new Biblioteca();

		// crea la editorial "McGraw-Hill"
		Editorial editorial1 = new Editorial();
		editorial1.setNombre("McGraw-Hill");

		// crea la editorial "Prentice Hall"
		Editorial editorial2 = new Editorial();
		editorial2.setNombre("Prentice Hall");

		// a�ade las editoriales a la biblioteca
		biblio.getEditoriales().add(editorial1);
		biblio.getEditoriales().add(editorial2);

		// crea un fecha correspondiente al día "10/5/2006" para usarla ...
		// ... como fecha de publicación del primer libro (libro1)
		Date fechaPublicacion1 = new GregorianCalendar(2006, 4, 10).getTime();

		// crea el libro "Programación avanzada con VB.NET"
		Libro libro1 = new Libro();
		libro1.setAutor("Francesco Balena");
		libro1.setTitulo("Programación Avanzada con Visual Basic .NET");
		libro1.setFechaPublicacion(fechaPublicacion1);
		libro1.setIsbn("123-456-78");
		libro1.setEditorial(editorial1);

		// crea un fecha correspondiente al día "25/9/2008" para usarla ...
		// ... como fecha de publicación del segundo libro (libro2)
		Date fechaPublicacion2 = new GregorianCalendar(2008, 8, 25).getTime();

		// crea el libro "Redes de Computadoras"
		Libro libro2 = new Libro();
		libro2.setAutor("Andrew S. Tanenbaum");
		libro2.setTitulo("Redes de Computadoras");
		libro2.setFechaPublicacion(fechaPublicacion2);
		libro2.setIsbn("789-456-123");
		libro2.setEditorial(editorial2);

		// añade los dos libros a la biblioteca
		biblio.getLibros().add(libro1);
		biblio.getLibros().add(libro2);

		// guarda la biliboteca en el fichero XML
		Persistencia.guardar(biblio, new File("biblioteca.xml"));

		// lee la bilioteca del fichero XML
		biblio = Persistencia.leer(new File("biblioteca.xml"));

	}

}
