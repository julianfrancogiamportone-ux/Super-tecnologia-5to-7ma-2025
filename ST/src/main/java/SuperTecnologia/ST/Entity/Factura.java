package SuperTecnologia.ST.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int id_usuario;
    
    private int id_componente;

	private int id_servicio;

	private Date fecha;

	private int precio_total;
	
	public Usuario () {
    	super();
    }
    
    public Factura(int id_usuario, int id_componente, int id_servicio, Date fecha, int precio_total) {
    	super();
    	this.id_usuario = id_usuario;
    	this.id_componente = id_componente;
		this.id_servicio = id_servicio;
		this.fecha = fecha;
		this.precio_total = precio_total;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getIdUsuario() {
		return id_usuario;
	}
	public void setIdUsuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public int getIdComponente() {
		return id_componente;
	}
	public void setIdComponente(int id_componente) {
		this.id_componente = id_componente;
	}

	public int getIdServicio() {
		return id_servicio;
	}
	public void setIdServicio(int id_servicio) {
		this.id_servicio = id_servicio;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public int getPrecioTotal() {
		return precio_total;
	}
	public void setPrecioTotal(int precio_total) {
		this.precio_total = precio_total;
	}
}