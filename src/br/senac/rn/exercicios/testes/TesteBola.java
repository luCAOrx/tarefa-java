package br.senac.rn.exercicios.testes;

import br.senac.rn.exercicios.Bola;

public class TesteBola {

    public static void main(String[] args) {
        Bola bolaFutebol = new Bola();

        bolaFutebol.cor = "azul";
        bolaFutebol.circunferencia = 0.5;
        bolaFutebol.material = "couro";

        System.out.println(bolaFutebol.mostraCor());

        bolaFutebol.trocaCor("vermelho");

        System.out.println(bolaFutebol.mostraCor());

    }

}
