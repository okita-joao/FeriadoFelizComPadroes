package Projeto_Biblioteca.DecoradorLivro.DecoracaoPremiacao;

import Projeto_Biblioteca.DecoradorLivro.DecoradorLivro;
import Projeto_Biblioteca.Apresentação.ApresentaLivroInterface;

public class PremiacaoLivro extends DecoradorLivro {
    // Atributos da Classe Premiação Livro
    private String premio;

    // Método Construtor da Classe
    public PremiacaoLivro(ApresentaLivroInterface ALI, String premio) {
        super(ALI);
        this.setPremio(premio);
    }

    // #region Getters e Setters
    public void setPremio(String premio) {
        this.premio = premio;
    }

    public String getPremio() {
        return this.premio;
    }
    // #endregion

    // Métodos para Decorar a Apresentação do Livro
    public void apresentacaoLivro() {
        System.out.printf("Vencedor do %s ", this.getPremio());
        this.getInterfaceApresentacao().apresentacaoLivro();
    }
}
