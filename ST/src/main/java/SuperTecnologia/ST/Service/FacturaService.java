package SuperTecnologia.ST.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SuperTecnologia.ST.IService.FacturaIService;
import SuperTecnologia.ST.Entity.Factura;
import SuperTecnologia.ST.Repository.FacturaRepository;

@Service
public class FacturaService implements FacturaIService{

	@Autowired
	private FacturaRepository fRepository;

	@Override
	public List<Factura> findAllFacturas() {
		return fRepository.findAll();
	}
	@Override
	public Factura saveFactura(Factura factura) {
		return fRepository.save(factura);
	}
	@Override
	public Optional<Factura> findFacturaById(Long id) {
		return fRepository.findById(id);
	}

	@Override
	public void deleteFactura(Long id) {
		fRepository.deleteById(id);
	}

	@Override
	public void deleteFactura(Factura factura) {
		fRepository.delete(factura);
	};

	@Override
	public void deleteAllFacturas() {
		fRepository.deleteAll();
	}
}