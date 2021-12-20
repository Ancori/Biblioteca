package dad.biblioteca.modelo;

import java.time.LocalDate;

import dad.biblioteca.persistencia.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

@XmlType
public class Libro {

	private StringProperty titulo = new SimpleStringProperty();
	private StringProperty autor = new SimpleStringProperty();
	private StringProperty isbn = new SimpleStringProperty();
	private ObjectProperty<LocalDate> fechaPublicacion = new SimpleObjectProperty<>();
	private ObjectProperty<Editorial> editorial = new SimpleObjectProperty<>();

	public StringProperty tituloProperty() {
		return this.titulo;
	}

	@XmlElement
	public String getTitulo() {
		return this.tituloProperty().get();
	}

	public void setTitulo(final String titulo) {
		this.tituloProperty().set(titulo);
	}

	public StringProperty autorProperty() {
		return this.autor;
	}

	@XmlElement
	public String getAutor() {
		return this.autorProperty().get();
	}

	public void setAutor(final String autor) {
		this.autorProperty().set(autor);
	}

	public StringProperty isbnProperty() {
		return this.isbn;
	}

	@XmlElement
	public String getIsbn() {
		return this.isbnProperty().get();
	}

	public void setIsbn(final String isbn) {
		this.isbnProperty().set(isbn);
	}

	public ObjectProperty<LocalDate> fechaPublicacionProperty() {
		return this.fechaPublicacion;
	}

	@XmlElement
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	public LocalDate getFechaPublicacion() {
		return this.fechaPublicacionProperty().get();
	}

	public void setFechaPublicacion(final LocalDate fechaPublicacion) {
		this.fechaPublicacionProperty().set(fechaPublicacion);
	}

	public ObjectProperty<Editorial> editorialProperty() {
		return this.editorial;
	}

	@XmlElement
	public Editorial getEditorial() {
		return this.editorialProperty().get();
	}

	public void setEditorial(final Editorial editorial) {
		this.editorialProperty().set(editorial);
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + getTitulo() + ", autor=" + getAutor() + ", isbn=" + getIsbn() + ", fechaPublicacion="
				+ getFechaPublicacion() + ", editorial=" + getEditorial() + "]";
	}
	
	

}
