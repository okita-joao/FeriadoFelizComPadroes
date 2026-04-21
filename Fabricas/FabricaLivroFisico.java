package Projeto_Biblioteca.Fábricas;

import java.util.List;

import Projeto_Biblioteca.LivroFisico;

public class FabricaLivroFisico {
    public FabricaLivroFisico() {
    }

    public static LivroFisico criar(String ISBN, String titulo, List<String> autores, String editora, int edicao,
            int anoPublicacao,
            int numPaginas, String idioma, boolean emprestado, String estado, int numExemplares,
            int exemplaresDisponiveis, String secao,
            String estante) {
        return new LivroFisico(ISBN, titulo, autores, editora, edicao, anoPublicacao, numPaginas, idioma, emprestado,
                estado,
                numExemplares, exemplaresDisponiveis, secao, estante);
    }
}