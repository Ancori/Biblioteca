package dad.biblioteca;

import java.io.File;
import java.time.LocalDate;

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

		// añade las editoriales a la biblioteca
		biblio.getEditoriales().add(editorial1);
		biblio.getEditoriales().add(editorial2);

		// crea el libro "Programación avanzada con VB.NET"
		Libro libro1 = new Libro();
		libro1.setAutor("Francesco Balena");
		libro1.setTitulo("Programación Avanzada con Visual Basic .NET");
		libro1.setFechaPublicacion(LocalDate.of(2006,  5, 10));
		libro1.setIsbn("123-456-78");
		libro1.setEditorial(editorial1);

		// crea el libro "Redes de Computadoras"
		Libro libro2 = new Libro();
		libro2.setAutor("Andrew S. Tanenbaum");
		libro2.setTitulo("Redes de Computadoras");
		libro2.setFechaPublicacion(LocalDate.of(2008, 9, 25));
		libro2.setIsbn("789-456-123");
		libro2.setEditorial(editorial2);

		// añade los dos libros a la biblioteca
		biblio.getLibros().add(libro1);
		biblio.getLibros().add(libro2);

		// guarda la biliboteca en el fichero XML
		Persistencia.guardar(biblio, new File("biblioteca.xml"));

		// lee la bilioteca del fichero XML
		biblio = Persistencia.leer(new File("biblioteca.xml"));
		System.out.println(biblio);

	}

}
