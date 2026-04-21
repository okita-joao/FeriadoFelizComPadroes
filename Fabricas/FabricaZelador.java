package Projeto_Biblioteca.Fábricas;

import Projeto_Biblioteca.Zelador;

public class FabricaZelador {
    public FabricaZelador() {
    }

    public static Zelador criar(String nome, int idFuncionario, double salario, String turno, String cpf,
            int anoAdmissao,
            String setorResponsavel) {
        return new Zelador(nome, idFuncionario, salario, turno, cpf, anoAdmissao, setorResponsavel);
    }
}
