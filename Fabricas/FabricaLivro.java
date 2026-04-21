package Projeto_Biblioteca.Fábricas;

import java.util.List;

import Projeto_Biblioteca.Livro;

public class FabricaLivro {
    public FabricaLivro() {
    }

    public static Livro criar(String ISBN, String titulo, List<String> autores, String editora, int edicao,
            int anoPublicacao,
            int numPaginas, String idioma, boolean emprestado) {
        return new Livro(ISBN, titulo, autores, editora, edicao, anoPublicacao, numPaginas, idioma, emprestado);
    }
}
