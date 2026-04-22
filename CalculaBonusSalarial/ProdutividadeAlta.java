package Projeto_Biblioteca.CalculaBonusSalarial;

import Projeto_Biblioteca.Funcionario;

public class ProdutividadeAlta implements EstrategiaCalculoBonusSalarial{
    // Método Construtor da Classe
    public ProdutividadeAlta() {}

    // Método de Cálculo de Bônus Salarial para Alta Produtividade
    public double calculaBonusSalarial(Funcionario f){
        return f.getSalario()*0.33;
    }
}
