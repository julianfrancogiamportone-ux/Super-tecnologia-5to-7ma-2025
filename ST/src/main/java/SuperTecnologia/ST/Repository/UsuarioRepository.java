package SuperTecnologia.ST.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SuperTecnologia.ST.Entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}
