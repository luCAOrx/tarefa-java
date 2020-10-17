package br.senac.rn.exercicios;

public class TV {

    public Integer numeroDoCanal = 11;
    public Integer Volume = 100;

    public void canal(Integer novoCanal) {
        numeroDoCanal = novoCanal;
    }

    public void aumentarVolume(Integer novoVolumeAumentado) {
        if (Volume >= 100) {
            System.out.println("O volume da TV só vai até 100!!!");
        } else {
            Volume += novoVolumeAumentado;
        }
    }

    public void diminuirVolume(Integer novoVolumeDiminuido) {
        if (Volume <= 0) {
            System.out.println("O volume da TV não pode ser mais diminuido!!!");
        } else {
            Volume -= novoVolumeDiminuido;
        }
    }

    @Override
    public String toString() {
        return "TV{" +
                "numeroDoCanal=" + numeroDoCanal +
                ", Volume=" + Volume +
                '}';
    }
}


