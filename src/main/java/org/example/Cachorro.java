package org.example;

public class Cachorro {
    public String nome;
    public int idade;
    public boolean ferroz;
    public Pessoa pessoa;

    public Cachorro(String nome, int idade, boolean ferroz) {
        this.nome = nome;
        this.idade = idade;
        this.ferroz = ferroz;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean getFerroz() {
        return ferroz;
    }

    public void setFerroz(boolean ferroz) {
        this.ferroz = ferroz;
    }
}
