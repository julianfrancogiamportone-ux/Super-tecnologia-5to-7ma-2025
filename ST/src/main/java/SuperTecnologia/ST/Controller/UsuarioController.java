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

import SuperTecnologia.ST.Entity.Usuario;
import SuperTecnologia.ST.IService.UsuarioIService;

@RestController
@RequestMapping("/nombreEntidad")
@CrossOrigin(origins = "*")
public class UsuarioController {
	@Autowired
	private UsuarioIService pService;
	
	@GetMapping
	public List<Usuario> getAllUsuarios() {
		return pService.findAllUsuarios();
	}
	
	@GetMapping("/{id}")
	public Optional<Usuario> getUsuarioById(@PathVariable Long id) {
		return pService.findUsuarioById(id);
	}
	
	@PostMapping
	public Usuario createUsuario(@RequestBody Usuario usuario) {
		return pService.saveUsuario(usuario);
	}
	
	@PostMapping("/{id}/delete")
	public void deleteUsuario(@PathVariable Long id) {
		pService.deleteUsuario(id);
	}
	
	@PostMapping("/delete")
	public void deleteUsuario(@RequestBody Usuario usuario) {
		pService.deleteUsuario(usuario);
	}
	
	@PostMapping("/delete/all")
	public void deleteAllUsuarios() {
		pService.deleteAllUsuarios();
	}
}
