package SuperTecnologia.ST.IService;

import java.util.List;
import java.util.Optional;

import SuperTecnologia.ST.Entity.Factura;

public interface FacturaIService {

	public List<Factura> findAllFacturas();
	public Factura saveFactura(Factura factura);
	public Optional<Factura> findFacturaById(Long id);
	public void deleteFactura(Long id);
	public void deleteFactura(Factura factura);
	public void deleteAllFacturas();
}