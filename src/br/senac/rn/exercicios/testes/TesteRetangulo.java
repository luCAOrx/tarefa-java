package br.senac.rn.exercicios.testes;

import br.senac.rn.exercicios.Retangulo;

public class TesteRetangulo {

    public static void main(String[] args) {

        Double altura = 8.0;
        Double base = 7.0;

        Retangulo salaAula = new Retangulo(base, altura);

        Retangulo pisoSala = new Retangulo(0.45, 0.45);

        Retangulo rodapeSala = new Retangulo(0.45, 0.15);

        Double quantidadeDePisos = salaAula.calculaArea() / pisoSala.calculaArea();

        System.out.println("Quantidade de pisos: " + Math.ceil(quantidadeDePisos));

        Double quantidadeDeRodapes = salaAula.calculaPerimetro() / rodapeSala.retornaValorDaBase();

        System.out.println("Quantidade de rodapés: " + Math.ceil(quantidadeDeRodapes));

    }

}
