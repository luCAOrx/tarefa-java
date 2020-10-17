package br.senac.rn.exercicios;

public class Quadrado {

    public Double tamanhoDoLado = 0.0;

    public void mudarValorDoLado(Double novoLado) {
        tamanhoDoLado = novoLado;
    }

    public Double retornaValorDoLado() {
        return tamanhoDoLado;
    }

    public Double calculaArea() {
        return tamanhoDoLado * tamanhoDoLado;
    }

}
