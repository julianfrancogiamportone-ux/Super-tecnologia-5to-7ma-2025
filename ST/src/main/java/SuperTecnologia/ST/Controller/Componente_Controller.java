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

import SuperTecnologia.ST.Entity.Componente;
import SuperTecnologia.ST.IService.ComponenteIService;

@RestController
@RequestMapping("/Componente")
@CrossOrigin(origins = "*")
public class ComponenteController {
	@Autowired
	private ComponenteIService fService;

	@GetMapping
	public List<Componente> getAllComponente() {
		return fService.findAllComponente();
	}

	@GetMapping("/{id}")
	public Optional<Componente> getComponenteById(@PathVariable Long id) {
		return fService.findComponenteById(id);
	}

	@PostMapping
	public Componente createComponente(@RequestBody Componente Componente) {
		return fService.saveComponente(Componente);
	}

	@PostMapping("/{id}/delete")
	public void deleteComponente(@PathVariable Long id) {
		fService.deleteComponente(id);
	}

	@PostMapping("/delete")
	public void deleteComponente(@RequestBody Componente Componente) {
		fService.deleteComponente(Componente);
	}

	@PostMapping("/delete/all")
	public void deleteAllComponente() {
		fService.deleteAllComponente();
	}
}