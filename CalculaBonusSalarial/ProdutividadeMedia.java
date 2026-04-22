package Projeto_Biblioteca.CalculaBonusSalarial;

import Projeto_Biblioteca.Funcionario;

public class ProdutividadeMedia implements EstrategiaCalculoBonusSalarial {
    // Método Construtor da Classe
    public ProdutividadeMedia() {
    }

    // Método para Cálculo do Bônus para Produtividade Média
    public double calculaBonusSalarial(Funcionario f) {
        return f.getSalario() * 0.15;
    }
}
