package mz.co.sintaxe;

public class Livro {


    String nome;

    String descricao;

    double valor;

    String isbn;

    Autor autor;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void aplicaDescontoDe(double percentagem){

        if (percentagem > 0.3){

            System.out.println("Desconto deve ser menor que 30%");

        }else {
            this.valor -= this.valor *percentagem;

            System.out.println("O valor com desconto " +valor);

        }


    }

    public boolean temAutor(){

        boolean naoEhNull = this.autor != null;

        return naoEhNull;
    }


    public void imprimirDetalhesDoLivro(){

        System.out.println("Titulo:  " +nome);

        System.out.println("Descricao:  " +descricao);

        System.out.println("Valor:  " +valor);

        System.out.println("ISBN: " +isbn);



        if (temAutor()){

            System.out.println("---------------------AUTOR---------------");

            autor.imprimirDetalhesDoAutor();

        }else {

            System.out.println("---------------------NAO TEM AUTOR---------------");

        }


    }

}
