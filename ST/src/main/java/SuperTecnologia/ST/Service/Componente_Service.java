package SuperTecnologia.ST.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SuperTecnologia.ST.IService.ComponenteIService;
import SuperTecnologia.ST.Entity.Componente;
import SuperTecnologia.ST.Repository.ComponenteRepository;

@Service
public class ComponenteService implements ComponenteIService{

	@Autowired
	private ComponenteRepository fRepository;

	@Override
	public List<Componente> findAllComponentes() {
		return fRepository.findAll();
	}
	@Override
	public Componente saveComponente(Componente componente) {
		return fRepository.save(componente);
	}
	@Override
	public Optional<Componente> findComponenteById(Long id) {
		return fRepository.findById(id);
	}

	@Override
	public void deleteComponente(Long id) {
		fRepository.deleteById(id);
	}

	@Override
	public void deleteComponente(Componente componente) {
		fRepository.delete(componente);
	};

	@Override
	public void deleteAllComponentes() {
		fRepository.deleteAll();
	}
}