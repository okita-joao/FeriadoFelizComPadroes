package Projeto_Biblioteca.LeitorNavegador;

import Projeto_Biblioteca.LivroDigital;

public class LeitorNavegador {
    // Método Construtor
    public LeitorNavegador() {
    }

    // Método para Leitura de um Livro Digital num Navegador
    public void abrirLivroDigitalNavegador(LivroDigital livro) {
        System.out.printf("Navegando iniciando e apresentando o livro %s, ISBN: %s", livro.getTitulo(),
                livro.getISBN());
    }
}
