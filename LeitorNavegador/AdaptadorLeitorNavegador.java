package Projeto_Biblioteca.LeitorNavegador;

import Projeto_Biblioteca.Leitor_Digital.LeitorDigitalInterface;
import Projeto_Biblioteca.LivroDigital;

public class AdaptadorLeitorNavegador implements LeitorDigitalInterface {
    private LeitorNavegador nav;

    // Método Construtor da Classe
    public AdaptadorLeitorNavegador(LeitorNavegador nav) {
        this.setLeitorNavegador(nav);
    }

    // #region Getters e Setters
    public void setLeitorNavegador(LeitorNavegador nav) {
        this.nav = nav;
    }

    public LeitorNavegador getLeitorNavegador() {
        return this.nav;
    }
    // #endregion

    public void apresentarLivroDigital(LivroDigital livro) {
        this.getLeitorNavegador().abrirLivroDigitalNavegador(livro);
    }
}
