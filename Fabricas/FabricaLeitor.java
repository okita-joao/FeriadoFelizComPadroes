package Projeto_Biblioteca.Fábricas;

import java.util.List;

import Projeto_Biblioteca.Leitor;
import Projeto_Biblioteca.Livro;

public class FabricaLeitor {
    public FabricaLeitor() {
    }

    public static Leitor criar(int idLeitor, String nome, String endereco, int telefone, String email, String senha,
            int numLeiturasAtuais, List<Livro> livrosAtuais, double multaAtual) {
        return new Leitor(idLeitor, nome, endereco, telefone, email, senha, numLeiturasAtuais, livrosAtuais,
                multaAtual);
    }
}
