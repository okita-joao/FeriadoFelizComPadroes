package Projeto_Biblioteca;

// Bibliotecas utilizadas na implementação da interface
import java.util.Map;
import java.util.TreeMap;

public class Acervo {
    // Atributos da Classe Abstrata
    private Map<String, Livro> livros = new TreeMap<>();

    // Método Construtor
    public Acervo() {
    }

    // Métodos da Classe Abstrata
    public void setLivros(Map<String, Livro> livros) {
        if (livros.getClass() == TreeMap.class) {
            this.livros = new TreeMap<>(livros);
        } else {
            System.out.println(
                    "Não é possível setar os livros do acervo pois esta classe aceita apenas TreeMaps como estrutura de dados de armazenamento de livros.");
        }
    }

    public Map<String, Livro> getLivros() {
        return this.livros;
    }

    public void addLivro(Livro livro) {
        Map<String, Livro> temp = this.getLivros();
        if (temp instanceof TreeMap) {
            temp = (TreeMap<String, Livro>) temp;
            temp.put(livro.getISBN(), livro);
        }
    }

    public void removeLivro(Livro livro) {
        Map<String, Livro> temp = this.getLivros();
        if (temp instanceof TreeMap) {
            temp = (TreeMap<String, Livro>) temp;
            temp.remove(livro.getISBN());
        }
    }

    public Livro buscaLivro(String ISBN) {
        Map<String, Livro> temp = this.getLivros();
        if (temp instanceof TreeMap) {
            temp = (TreeMap<String, Livro>) temp;
            return temp.get(ISBN);
        } else {
            return null;
        }
    }

    public void pesquisaLivrosDisponiveis(String titulo) {
        // Faz uma varredura em busca de todos os livros disponiveis de determinado
        // título, seja ele digital ou físico
        for (Map.Entry<String, Livro> entrada : this.getLivros().entrySet()) {
            String isbn = entrada.getKey();
            Livro livro = entrada.getValue();

            if (!livro.getEmprestado()) {
                System.out.println("ISBN: " + isbn + " - Título: " + livro.getTitulo());
            }
        }
    }

    public int getNumLivros() {
        Map<String, Livro> temp = this.getLivros();
        if (temp instanceof TreeMap) {
            temp = (TreeMap<String, Livro>) temp;
            return temp.size();
        } else {
            return -1; // caso de erro
        }
    }
}
