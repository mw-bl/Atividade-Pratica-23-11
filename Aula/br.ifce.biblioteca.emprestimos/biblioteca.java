package br.ifce.biblioteca.emprestimos;

import java.util.ArrayList;

public class biblioteca {
        public static void main(String [] args) {
            ArrayList<String> acervoLivros = new ArrayList<>();
                acervoLivros.add("Harry Potter 1");
                acervoLivros.add("Jogos Vorazes 2");
                acervoLivros.add("A Rainha Vermelha");

                System.out.println("Acervo de Livros:");

                for (String livro: acervoLivros) {
                    System.out.println(livro);
                }
        }
        
}
