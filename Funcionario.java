package Projeto_Biblioteca;

import Projeto_Biblioteca.CalculaBonusSalarial.EstrategiaCalculoBonusSalarial;

public class Funcionario {
    // Atributos da Classe Funcionário
    private String nome;
    private int idFuncionario;
    private double salario;
    private String turno;
    private String cpf;
    private int anoAdmissao;
    private EstrategiaCalculoBonusSalarial bonusSalarial;

    // Método Construtor
    public Funcionario(String nome, int idFuncionario, double salario, String turno, String cpf, int anoAdmissao,
            EstrategiaCalculoBonusSalarial t) {
        this.setNome(nome);
        this.setIdFuncionario(idFuncionario);
        this.setSalario(salario);
        this.setTurno(turno);
        this.setCPF(cpf);
        this.setAnoAdmissao(anoAdmissao);
        this.setBonusSalarial(t);
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

    public void setBonusSalarial(EstrategiaCalculoBonusSalarial t) {
        this.bonusSalarial = t;
    }

    public EstrategiaCalculoBonusSalarial getBonusSalarial() {
        return this.bonusSalarial;
    }
    // #endregion

    public double calculaBonusSalarial() {
        return this.getBonusSalarial().calculaBonusSalarial(this);
    }
}
