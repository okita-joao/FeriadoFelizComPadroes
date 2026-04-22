package Projeto_Biblioteca.DecoradorLivro.DecoracaoEdicao;

import Projeto_Biblioteca.Apresentação.ApresentaLivroInterface;
import Projeto_Biblioteca.DecoradorLivro.DecoradorLivro;

public class EdicaoRaraLivro extends DecoradorLivro {
    // Atributos da Classe Edição Rara Livro
    private String EdicaoRara;

    // Método Construtor da Classe
    public EdicaoRaraLivro(ApresentaLivroInterface ALI, String EdicaoRara) {
        super(ALI);
    }

    // #region Getters e Setters
    public void setEdicaoRara(String EdicaoRara) {
        this.EdicaoRara = EdicaoRara;
    }

    public String getEdicaoRara() {
        return this.EdicaoRara;
    }
    // #endregion

    public void apresentacaoLivro() {
        System.out.printf("Edição especial: %s ", this.getEdicaoRara());
        this.getInterfaceApresentacao().apresentacaoLivro();
    }
}
