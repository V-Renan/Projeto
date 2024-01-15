package service;

import model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Victor$
 * @date 15/01/2024$
 * Description:
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Override
    public Usuario criarUsuario(String nome, String email, String senha) {
        return null;
    }

    @Override
    public Usuario obterUsuarioPorID(Long id) {
        return null;
    }

    @Override
    public List<Usuario> obterTodosUsuarios() {
        return null;
    }
}
