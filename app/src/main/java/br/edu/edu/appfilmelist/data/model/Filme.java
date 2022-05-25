package br.edu.edu.appfilmelist.data.model;

public class Filme {
    private final String nome;
    private final String capa;



    public Filme(String nome, String capa) {
        this.nome=nome;
        this.capa=capa;
    }

    public String getNome() {
        return nome;
    }

    public String getCapa() {
        return capa;
    }
}
