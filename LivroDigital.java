package Projeto_Biblioteca;

import java.util.List;

public class LivroDigital extends Livro {
    // Atributos da classe
    private String formatoArquivo;
    private double tamanhoArquivo;
    private String linkAcesso;
    private boolean possuiDRM;

    // Método Construtor
    public LivroDigital(String ISBN, String titulo, List<String> autores, String editora, int edicao, int anoPublicacao,
            int numPaginas, String idioma, boolean emprestado, String formatoArquivo, double tamanhoArquivo,
            String linkAcesso,
            boolean possuiDRM) {
        super(ISBN, titulo, autores, editora, edicao, anoPublicacao, numPaginas, idioma, emprestado);
        this.setFormatoArquivo(formatoArquivo);
        this.setTamanhoArquivo(tamanhoArquivo);
        this.setLinkAcesso(linkAcesso);
        this.setPossuiDRM(possuiDRM);
    }

    // #region Getters e Setters
    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }

    public String getFormatoArquivo() {
        return this.formatoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoArquivo() {
        return this.tamanhoArquivo;
    }

    public void setLinkAcesso(String linkAcesso) {
        this.linkAcesso = linkAcesso;
    }

    public String getLinkAcesso() {
        return this.linkAcesso;
    }

    public void setPossuiDRM(boolean possuiDRM) {
        this.possuiDRM = possuiDRM;
    }

    public boolean getPossuiDRM() {
        return this.possuiDRM;
    }
    // #endregion
}
