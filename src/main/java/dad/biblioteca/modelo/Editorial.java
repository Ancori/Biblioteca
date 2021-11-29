package dad.biblioteca.modelo;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

@XmlType
public class Editorial {

	private StringProperty nombre = new SimpleStringProperty();

	public StringProperty nombreProperty() {
		return this.nombre;
	}

	@XmlAttribute
	public String getNombre() {
		return this.nombreProperty().get();
	}

	public void setNombre(final String nombre) {
		this.nombreProperty().set(nombre);
	}

	@Override
	public String toString() {
		return "Editorial [nombre=" + getNombre() + "]";
	}

}
