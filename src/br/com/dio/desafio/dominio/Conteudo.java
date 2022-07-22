package br.com.dio.desafio.dominio;
//classe mãe
//abstrata para que não seja possível instanciar a classe conteúdo, ou criar uma nova classe conteúdo.
//útil para implementar atributos e evitar repetição de códigos.

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d; //criar uma constante
    //static para poder acessar o xp padrão de fora do conteúdo
    private  String titulo;
    private  String descricao; // Conceito de encapsulamento com modificador de acesso (private)//

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
