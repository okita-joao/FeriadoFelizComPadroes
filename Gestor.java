package Projeto_Biblioteca;

public class Gestor extends Funcionario {
    // Atributos da Classe Gestor
    private String cargo;

    // Método Construtor
    public Gestor(String nome, int idFuncionario, double salario, String turno, String cpf, int anoAdmissao,
            String cargo) {
        super(nome, idFuncionario, salario, turno, cpf, anoAdmissao);
        this.setCargo(cargo);
    }

    // #region Getters e Setters
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }
    // #endregion
}
