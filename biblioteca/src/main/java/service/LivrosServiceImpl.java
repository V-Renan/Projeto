package service;

import model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
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
        Livro livro = new Livro(titulo, autor, genero);
        return livroRepository.save(livro);
    }

    @Override
    public Livro obterLivroPorID(Long id) {
        return livroRepository.findById(id).orElse(null);
    }

    @Override
    public List<Livro> obterTodosLivros() {
        return livroRepository.findAll();
    }

    private LivroRepository livroRepository;

    @Autowired
    public LivrosServiceImpl(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }
}
