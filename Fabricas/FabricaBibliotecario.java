package Projeto_Biblioteca.Fábricas;

import Projeto_Biblioteca.Bibliotecario;

public class FabricaBibliotecario {
    public FabricaBibliotecario() {
    }

    public static Bibliotecario criar(String nome, int idFuncionario, double salario, String turno, String cpf,
            int anoAdmissao,
            String CRB) {
        return new Bibliotecario(nome, idFuncionario, salario, turno, cpf, anoAdmissao, CRB);
    }
}