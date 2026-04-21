package Projeto_Biblioteca;

public class Funcionario {
    // Atributos da Classe Funcionário
    private String nome;
    private int idFuncionario;
    private double salario;
    private String turno;
    private String cpf;
    private int anoAdmissao;

    // Método Construtor
    public Funcionario(String nome, int idFuncionario, double salario, String turno, String cpf, int anoAdmissao) {
        this.setNome(nome);
        this.setIdFuncionario(idFuncionario);
        this.setSalario(salario);
        this.setTurno(turno);
        this.setCPF(cpf);
        this.setAnoAdmissao(anoAdmissao);
    }

    // #region Getters e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getIdFuncionario() {
        return this.idFuncionario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCPF() {
        return this.cpf;
    }

    public void setAnoAdmissao(int anoAdmissao) {
        this.anoAdmissao = anoAdmissao;
    }

    public int getAnoAdmissao() {
        return this.anoAdmissao;
    }
    // #endregion
}
