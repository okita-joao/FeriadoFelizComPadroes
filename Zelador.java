package Projeto_Biblioteca;

public class Zelador extends Funcionario {
    // Atributos da Classe Zelador
    private String setorResponsavel;

    // Método Construtor
    public Zelador(String nome, int idFuncionario, double salario, String turno, String cpf, int anoAdmissao,
            String setorResponsavel) {
        super(nome, idFuncionario, salario, turno, cpf, anoAdmissao);
        this.setSetorResponsavel(setorResponsavel);
    }

    // #region Getters e Setters
    public void setSetorResponsavel(String setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
    }

    public String getSetorResponsavel() {
        return this.setorResponsavel;
    }
    // #endregion
}
