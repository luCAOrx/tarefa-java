package br.senac.rn.exercicios.testes;

import br.senac.rn.exercicios.Quadrado;

public class TesteQuadrado {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();

        quadrado.tamanhoDoLado = 5.0;

        System.out.println("Lado: " + quadrado.retornaValorDoLado());

        System.out.println("Área: " + quadrado.calculaArea());

        quadrado.mudarValorDoLado(10.0);

        System.out.println("Lado: " + quadrado.retornaValorDoLado());

        System.out.println("Área: " + quadrado.calculaArea());

    }

}
