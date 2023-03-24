package org.example;

public class Main {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[3];
        p[0] = new Pessoa("João da Silva", 30, "Pleno");
        p[1] = new Pessoa("Adelaide Assunção", 46, "Junior");
        p[2] = new Pessoa("Jonatas Cordeiro", 23, "Senior");


        Cachorro c[] = new Cachorro[2];
        c[0] = new Cachorro("Cosquinha",5, true);
        c[1] = new Cachorro("Bilisco", 3, false);

        Caminhada cam = new Caminhada();

        //cam.andar(p[0], c[1]);
        System.out.println(cam.cuidar(p[0], c[1]));

    }
}