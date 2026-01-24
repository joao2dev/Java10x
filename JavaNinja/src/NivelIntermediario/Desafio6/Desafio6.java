package NivelIntermediario.Desafio6;

import NivelBasico.Arrays.Condicoes.SwitchCase;

import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {

//       TODO: fazer loop while e menu

        Scanner sc = new Scanner(System.in);
        NinjaGenerico<Ninja> listaDeNinjas = new NinjaGenerico<>();
        System.out.println("---------------cadastro inicial---------------".toUpperCase());
        for (int i = 0; i < 1; i++) {
            System.out.println("nome do ninja: ");
            String nome = sc.next();
            System.out.println("idade do ninja: ");
            int idade = sc.nextInt();
            System.out.println("aldeia do ninja: ");
            String aldeia = sc.next();

            listaDeNinjas.colocarNinja(new Ninja(nome,idade,aldeia));
        }
        boolean continuarPrograma = true ;
        
//      LOOP DE MENU
        
        while(true){
            if (!continuarPrograma) {
                break;
            }

//          MENU INTERATIVO
            
            System.out.println("opções:".toUpperCase());
            System.out.println("0- Ver lista.");
            System.out.println("1- Remover o primeiro ninja.");
            System.out.println("2- Adicionar ninja no inicio.");
            System.out.println("3- Ver informações de um ninja.");
            System.out.println("4- Sair.");
            System.out.println("Digite o numero da opção aqui: ");
            int opcao = sc.nextInt();

            switch(opcao){

                default:
                    System.out.println("-------------- OPÇÃO INVALIDA -------------");
                    System.out.println("por favor coloque uma opção valida!".toUpperCase());
                    System.out.println("----------------- OPCÕES ------------------");
                    break;

                case 0:
                    System.out.println("----------------- OPCÕES ------------------");
                    listaDeNinjas.mostrarLista();
                    System.out.println("----------------- OPCÕES ------------------");
                    break;

                case 1:
                    System.out.println("----------------- REMOVER PRIMEIRO NINJA ------------------");
                    listaDeNinjas.removerPrimeiroNinja();
                    System.out.println("Ninja removido!!!".toUpperCase());
                    System.out.println("Lista atualizada:".toUpperCase());
                    listaDeNinjas.mostrarLista();
                    System.out.println("----------------- OPCÕES ------------------");
                    break;

                case 2:
                    System.out.println("----------------- ADICIONAR NINJA ------------------");
                    System.out.println("nome do ninja: ");
                    String nome = sc.next();
                    System.out.println("idade do ninja: ");
                    int idade = sc.nextInt();
                    System.out.println("aldeia do ninja: ");
                    String aldeia = sc.next();
                    listaDeNinjas.adiconarNinjaInicio(new Ninja(nome,idade,aldeia));
                    System.out.println("----------------- OPCÕES ------------------");
                    break;

                case 3:
                    System.out.println("----------------- VER INFO ------------------");
                    listaDeNinjas.mostrarLista();
                    System.out.println("digite a posição do ninja que deseja acessar as informações: ");
                    int linha = sc.nextInt();
                    System.out.println("-----------------INFORMAÇÕES DO NINJA ------------------");
                    listaDeNinjas.infoNinja(linha);
                    System.out.println("----------------- OPCÕES ------------------");
                    break;
                case 4:
                    System.out.println("----------- SAIR ------------");
                    System.out.println("saindo do programa...".toUpperCase());
                    continuarPrograma = false;
                    break;
                  }

            }



        }

    }


