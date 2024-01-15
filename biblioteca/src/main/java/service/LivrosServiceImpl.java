package service;

import model.Livro;
import org.springframework.stereotype.Service;
import repository.LivroRepository;

import java.util.List;

/**
 * @author Victor$
 * @date 15/01/2024$
 * Description:
 */
@Service
public class LivrosServiceImpl implements LivroService {
    @Override
    public Livro criarLivro(String titulo, String autor, String genero) {
        return null;
    }

    @Override
    public Livro obterLivroPorID(Long id) {
        return null;
    }

    @Override
    public List<Livro> obterTodosLivros() {
        return null;
    }

    private LivroRepository livroRepository;
}
