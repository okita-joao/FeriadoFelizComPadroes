package Projeto_Biblioteca;

// Importação de bibliotecas necessárias para a implementação
import java.util.List;
import java.util.ArrayList;

// Classe Abstrata Livro
public class Livro {
    // Atributos principais de um Livro qualquer
    private String ISBN;
    private String titulo;
    private List<String> autores = new ArrayList<>();
    private String editora;
    private int edicao;
    private int anoPublicacao;
    private int numPaginas;
    private String idioma;
    private boolean emprestado;

    // Construtores
    public Livro(String ISBN, String titulo, List<String> autores, String editora, int edicao, int anoPublicacao,
            int numPaginas, String idioma, boolean emprestado) {
        this.setISBN(ISBN);
        this.setTitulo(titulo);
        this.setAutores(autores);
        this.setEditora(editora);
        this.setEdicao(edicao);
        this.setAnoPublicacao(anoPublicacao);
        this.setNumPaginas(numPaginas);
        this.setIdioma(idioma);
    }

    // #region Getters e Setters

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void addAutor(String autor) {
        this.autores.add(autor);
    }

    public void removeAutor(String autor) {
        this.autores.remove(autor);
    }

    public void setAutores(List<String> autores) {
        this.autores = new ArrayList<>(autores);
    }

    public List<String> getAutores() {
        return this.autores;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEditora(String editora) {
        return this.editora;
    }

    public void setAnoPublicacao(int ano) {
        this.anoPublicacao = ano;
    }

    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getEdicao() {
        return this.edicao;
    }

    public void setNumPaginas(int paginas) {
        this.numPaginas = paginas;
    }

    public int getNumPaginas() {
        return this.numPaginas;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return this.idioma;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public boolean getEmprestado() {
        return this.emprestado;
    }

    // #endregion

}