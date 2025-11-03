package SuperTecnologia.ST.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SuperTecnologia.ST.IService.ServiceIService;
import SuperTecnologia.ST.Entity.Service;
import SuperTecnologia.ST.Repository.ServiceRepository;

@Service
public class ServiceService implements ServiceIService{
	
	@Autowired
	private ServiceRepository pRepository;
	
	@Override
	public List<Service> findAllServices() {
		return pRepository.findAll();
	}
	@Override
	public Service saveService(Service service) {
		return pRepository.save(service);
	}
	@Override
	public Optional<Service> findServiceById(Long id) {
		return pRepository.findById(id);
	}
	
	@Override
	public void deleteService(Long id) {
		pRepository.deleteById(id);
	}
	
	@Override
	public void deleteService(Service service) {
		pRepository.delete(service);
	};
	
	@Override
	public void deleteAllServices() {
		pRepository.deleteAll();
	}
}
