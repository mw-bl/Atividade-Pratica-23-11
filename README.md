ATIVIDADE PRÁTICA

Elabore um sistema para controle de empreśtimos de livros em uma biblioteca. O sistema deverá ter os conceitos apresentados na disciplina até o momento (classes, atributos, métodos, array ou arrayList, encapsulamento e organização em pacotes).

- Definição das Classes e Métodos:
  - Classes Necessárias:
  - Livro: Representa informações sobre um livro (título, autor, ano de publicação, status, etc.).
  - Usuario: Representa informações sobre os usuários da biblioteca (nome, ID, lista de livros emprestados, etc.).
  - Biblioteca: Responsável por gerenciar o acervo de livros e as operações de empréstimo.
  - ArrayList para acervo de livros (tipo Livros)

- Métodos das Classes:
  - Classe Livro:
    - Métodos get e set para atributos.
    - Outros métodos relevantes para manipulação de informações do livro.
  - Classe Usuario:
    - Métodos get e set para atributos.
    - getLivrosEmprestados(): Retorna a lista de livros emprestados pelo usuário.
    - emprestarLivro(Livro livro): Adiciona um livro à lista de livros emprestados do usuário.
    - devolverLivro(Livro livro): Remove um livro da lista de livros emprestados do usuário.
    - Outros métodos necessários para manipulação de informações do usuário.
  - Classe Biblioteca:
    - cadastrarLivro(Livro livro): Adiciona um novo livro ao acervo da biblioteca.
    - removerLivro(Livro livro): Remove um livro do acervo.
    - realizarEmprestimo(Usuario usuario, Livro livro): Realiza o empréstimo de um livro para um usuário.
    - receberDevolucao(Usuario usuario, Livro livro): Recebe a devolução de um livro e atualiza o status na biblioteca.
    - Outros métodos necessários para gerenciamento do acervo e empréstimos.
