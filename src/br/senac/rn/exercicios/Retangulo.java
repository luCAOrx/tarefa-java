package br.senac.rn.exercicios;

public class Retangulo {

    public Double base = 0.0;
    public Double altura = 0.0;

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void mudarValorDaBase(Double novaBase) {
        base = novaBase;
    }

    public void mudaValorDaAltura(Double novaAltura) {
        altura = novaAltura;
    }

    public Double retornaValorDaBase() {
        return base;
    }

    public Double retornaValorDaAltura() {
        return altura;
    }

    public Double calculaArea() {
        return base * altura;
    }

    public Double calculaPerimetro() {
       return (base + altura) * 2;
    }

}
