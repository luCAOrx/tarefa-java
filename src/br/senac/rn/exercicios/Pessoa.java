package br.senac.rn.exercicios;

public class Pessoa {

    private String nome;
    private Integer idade;
    private Double peso;
    private Double altura;

    public Pessoa(String nome, Integer idade, Double peso, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer(Integer quantidadeAnos) {
        Integer idadeComAcrescimo = idade + quantidadeAnos;
        if (idadeComAcrescimo <= 21) {
            for (int i = 0; i < quantidadeAnos; i++) {
                crescer(0.5);
            }
        } else {
            Integer auxiliar = 21 - idade;
            for (int i = 0; i < auxiliar; i++) {
                crescer(0.5);
            }
        }
        idade += quantidadeAnos;
    }

    public void engordar(Double novoPesoGordo) {
        peso += novoPesoGordo;
    }

    public void emagrecer(Double novoPesoMagro) {
        peso -= novoPesoMagro;
    }

    public void crescer(Double quantidadeDeAltura) { altura += quantidadeDeAltura; }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
