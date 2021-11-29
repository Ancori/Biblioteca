package dad.biblioteca.modelo;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

@XmlRootElement
@XmlType
public class Biblioteca {

	private ListProperty<Libro> libros = new SimpleListProperty<>(FXCollections.observableArrayList());
	private ListProperty<Editorial> editoriales = new SimpleListProperty<>(FXCollections.observableArrayList());

	public ListProperty<Libro> librosProperty() {
		return this.libros;
	}

	@XmlElement(name = "libro")
	@XmlElementWrapper(name = "libros")
	public ObservableList<Libro> getLibros() {
		return this.librosProperty().get();
	}

	public void setLibros(final ObservableList<Libro> libros) {
		this.librosProperty().set(libros);
	}

	public ListProperty<Editorial> editorialesProperty() {
		return this.editoriales;
	}

	@XmlElement(name = "editorial")
	@XmlElementWrapper(name = "editoriales")
	public ObservableList<Editorial> getEditoriales() {
		return this.editorialesProperty().get();
	}

	public void setEditoriales(final ObservableList<Editorial> editoriales) {
		this.editorialesProperty().set(editoriales);
	}

	@Override
	public String toString() {
		return "Biblioteca [libros=" + getLibros() + ", editoriales=" + getEditoriales() + "]";
	}
	
	

}
