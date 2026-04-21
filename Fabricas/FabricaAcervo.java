package Projeto_Biblioteca.Fábricas;

// Importação de bibliotecas importantes para a implementação da Classe
import Projeto_Biblioteca.Acervo;

public class FabricaAcervo {
    // Método Construtor da Fábrica de Acervo
    public FabricaAcervo() {
    }

    // Método para criar um Acervo
    public static Acervo criar() {
        return new Acervo();
    }
}