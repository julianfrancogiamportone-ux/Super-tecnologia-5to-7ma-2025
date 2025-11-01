package SuperTecnologia.ST.IService;

import java.util.List;
import java.util.Optional;

import SuperTecnologia.ST.Entity.Componente;

public interface ComponenteIService {

	public List<Componente> findAllComponente();
	public Componente saveComponente(Componente componente);
	public Optional<Componente> findComponenteById(Long id);
	public void deleteComponente(Long id);
	public void deleteComponente(Componente componente);
	public void deleteAllComponente();
}