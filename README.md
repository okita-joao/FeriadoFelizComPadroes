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
- Singleton ❌
  + A própria classe Biblioteca ou o gerenciador de configurações do sistema. 
- Proxy ❌
  + Controlar o acesso a livros raros (só quem tem permissão especial pode "abrir" o objeto). 
- Adaptador ❌
  + Se você precisar integrar seu sistema com um leitor de Kindle externo que usa um formato de dados diferente. 
- Fachada ❌
  + Uma classe SistemaBiblioteca que simplifica o uso, escondendo a complexidade das fábricas, acervo e multas. 
- Decorador ❌
  + Adicionar funcionalidades a um livro (ex: um "Livro com Capa Especial" ou "Livro com Seguro").
- Estratégia ❌
  + Diferentes formas de calcular a multa (multa para alunos vs. multa para professores).
- Observador ❌
  + Avisar os leitores quando um livro reservado ficar disponível.

# Main (Escopo)
A ideia central do Main é simular uma série de acontecimentos dentro da aplicação desenvolvida na Biblioteca afim de testar as funcionalidades dos Padrões de Projetos implementados.

Resumidamente, a sequência esperada de operações a serem testadas na Main por enquanto são:

1 - O sistema inicia (Singleton).

2 - O Bibliotecário adiciona um livro (Fábrica).

3 - Um Usuário se cadastra e assina notificações (Observer).

4 - O Usuário tenta pegar um livro, mas o sistema verifica permissões (Proxy).

5 - O cálculo da multa é feito de forma diferente para ele (Strategy).
