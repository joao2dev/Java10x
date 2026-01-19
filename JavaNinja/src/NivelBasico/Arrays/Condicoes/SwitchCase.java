package NivelBasico.Arrays.Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("1- Naruto Uzumaki");
        System.out.println("2- Sasuke Uchicha");
        System.out.println("3- Sakura Haruna");

        int personagem = sc.nextInt();

        switch (personagem){

            default:
                System.out.println("personagem nao identificado.");
                break;

            case 1:
                System.out.println("voce escolheu Naruto Uzumaki");
                break;

            case 2:
                System.out.println("voce escolheu Sasuke Uchicha");
                break;

            case 3:
                System.out.println("Voce escolheu Sakura Haruma");
                break;
        }
    }
}
