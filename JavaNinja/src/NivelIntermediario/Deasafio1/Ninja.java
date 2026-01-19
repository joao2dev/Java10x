package NivelIntermediario.Deasafio1;

import jdk.jshell.Snippet;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldadeMissao;
    String StatusMissao;
    String HabilidadeEspecial;

    public void MostrarInformações(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDificuldadeMissao);
        System.out.println("Status da missao: " + StatusMissao);
    }

}
