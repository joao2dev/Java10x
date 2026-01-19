package NivelBasico.Arrays.Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("deseja continuar? ");
        String continuar = "sim";
        int quant = 0;
        String[] ninjas = null;
        do{
            System.out.println("Bem-vindo ao sistema de cadastro:".toUpperCase());
            System.out.println("1- cadastrar novos ninjas.");
            System.out.println("2- exibir lista de ninjas.");

            System.out.println("Escolha sua opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                default:
                    System.out.println("opção invalida, tente novamente");
                    break;
                case 1:
                    System.out.println("quantos ninjas quer cadastrar? ");
                    quant = sc.nextInt();
                    sc.nextLine();
                    ninjas = new String[quant];
                    for (int i = 0; i < quant; i++) {
                        System.out.println("digite o nome do ninja: ");
                        ninjas[i] = sc.nextLine();
                    }
                    break;

                case 2:
                    if (ninjas == null){
                        System.out.println("a lista esta vazia.");
                    }else{
                        System.out.println("ninjas cadastrados: ".toUpperCase());
                        System.out.println("");
                        for (int i = 0; i < quant; i++) {
                            System.out.println((i + 1) + " - " + ninjas[i]);
                        }
                    }
                    break;

            }
            System.out.println("deseja continuar? ");
            continuar = sc.next().toLowerCase();
        } while(continuar.equals("sim"));
        System.out.println("sistema encerrado...".toUpperCase());
    }}