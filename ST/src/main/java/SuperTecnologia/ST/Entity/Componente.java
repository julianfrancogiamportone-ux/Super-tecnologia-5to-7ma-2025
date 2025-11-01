package SuperTecnologia.ST.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Componente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String Nombre;
    
    private String Imagen;

	private Float Costo;

	private String Tipo;

	private String Calidad;
	
	public Componente () {
    	super();
    }
    
    public Componente(int Nombre, int Imagen, int Costo, LocalDate Tipo, int Calidad) {
    	super();
    	this.Nombre = Nombre;
    	this.Imagen = Imagen;
		this.Costo = Costo;
		this.Tipo = Tipo;
		this.Calidad = Calidad;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getImagen() {
		return Imagen;
	}
	public void setImagen(String Imagen) {
		this.Imagen = Imagen;
	}

	public int getCosto() {
		return Costo;
	}
	public void setCosto(Float Costo) {
		this.Costo = Costo;
	}
	
	public LocalDate getTipo() {
		return Tipo;
	}
	public void setTipo(String Tipo) {
		this.Tipo = Tipo;
	}
	
	public int getCalidad() {
		return Calidad;
	}
	public void setCalidad(String Calidad) {
		this.Calidad = Calidad;
	}
}