package NivelIntermediario.Desafio6;

import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {

//       TODO: fazer loop while e menu

        Scanner sc = new Scanner(System.in);
        NinjaGenerico<Ninja> listaDeNinjas = new NinjaGenerico<>();

        for (int i = 0; i < 1; i++) {
            System.out.println("nome do ninja: ");
            String nome = sc.next();
            System.out.println("idade do ninja: ");
            int idade = sc.nextInt();
            System.out.println("aldeia do ninja: ");
            String aldeia = sc.next();


            listaDeNinjas.colocarNinja(new Ninja(nome,idade,aldeia));


        }

        listaDeNinjas.mostrarLista();

        listaDeNinjas.infoNinja(0);
    }

}
