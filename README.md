# FeriadoFelizComPadroes

# Padrões a serem colocados no projeto:
- Fábrica
- Singleton
- Proxy
- Adaptador
- Fachada
- Decorador
- Estratégia
- Observador

# Ideia inicial do Projeto
Implementar uma aplicação para gerenciamento de um acervo digital e físico de uma Biblioteca.

# Descrição do contexto
A Biblioteca busca implementar um sistema de gestão híbrida para organizar seu acervo composto por livros físicos e digitais. Enquanto as obras físicas demandam controle de localização em estantes e monitoramento de integridade, os exemplares digitais focam na gestão de links de acesso e downloads. O ecossistema é operado por Bibliotecários, que detêm a autoridade para gerenciar contas de Leitores, registrar saídas e monitorar pendências financeiras. A operação centraliza-se no controle de empréstimos, diferenciando a logística de devolução e cálculo de multas para itens físicos da liberação temporária de acesso para arquivos em PDF, garantindo que a circulação de obras seja restrita a usuários cadastrados e que a saúde financeira da instituição seja preservada através do rigoroso controle de atrasos.

# Diagrama de Classes UML do projeto (Atualizado)
https://viewer.diagrams.net/?tags=%7B%7D&lightbox=1&target=blank&highlight=0000ff&edit=_blank&layers=1&nav=1&title=Biblioteca.drawio&dark=auto#Uhttps%3A%2F%2Fdrive.google.com%2Fuc%3Fid%3D1z6_mAdNwLgtDfLVppVeA_hlXnDJ_oTVX%26export%3Ddownload

# Ideias Atuais para implementação de cada Padrão de Projeto

- Fábrica ✅
  + Implementação da Fábrica para as seguintes classes do projeto: Acervo, Bibliotecario, Funcionario, Gestor, Leitor, Livro, LivroDigital, LivroFisico, Zelador.
- Singleton ✅
  + Implementar um Singleton para a própria classe Biblioteca, pois dessa forma garantimos que só existirá uma única instancia para a Biblioteca no programa. 
- Proxy ✅
  + Controlar o acesso a livros raros (só quem tem permissão especial pode "abrir" o objeto). 
- Adaptador ✅
  + Se você precisar integrar seu sistema com um leitor de Kindle externo que usa um formato de dados diferente. 
- Fachada ✅
  + Ao utilizar o padrão de Singleton na classe Biblioteca, também foi otimizado a utilização do método construtor da Biblioteca, ao qual não necessita mais da citação de vários parâmetros para se criar uma Biblioteca como instância, mas o próprio método getInstance() do Singleton implementado cria uma Biblioteca com atributos pré-setados que podem ser tranquilamente alterados pelos métodos Getters e Setters dessa classe. 
- Decorador ✅
  + Adicionar premiações a um livro (ex: um Livro campeão do prêmio Jabuti).
  + Adicionar na descrição do livro que este se trata de uma edição especial.
  + Obs.: Tanto o aspecto de edição especial, quanto os prêmios que o livro ganhou serão destados ao lado do Título do Livro.
- Estratégia ✅
  + Diferentes formas de calcular o Bônus Salarial de um Funcionário dependendo da sua Produtividade (Alta, Média ou Baixa).
- Observador ✅
  + Avisar os leitores quando um livro reservado ficar disponível.

# Main (Escopo)
A ideia central do Main é simular uma série de acontecimentos dentro da aplicação desenvolvida na Biblioteca afim de testar as funcionalidades dos Padrões de Projetos implementados.

Resumidamente, a sequência esperada de operações a serem testadas na Main por enquanto são:
