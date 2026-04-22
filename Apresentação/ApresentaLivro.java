package Projeto_Biblioteca.Apresentação;

import Projeto_Biblioteca.Livro;

public class ApresentaLivro implements ApresentaLivroInterface {
    // Atributos da Classe
    private Livro livro;

    // Método Construtor da Classe
    public ApresentaLivro(Livro livro) {
        this.setLivro(livro);
    }

    // #region Getters e Setters
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Livro getLivro() {
        return this.livro;
    }
    // #endregion

    public void apresentacaoLivro() {
        System.out.printf("%s:", this.getLivro().getTitulo());
    }
}
