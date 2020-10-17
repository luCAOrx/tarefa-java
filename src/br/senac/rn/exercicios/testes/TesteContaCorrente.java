package br.senac.rn.exercicios.testes;

import br.senac.rn.exercicios.ContaCorrente;

public class TesteContaCorrente {

    public static void main(String[] args) {
        ContaCorrente pessoa = new ContaCorrente("09083-0", "José Zezinho", 10.0);

        System.out.println(pessoa);

        pessoa.alterarNome("Joze Zezinho Pereira");
        System.out.println(pessoa);

        pessoa.deposito(10.0);
        System.out.println(pessoa);

        pessoa.saque(10.0);
        System.out.println(pessoa);

    }

}
