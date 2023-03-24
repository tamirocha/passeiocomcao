package org.example;

public class Caminhada {

    public Cachorro cachorro;
    public Pessoa pessoa;
    private static String SENIOR = "Senior";
    private static String PLENO =  "Pleno";
    private static String JUNIOR = "Junior";


    public void andar(Pessoa pessoa, Cachorro cachorro) {
        System.out.println("O (a) " + pessoa.getNome() + " está andando com o cachorro " + cachorro.getNome());
    }

    public boolean cuidar(Pessoa pessoa, Cachorro cachorro) {
        if (cachorro.ferroz == true) {
            if (pessoa.getExperiencia().equals(SENIOR)) {
                System.out.println("O cuidador (a) " + pessoa.getNome() + "´é nível Sênior, pode cuidar do cão " + cachorro.getNome());
            } else if (cachorro.ferroz == true) {
                if (pessoa.getExperiencia().equals(PLENO)) {
                    System.out.println("O cuidador (a) " + pessoa.getNome() + " é nível Pleno, precisa aprimorar seu treinamento para cuidar do cão " + cachorro.getNome() + "! Precisa de supervisão.");
                } else if (cachorro.ferroz == true) {
                    if (pessoa.getExperiencia().equals(JUNIOR)) {
                        System.out.println("O cuidador (a) " + pessoa.getNome() + " é nível Júnior, não pode cuidar do cão" + cachorro.getNome());

                    }else {
                        boolean b = cachorro.ferroz == false;
                        System.out.println(" O cão " + cachorro.getNome() + " é manso, qualquer cuidador pode cuidar dele");

                    }

                }

            }

        }
        return false;
    }
}

