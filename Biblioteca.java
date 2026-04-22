package Projeto_Biblioteca;

// Importação de bibliotecas importantes para a implementação da Classe
import java.util.List;
import java.util.ArrayList;
import Projeto_Biblioteca.Fábricas.*;

public class Biblioteca {
    // Instância Estática (Singleton)
    private static Biblioteca biblioteca;

    // Atributos da Classe Biblioteca
    private String nomeBiblioteca;
    private int totalLeitores;
    private double taxaMultaDiaria;
    private int limiteLivrosPorLeitor;

    // Acervos Físico e Digital
    private Acervo acervoFisico;
    private Acervo acervoDigital;

    // Estruturas de Armazenamento para os frequentadores da Biblioteca
    private List<Leitor> usuarios;
    private List<Bibliotecario> equipeBibliotecarios;
    private List<Gestor> equipeGestao;
    private List<Zelador> equipeZelamento;

    // Método Construtor
    private Biblioteca(String nomeBiblioteca, int totalLeitores, double taxaMultaDiaria, int limiteLivrosPorLeitor) {
        this.setNomeBiblioteca(nomeBiblioteca);
        this.setTotalLeitores(totalLeitores);
        this.setTaxaMultaDiaria(taxaMultaDiaria);
        this.setLimiteLivrosPorLeitor(limiteLivrosPorLeitor);

        this.acervoFisico = FabricaAcervo.criar();
        this.acervoDigital = FabricaAcervo.criar();

        this.usuarios = new ArrayList<>();
        this.equipeBibliotecarios = new ArrayList<>();
        this.equipeGestao = new ArrayList<>();
        this.equipeZelamento = new ArrayList<>();
    }

    // Método getInstance()
    public static Biblioteca getBiblioteca() {
        if (biblioteca == null) {
            biblioteca = new Biblioteca("Biblioteca", 0, 2, 3);
        }
        return biblioteca;
    }

    // #region Getters e Setters
    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public String getNomeBiblioteca() {
        return this.nomeBiblioteca;
    }

    public void setTotalLeitores(int totalLeitores) {
        this.totalLeitores = totalLeitores;
    }

    public int getTotalLeitores() {
        return this.totalLeitores;
    }

    public void setTaxaMultaDiaria(double taxaMultaDiaria) {
        this.taxaMultaDiaria = taxaMultaDiaria;
    }

    public double getTaxaMultaDiaria() {
        return this.taxaMultaDiaria;
    }

    public void setLimiteLivrosPorLeitor(int limiteLivrosPorLeitor) {
        this.limiteLivrosPorLeitor = limiteLivrosPorLeitor;
    }

    public int getLimiteLivrosPorLeitor() {
        return this.limiteLivrosPorLeitor;
    }

    public void setAcervoFisico(Acervo acervoFisico) {
        Acervo temp = FabricaAcervo.criar();
        temp.setLivros(acervoFisico.getLivros());
        this.acervoFisico = temp;
    }

    public Acervo getAcervoFisico() {
        return this.acervoFisico;
    }

    public void setAcervoDigital(Acervo acervoDigital) {
        Acervo temp = FabricaAcervo.criar();
        temp.setLivros(acervoDigital.getLivros());
        this.acervoDigital = temp;
    }

    public Acervo getAcervoDigital() {
        return this.acervoDigital;
    }

    public void setUsuarios(List<Leitor> usuarios) {
        this.usuarios = new ArrayList<>(usuarios);
    }

    public List<Leitor> getUsuarios() {
        return this.usuarios;
    }

    public void addUsuario(Leitor leitor) {
        this.getUsuarios().add(leitor);
    }

    public void removeUsuario(Leitor leitor) {
        this.getUsuarios().remove(leitor);
    }

    public void setEquipeBibliotecarios(List<Bibliotecario> equipeBibliotecarios) {
        this.equipeBibliotecarios = new ArrayList<>(equipeBibliotecarios);
    }

    public List<Bibliotecario> getEquipeBibliotecarios() {
        return this.equipeBibliotecarios;
    }

    public void addBibliotecario(Bibliotecario b) {
        this.getEquipeBibliotecarios().add(b);
    }

    public void removeBibliotecario(Bibliotecario b) {
        this.getEquipeBibliotecarios().remove(b);
    }

    public void setEquipeGestao(List<Gestor> equipeGestao) {
        this.equipeGestao = new ArrayList<>(equipeGestao);
    }

    public List<Gestor> getEquipeGestao() {
        return this.equipeGestao;
    }

    public void addGestor(Gestor g) {
        this.getEquipeGestao().add(g);
    }

    public void removeGestor(Gestor g) {
        this.getEquipeGestao().remove(g);
    }

    public void setEquipeZelamento(List<Zelador> equipeZelamento) {
        this.equipeZelamento = new ArrayList<>(equipeZelamento);
    }

    public List<Zelador> getEquipeZelamento() {
        return this.equipeZelamento;
    }

    public void addZelador(Zelador z) {
        this.getEquipeZelamento().add(z);
    }

    public void removeZelador(Zelador z) {
        this.getEquipeZelamento().remove(z);
    }

    // #endregion
}
