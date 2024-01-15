package controller;

import model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.LivroService;

import java.util.List;


/**
 * @author Victor$
 * @date 15/01/2024$
 * Description:
 */
@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService livroService;

    @Autowired
    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }
    @GetMapping
    public ResponseEntity<List<Livro>> listarLivros() {
        List<Livro> livros = livroService.obterTodosLivros();
        return new ResponseEntity<>(livros, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Livro> adicionarLivro(@RequestBody Livro livro) {
        Livro livroSalvo = livroService.criarLivro(livro.getTitulo(), livro.getAutor(), livro.getGenero());
        return new ResponseEntity<>(livroSalvo, HttpStatus.CREATED);
    }

    public ResponseEntity<Livro> obterLivroPorID(@PathVariable Long id) {
        Livro livro = livroService.obterLivroPorID(id);
        if (livro != null) {
            return new ResponseEntity<>(livro, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
