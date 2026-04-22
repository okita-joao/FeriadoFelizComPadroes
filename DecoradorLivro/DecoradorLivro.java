package Projeto_Biblioteca.DecoradorLivro;

import Projeto_Biblioteca.Apresentação.ApresentaLivroInterface;

public class DecoradorLivro implements ApresentaLivroInterface {

    protected ApresentaLivroInterface ALI;

    // Método Construtor da Classe
    public DecoradorLivro(ApresentaLivroInterface ALI) {
        this.setInterfaceApresentacao(ALI);
    }

    // #region Getters e Setters
    public void setInterfaceApresentacao(ApresentaLivroInterface ALI) {
        this.ALI = ALI;
    }

    public ApresentaLivroInterface getInterfaceApresentacao() {
        return this.ALI;
    }
    // #endregion

    // Métodos da Interface de Apresentação de um Livro
    public void apresentacaoLivro() {
        this.getInterfaceApresentacao().apresentacaoLivro();
    }
}
