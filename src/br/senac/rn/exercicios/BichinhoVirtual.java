package br.senac.rn.exercicios;

public class BichinhoVirtual {

    public String nome = "";
    public Integer fome = 100;
    public Integer saude = 100;
    public Integer idade = 0;

    public String  alterarNome(String novoNome) {
        nome = novoNome;
        return nome;
    }

    public Integer fome() {
        return fome;
    }

    public Integer saude() {
        switch (fome) {
            Integer laranja = 10;
            Integer carneDeVaca = 30;
            case laranja:
        }
        return saude;
    }

    public Integer idade() {
        return idade;
    }

    public Integer humor() {
        Integer humor = fome + saude;
        return humor;
    }

}
