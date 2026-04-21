package Projeto_Biblioteca;

// Importação de bibliotecas importantes para a implementação da Classe
import java.util.List;
import java.util.ArrayList;

public class Leitor {
    // Atributos da Classe Leitor
    private int idLeitor;
    private String nome;
    private String endereco;
    private int telefone;
    private String email;
    private String senha;
    private int numLeiturasAtuais;
    private List<Livro> livrosAtuais = new ArrayList<>();
    private double multaAtual;

    // Método Construtor
    public Leitor(int idLeitor, String nome, String endereco, int telefone, String email, String senha,
            int numLeiturasAtuais, List<Livro> livrosAtuais, double multaAtual) {
        this.setIdLeitor(idLeitor);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.setSenha(senha);
        this.setNumLeiturasAtuais(numLeiturasAtuais);
        this.setLivrosAtuais(livrosAtuais);
        this.setMultaAtual(multaAtual);
    }

    // #region Getters e Setters
    public void setIdLeitor(int idLeitor) {
        this.idLeitor = idLeitor;
    }

    public int getIdLeitor() {
        return this.idLeitor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setNumLeiturasAtuais(int numLeiturasAtuais) {
        this.numLeiturasAtuais = numLeiturasAtuais;
    }

    public int getNumLeiturasAtuais() {
        return this.numLeiturasAtuais;
    }

    public void setLivrosAtuais(List<Livro> LivrosAtuais) {
        this.livrosAtuais = new ArrayList<>(LivrosAtuais);
    }

    public List<Livro> getLivrosAtuais() {
        return this.livrosAtuais;
    }

    public void setMultaAtual(double multaAtual) {
        this.multaAtual = multaAtual;
    }

    public double getMultaAtual() {
        return this.multaAtual;
    }
    // #endregion
}
