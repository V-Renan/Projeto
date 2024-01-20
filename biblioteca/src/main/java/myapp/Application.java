package myapp;

import model.Livro;
import model.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.LivroService;
import service.LivrosServiceImpl;
import service.UsuarioServiceImpl;

/**
 * @author Victor$
 * @date 15/01/2024$
 * Description:
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        Livro livro = new Livro();
        livro.setTitulo("Game of Thrones");
        livro.setAutor("George R. R. Martin");
        livro.setGenero("Fantasia");

        Usuario usuario = new Usuario();
        usuario.setNome("Renan");
        usuario.setEmail("victor@hotmail.com");
        usuario.setSenha("12345678");


    }

}
