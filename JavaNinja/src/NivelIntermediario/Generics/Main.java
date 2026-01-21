package NivelIntermediario.Generics;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        BolsaGenerica<Object> itens = new BolsaGenerica<>();
        itens.colocarEquipamentos(new Kunai("kunai de fogo"));
        itens.colocarEquipamentos(new Pergaminho("pergaminhos de fogo"));
        itens.colocarEquipamentos(new Shuriken(20));

        System.out.println("itens que voce esta levando:".toUpperCase());
        itens.mostrarLista();
    }
}
