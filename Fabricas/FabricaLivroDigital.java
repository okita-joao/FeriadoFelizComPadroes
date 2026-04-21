package Projeto_Biblioteca.Fábricas;

import java.util.List;

import Projeto_Biblioteca.LivroDigital;

public class FabricaLivroDigital {
    public FabricaLivroDigital() {
    }

    public static LivroDigital criar(String ISBN, String titulo, List<String> autores, String editora, int edicao,
            int anoPublicacao,
            int numPaginas, String idioma, boolean emprestado, String formatoArquivo, double tamanhoArquivo,
            String linkAcesso,
            boolean possuiDRM) {
        return new LivroDigital(ISBN, titulo, autores, editora, edicao, anoPublicacao, numPaginas, idioma, emprestado,
                formatoArquivo, tamanhoArquivo, linkAcesso, possuiDRM);
    }
}