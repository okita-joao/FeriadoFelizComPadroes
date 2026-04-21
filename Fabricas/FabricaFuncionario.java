package Projeto_Biblioteca.Fábricas;

import Projeto_Biblioteca.Funcionario;

public class FabricaFuncionario {
    public FabricaFuncionario() {
    }

    public static Funcionario criar(String nome, int idFuncionario, double salario, String turno, String cpf,
            int anoAdmissao) {
        return new Funcionario(nome, idFuncionario, salario, turno, cpf, anoAdmissao);
    }
}
