package service;

import model.Livro;

import java.util.List;

public interface LivroService {

    Livro criarLivro(String titulo, String autor, String genero);
    Livro obterLivroPorID(Long id);
    List<Livro> obterTodosLivros();
}
