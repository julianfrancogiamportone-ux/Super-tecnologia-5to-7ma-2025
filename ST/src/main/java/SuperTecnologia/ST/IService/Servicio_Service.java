package SuperTecnologia.ST.IService;

import java.util.List;
import java.util.Optional;

import SuperTecnologia.ST.Entity.Servicio;

public interface UsuarioIService {
	
	public List<Servicio> findAllServicio();
	public Servicio saveServicio(Servicio servicio);
	public Optional<Servicio> findUsuarioById(Long id);
	public void deleteServicio(Long id);
	public void deleteServicio(Servicio servicio);
	public void deleteAllServicio();
}
