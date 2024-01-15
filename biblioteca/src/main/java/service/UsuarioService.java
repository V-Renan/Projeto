package service;

import model.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario criarUsuario(String nome, String email, String senha);
    Usuario obterUsuarioPorID(Long id);
    List<Usuario> obterTodosUsuarios();
}
