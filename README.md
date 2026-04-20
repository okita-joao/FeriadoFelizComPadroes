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

- Fábrica
  + Implementação da Fábrica para as seguintes classes do projeto: Acervo, Biblioteca, Bibliotecario, Funcionario, Gestor, Leitor, Livro, LivroDigital, LivroFisico, Zelador.
- Singleton
  + Logger para registro de informações importantes na realização de um empréstimo (data, livro, usuário, data de devolução, etc.)
- Proxy
  + Proxy de verificação de tipo de um Livro que será adicionado no Acervo Físico ou Digital
- Adaptador
- Fachada
- Decorador
- Estratégia
- Observador
