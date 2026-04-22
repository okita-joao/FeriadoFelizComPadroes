package Projeto_Biblioteca.Empréstimo;

import Projeto_Biblioteca.Leitor;
import Projeto_Biblioteca.Livro;
import Projeto_Biblioteca.Biblioteca;

public class EmprestaLivroProxy implements EmprestaLivroInterface {
    // Proxy que verifica se o Leitor tem permissão para
    // emprestar o livro ou não, devido ao nível de segurança
    // do livro

    private EmprestaLivroInterface base;

    private Biblioteca bib = Biblioteca.getBiblioteca();

    // Método Construtor da Classe
    public EmprestaLivroProxy(EmprestaLivroInterface base) {
        this.base = base;
    }

    public void emprestaLivro(Leitor leitor, Livro livro) {
        if (!livro.getRestrito() && leitor.getNumLeiturasAtuais() < bib.getLimiteLivrosPorLeitor()
                && !livro.getEmprestado()) {
            System.out.println("Proxy libera o empréstimo do livro...");
            base.emprestaLivro(leitor, livro);
        } else {
            System.out.println("Proxy não libera o empréstimo do livro...");
        }
    }
}
