package br.senac.rn.exercicios.testes;

import br.senac.rn.exercicios.TV;

public class TesteTV {

    public static void main(String[] args) {

        TV usuario = new TV();

        System.out.println(usuario);

        usuario.canal(45);
        System.out.println(usuario);

        usuario.aumentarVolume(101);
        System.out.println(usuario);

        usuario.diminuirVolume(5);
        System.out.println(usuario);

    }

}
