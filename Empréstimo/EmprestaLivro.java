package Projeto_Biblioteca.Empréstimo;

import Projeto_Biblioteca.Leitor;
import Projeto_Biblioteca.Livro;

public class EmprestaLivro implements EmprestaLivroInterface {
    // Método Construtor da Classe
    public EmprestaLivro() {
    }

    // Método para emprestar o livro
    public void emprestaLivro(Leitor leitor, Livro livro) {
        leitor.addLivrosAtuais(livro);
        leitor.setNumLeiturasAtuais(leitor.getNumLeiturasAtuais() + 1);
        livro.setEmprestado(true);
    }
}
