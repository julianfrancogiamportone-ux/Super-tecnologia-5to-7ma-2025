package SuperTecnologia.ST.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SuperTecnologia.ST.Entity.Factura;
import SuperTecnologia.ST.IService.FacturaIService;

@RestController
@RequestMapping("/factura")
@CrossOrigin(origins = "*")
public class FacturaController {
	@Autowired
	private FacturaIService fService;

	@GetMapping
	public List<Factura> getAllFacturas() {
		return fService.findAllFacturas();
	}

	@GetMapping("/{id}")
	public Optional<Factura> getFacturasById(@PathVariable Long id) {
		return fService.findFacturaById(id);
	}

	@PostMapping
	public Factura createUsuario(@RequestBody Factura factura) {
		return fService.saveFactura(factura);
	}

	@PostMapping("/{id}/delete")
	public void deleteFactura(@PathVariable Long id) {
		fService.deleteFactura(id);
	}

	@PostMapping("/delete")
	public void deleteFactura(@RequestBody Factura factura) {
		fService.deleteFactura(factura);
	}

	@PostMapping("/delete/all")
	public void deleteAllFacturas() {
		fService.deleteAllFacturas();
	}
}