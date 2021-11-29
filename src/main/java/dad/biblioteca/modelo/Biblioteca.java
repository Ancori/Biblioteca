package dad.biblioteca.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType
public class Biblioteca {
	private List<Libro> libros;
	private List<Editorial> editoriales;

	public Biblioteca() {
		libros = new ArrayList<Libro>();
		editoriales = new ArrayList<Editorial>();
	}
	
	@XmlElement
	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	@XmlElement
	public List<Editorial> getEditoriales() {
		return editoriales;
	}

	public void setEditoriales(List<Editorial> editoriales) {
		this.editoriales = editoriales;
	}

}
