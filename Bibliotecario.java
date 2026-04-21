package Projeto_Biblioteca;

public class Bibliotecario extends Funcionario {
    // Atributos da Classe bibliotecario
    private String CRB; // código de Identificação do Bibliotecário perante o Conselho Regional de
                        // Biblioteconomia

    // Método Construtor
    public Bibliotecario(String nome, int idFuncionario, double salario, String turno, String cpf, int anoAdmissao,
            String CRB) {
        super(nome, idFuncionario, salario, turno, cpf, anoAdmissao);
        this.setCRB(CRB);
    }

    // #region Getters e Setters
    public void setCRB(String CRB) {
        this.CRB = CRB;
    }

    public String getCRB() {
        return this.CRB;
    }
    // #endregion
}
