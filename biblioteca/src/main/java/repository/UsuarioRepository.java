package repository;

import model.Livro;
import model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    List<Usuario> fingBynome(String nome);

    List<Usuario> findByEmail(String email);

    List<Usuario> findByNomeAndEmail(String nome, String email);
}
