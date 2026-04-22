package Projeto_Biblioteca;

import java.util.ArrayList;
import java.util.List;

import Projeto_Biblioteca.Apresentação.*;
import Projeto_Biblioteca.CalculaBonusSalarial.*;
import Projeto_Biblioteca.DecoradorLivro.DecoracaoEdicao.*;
import Projeto_Biblioteca.DecoradorLivro.DecoracaoPremiacao.*;
import Projeto_Biblioteca.Empréstimo.*;
import Projeto_Biblioteca.Fábricas.*;
import Projeto_Biblioteca.Kindle.*;
import Projeto_Biblioteca.LeitorNavegador.*;
import Projeto_Biblioteca.Leitor_Digital.*;
import Projeto_Biblioteca.MuralDeAvisos.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== INICIANDO SISTEMA DA BIBLIOTECA ===\n");

        // 1. SINGLETON & FACHADA
        // Obtendo a instância única da biblioteca (Fachada para o sistema)
        Biblioteca bib = Biblioteca.getBiblioteca();
        System.out.println("Log: [Singleton] Biblioteca '" + bib.getNomeBiblioteca() + "' carregada.\n");

        // 2. FÁBRICAS (FACTORY)
        // Criando livros, leitores e funcionários através das fábricas
        List<String> autores = new ArrayList<>();
        autores.add("J.R.R. Tolkien");

        Livro livro1 = FabricaLivroFisico.criar("123-ABC", "O Senhor dos Anéis", autores, "HarperCollins", 1, 1954,
                1200, "Português", false, false, "Novo", 5, 5, "Fantasia", "A1");

        Leitor leitor1 = FabricaLeitor.criar(1, "João Silva", "Rua das Flores, 123", 99999999, "joao@email.com",
                "senha123", 0, new ArrayList<>(), 0.0);

        // Criando funcionários com estratégias iniciais
        Bibliotecario biblio = FabricaBibliotecario.criar("Maria Gestora", 101, 5000.0, "Manhã", "111.222.333-44", 2015,
                "CRB-99", new ProdutividadeMedia());
        Zelador zelador = FabricaZelador.criar("Carlos Manutenção", 102, 2500.0, "Noite", "444.555.666-77", 2020,
                "Bloco A", new ProdutividadeBaixa());

        System.out.println("Log: [Factory] Objetos criados com sucesso.\n");

        // 3. OBSERVADOR (OBSERVER)
        // Configurando o mural de avisos e inscrevendo os funcionários
        MuralDeAvisos mural = new MuralDeAvisos("Bem-vindos à biblioteca!");
        mural.addObserver(biblio);
        mural.addObserver(zelador);

        System.out.println("Log: [Observer] Alterando aviso no mural...");
        mural.setAvisoAtual("Reunião geral no auditório às 15h.");
        System.out.println("");

        // 4. ESTRATÉGIA (STRATEGY)
        // Calculando bônus com diferentes estratégias
        System.out.println("Log: [Strategy] Cálculo de Bônus Salarial:");
        System.out.println("Bônus Maria (Prod. Média): R$ " + biblio.getBonusSalarial().calculaBonusSalarial(biblio));

        // Mudando a estratégia em tempo de execução
        System.out.println("Log: [Strategy] Carlos melhorou o desempenho! Mudando para Produtividade Alta.");
        zelador.setBonusSalarial(new ProdutividadeAlta());
        System.out.println("Novo Bônus Carlos: R$ " + zelador.getBonusSalarial().calculaBonusSalarial(zelador) + "\n");

        // 5. DECORADOR (DECORATOR)
        // Personalizando a apresentação do livro
        System.out.println("Log: [Decorator] Apresentação do Livro com Adicionais:");
        ApresentaLivroInterface apresentacaoBase = new ApresentaLivro(livro1);
        ApresentaLivroInterface edicaoRara = new EdicaoRaraLivro(apresentacaoBase, "Capa de Couro");
        ApresentaLivroInterface premiadoERara = new PremiacaoLivro(edicaoRara, "Melhor Fantasia de Todos os Tempos");

        premiadoERara.apresentacaoLivro();
        System.out.println("\n");

        // 6. PROXY
        // Tentativa de empréstimo controlada pelo Proxy
        System.out.println("Log: [Proxy] Iniciando processo de empréstimo...");
        EmprestaLivro servicoReal = new EmprestaLivro();
        EmprestaLivroProxy proxy = new EmprestaLivroProxy(servicoReal);

        // O Proxy vai verificar as regras da Biblioteca (Singleton) e do Livro
        proxy.emprestaLivro(leitor1, livro1);
        System.out.println(
                "Status do livro após empréstimo: " + (livro1.getEmprestado() ? "Emprestado" : "Disponível") + "\n");

        // 7. ADAPTADOR (ADAPTER)
        // Usando o Kindle e o Navegador através da interface comum
        System.out.println("Log: [Adapter] Testando Leitores Digitais:");
        LivroDigital livroDigital = FabricaLivroDigital.criar("999-XYZ", "Java para Iniciantes", autores, "TechBooks",
                1, 2023, 300, "Inglês", false, false, "PDF", 15.5, "link.com/java", true);

        // Usando Adaptador para Kindle
        LeitorDigitalInterface adaptadorKindle = new AdaptadorKindle(new Kindle());
        LeitorDigital dispositivoKindle = new LeitorDigital(adaptadorKindle);
        dispositivoKindle.lerLivroDigital(livroDigital);
        System.out.println("");

        // Usando Adaptador para Navegador
        LeitorDigitalInterface adaptadorNav = new AdaptadorLeitorNavegador(new LeitorNavegador());
        LeitorDigital dispositivoNav = new LeitorDigital(adaptadorNav);
        dispositivoNav.lerLivroDigital(livroDigital);

        System.out.println("\n\n=== FIM DA EXECUÇÃO DO SISTEMA ===");
    }
}
