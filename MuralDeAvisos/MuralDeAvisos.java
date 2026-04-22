package Projeto_Biblioteca.MuralDeAvisos;

public class MuralDeAvisos extends Sujeito {
    // Atributos da Classe
    private String avisoAtual;

    // Método Construtor da Classe
    public MuralDeAvisos(String avisoAtual) {
        this.setAvisoAtual(avisoAtual);
    }

    // #region Getters e Setters
    public void setAvisoAtual(String avisoAtual) {
        this.avisoAtual = avisoAtual;
        this.NotificaObservadores();
    }

    public String getAvisoAtual() {
        return this.avisoAtual;
    }
    // #endregion
}
