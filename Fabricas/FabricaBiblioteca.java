package Projeto_Biblioteca.Fábricas;

import Projeto_Biblioteca.Biblioteca;

public class FabricaBiblioteca {
    public FabricaBiblioteca() {
    }

    public static Biblioteca criar(String nomeBiblioteca, int totalLeitores, double taxaMultaDiaria,
            int limiteLivrosPorLeitor) {
        return new Biblioteca(nomeBiblioteca, totalLeitores, taxaMultaDiaria, limiteLivrosPorLeitor);
    }
}