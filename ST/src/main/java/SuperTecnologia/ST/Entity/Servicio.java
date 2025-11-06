package SuperTecnologia.ST.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    
    private Float Costo;
	
	public Servicio() {
    	super();
    }
    
    public Servicio(String nombre, String Costo) {
    	super();
    	this.nombre = nombre;
    	this.Costo = Costo;
    }
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCosto() {
		return Costo;
	}
	public void setCosto(Float Costo) {
		this.Costo = Costo;
	}
}