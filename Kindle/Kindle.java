package Projeto_Biblioteca.Kindle;

import Projeto_Biblioteca.LivroDigital;

public class Kindle {

    // Método Construtor da Classe
    public Kindle() {
    }

    // Método para apresentar Livro Digital
    public void mostrarLivroDigital(LivroDigital livro) {
        System.out.printf("Kindle iniciando e apresentando o livro %s, ISBN: %s", livro.getTitulo(), livro.getISBN());
    }
}
