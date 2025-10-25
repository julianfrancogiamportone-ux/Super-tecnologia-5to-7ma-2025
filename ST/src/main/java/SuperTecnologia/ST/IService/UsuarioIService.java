package SuperTecnologia.ST.IService;

import java.util.List;
import java.util.Optional;

import SuperTecnologia.ST.Entity.Usuario;

public interface UsuarioIService {
	
	public List<Usuario> findAllUsuarios();
	public Usuario saveUsuario(Usuario usuario);
	public Optional<Usuario> findUsuarioById(Long id);
	public void deleteUsuario(Long id);
	public void deleteUsuario(Usuario usuario);
	public void deleteAllUsuarios();
}
