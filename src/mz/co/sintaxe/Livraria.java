package mz.co.sintaxe;

import java.util.ArrayList;

public class Livraria {

    public static ArrayList<Livro> livrosInformatica;

    public Livraria() {

        livrosInformatica = new ArrayList<>();

        criarLivros();
    }

    public void criarLivros() {

        Livro livro = new Livro();
        livro.nome = "Java 8 Practico";
        livro.descricao = "Novos recursos da Linguagem";
        livro.valor = 199.99;
        livro.isbn = "978-85-66250-46-6";

        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789.10";


        Livro livroUm = new Livro();
        livroUm.nome = "Java 10 Practico";
        livroUm.descricao = "Novos recursos da Linguagem";
        livroUm.valor = 998.99;
        livroUm.isbn = "978-85-66250-46-6";

        Autor autorUm = new Autor();
        autorUm.nome = "Rodrigo Turini";
        autorUm.email = "rodrigo.turini@caelum.com.br";
        autorUm.cpf = "123.456.789.10";


        Livro livroDois = new Livro();
        livroDois.nome = "Java 9 Practico";
        livroDois.descricao = "Novos recursos da Linguagem";
        livroDois.valor = 2000.99;
        livroDois.isbn = "978-85-66250-46-6";

        Autor autorDois = new Autor();
        autorDois.nome = "Rodrigo Turini";
        autorDois.email = "rodrigo.turini@caelum.com.br";
        autorDois.cpf = "123.456.789.10";


        livrosInformatica.add(livro);
        livrosInformatica.add(livroUm);
        livrosInformatica.add(livroDois);

    }


    public static void imprimirLivros() {

        for (int i = 0; i < livrosInformatica.size(); i++) {

            livrosInformatica.get(i).imprimirDetalhesDoLivro();

        }
    }


}
