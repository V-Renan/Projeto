package service;

import model.Emprestimo;
import model.Livro;
import model.Usuario;

import java.util.Date;
import java.util.List;

public interface EmprestimoService {

    Emprestimo realizarEmprestimo(Livro livro, Usuario usuario, Date dataEmprestimo, Date dataDevolucao);
    Emprestimo obterEmprestimoPorId(Long id);
    List<Emprestimo> obterTodosEmprestimos();
}
