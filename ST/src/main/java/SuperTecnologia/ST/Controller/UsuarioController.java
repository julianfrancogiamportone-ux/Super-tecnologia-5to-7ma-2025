package SuperTecnologia.ST.Controller   ;

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

import SuperTecnologia.ST.Entity.Servicio;
import SuperTecnologia.ST.IService.ServicioIService;

@RestController
@RequestMapping("/nombreEntidad")
@CrossOrigin(origins = "*")
public class ServicioController {
	@Autowired
	private ServicioIService pService;
	
	@GetMapping
	public List<Servicio> getAllServicio() {
		return pService.findAllServicio();
	}
	
	@GetMapping("/{id}")
	public Optional<Servicio> getServicioById(@PathVariable Long id) {
		return pService.findServicioById(id);
	}
	
	@PostMapping
	public Servicio createServicio(@RequestBody Servicio Servicio) {
		return pService.saveServicio(Servicio);
	}
	
	@PostMapping("/{id}/delete")
	public void deleteServicio(@PathVariable Long id) {
		pService.deleteServicio(id);
	}
	
	@PostMapping("/delete")
	public void deleteServicio(@RequestBody Servicio Servicio) {
		pService.deleteServicio(Servicio);
	}
	
	@PostMapping("/delete/all")
	public void deleteAllServicio() {
		pService.deleteAllServicio();
	}
}
