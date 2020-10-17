package br.senac.rn.exercicios;

public class ContaCorrente {

    private String numeroDaConta;
    private String nomeDoCorrentista;
    private Double saldo = 0.0;

    public ContaCorrente(String numeroDaConta, String nomeDoCorrentista, Double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = saldo;
    }

    public void alterarNome(String novoNome) {
        nomeDoCorrentista = novoNome;
    }

    public void deposito(Double valorParaDepositar) {
        saldo += valorParaDepositar;
    }

    public void saque(Double valorParaSacar) {
        saldo -= valorParaSacar;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numeroDaConta='" + numeroDaConta + '\'' +
                ", nomeDoCorrentista='" + nomeDoCorrentista + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
