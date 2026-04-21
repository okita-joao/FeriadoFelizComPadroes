package Projeto_Biblioteca.Fábricas;

import Projeto_Biblioteca.Gestor;

public class FabricaGestor {
    public FabricaGestor() {
    }

    public static Gestor criar(String nome, int idFuncionario, double salario, String turno, String cpf,
            int anoAdmissao,
            String cargo) {
        return new Gestor(nome, idFuncionario, salario, turno, cpf, anoAdmissao, cargo);
    }
}
