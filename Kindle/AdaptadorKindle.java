package Projeto_Biblioteca.Kindle;

import Projeto_Biblioteca.Leitor_Digital.LeitorDigitalInterface;
import Projeto_Biblioteca.LivroDigital;

public class AdaptadorKindle implements LeitorDigitalInterface {
    // Atributos da Classe
    private Kindle kindle;

    // Método Construtor da Classe
    public AdaptadorKindle(Kindle k) {
        this.setKindle(k);
    }

    // #region Getters e Setters
    public void setKindle(Kindle k) {
        this.kindle = k;
    }

    public Kindle getKindle() {
        return this.kindle;
    }
    // #endregion

    // Adaptação
    public void apresentarLivroDigital(LivroDigital livro) {
        this.getKindle().mostrarLivroDigital(livro);
    }
}
