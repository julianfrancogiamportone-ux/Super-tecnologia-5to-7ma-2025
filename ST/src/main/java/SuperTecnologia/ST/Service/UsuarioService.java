package SuperTecnologia.ST.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SuperTecnologia.ST.IService.UsuarioIService;
import SuperTecnologia.ST.Entity.Usuario;
import SuperTecnologia.ST.Repository.UsuarioRepository;

@Service
public class UsuarioService implements UsuarioIService{
	
	@Autowired
	private UsuarioRepository pRepository;
	
	@Override
	public List<Usuario> findAllUsuarios() {
		return pRepository.findAll();
	}
	@Override
	public Usuario saveUsuario(Usuario usuario) {
		return pRepository.save(usuario);
	}
	@Override
	public Optional<Usuario> findUsuarioById(Long id) {
		return pRepository.findById(id);
	}
	
	@Override
	public void deleteUsuario(Long id) {
		pRepository.deleteById(id);
	}
	
	@Override
	public void deleteUsuario(Usuario usuario) {
		pRepository.delete(usuario);
	};
	
	@Override
	public void deleteAllUsuarios() {
		pRepository.deleteAll();
	}
}
