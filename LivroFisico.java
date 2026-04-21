package Projeto_Biblioteca;

import java.util.List;

public class LivroFisico extends Livro {
    // Atributos da Classe
    private String estado;
    private int numExemplares;
    private int exemplaresDisponiveis;
    private String secao;
    private String estante;

    // Método Construtor
    public LivroFisico(String ISBN, String titulo, List<String> autores, String editora, int edicao, int anoPublicacao,
            int numPaginas, String idioma, boolean emprestado, String estado, int numExemplares,
            int exemplaresDisponiveis, String secao,
            String estante) {
        super(ISBN, titulo, autores, editora, edicao, anoPublicacao, numPaginas, idioma, emprestado);
        this.setEstado(estado);
        this.setNumExemplares(numExemplares);
        this.setExemplaresDisponiveis(exemplaresDisponiveis);
        this.setSecao(secao);
        this.setEstante(estante);
    }

    // #region Getters e Setters
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setNumExemplares(int numExemplares) {
        this.numExemplares = numExemplares;
    }

    public int getNumExemplares() {
        return this.numExemplares;
    }

    public void setExemplaresDisponiveis(int exemplaresDisponiveis) {
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public int getExemplaresDisponiveis() {
        return this.exemplaresDisponiveis;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getSecao() {
        return this.secao;
    }

    public void setEstante(String estante) {
        this.estante = estante;
    }

    public String getEstante() {
        return this.estante;
    }
    // #endregion
}
