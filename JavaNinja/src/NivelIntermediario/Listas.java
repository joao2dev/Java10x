package NivelIntermediario;

import java.util.*;

public class Listas {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
        List<String> ninjaList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("digite um nome: ");
            String nome = sc.next();
//          Adcionar elementos
            ninjaList.add(nome);
        }
        System.out.println(ninjaList);

//      Remover elementos
        ninjaList.remove(0);
        System.out.println(ninjaList);
//      Trocar elemento
        ninjaList.set(0,"cleiton");
        System.out.println(ninjaList);

//        STACKS

        Stack<String> ninjas = new Stack<>();
//      ADICIONAR ITENS
        ninjas.push("naruto");
        ninjas.push("sasuke");
        ninjas.push("sakura");
        ninjas.push("kakashi");
        System.out.println(ninjas);
//      REMOVER O ULTIMO ITEM
        ninjas.pop();
        System.out.println(ninjas);
//      VER O PRIMEIRO ITEM DA STACK
        System.out.println(ninjas.peek());
//      VER O TAMNHO DA STACK
        System.out.println(ninjas.size());
*/

//        QUEUE
        Queue<String> filaDeNinjas = new LinkedList<>();
//        ADICIONAR ITENS
        filaDeNinjas.add("naruto");
        filaDeNinjas.add("sasuke");
        filaDeNinjas.add("minato");
        filaDeNinjas.add("madara");
        System.out.println(filaDeNinjas);
//      RETIRAR UM ITEM
        filaDeNinjas.poll();
        System.out.println(filaDeNinjas);
//      VERIFICAR SE A LISTA ESTA VAZIA
        filaDeNinjas.poll();
        filaDeNinjas.poll();
        filaDeNinjas.poll();

        if (filaDeNinjas.isEmpty()){
            System.out.println("Fila foi esvaziada");
        }


    }
}
