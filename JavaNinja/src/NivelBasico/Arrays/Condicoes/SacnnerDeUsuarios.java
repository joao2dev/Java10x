package NivelBasico.Arrays.Condicoes;

import java.util.Scanner;

public class SacnnerDeUsuarios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o nome do ninja: ");
        String nomeDoNinja = sc.nextLine();
        System.out.println("o nome do ninja e: " + nomeDoNinja );

        System.out.println("digite a idade de " + nomeDoNinja + ":");
        int idade = sc.nextInt();
        System.out.println("a idade de " + nomeDoNinja + " e " + idade + " anos" );

        if ( idade < 18){
            System.out.println("o ninja nao pode fazer missoes fora da vila.");
        }
        else {
            System.out.println("o ninja pode fazer missoes fora da vila");
        }
    }
}
