package NivelBasico.Arrays.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

    /** variavel = {condiçao} ? verificar se e verdade : verificar se e falso**/
    short numeroDeMissoes = 10;

    String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja ja completou mais de 10 missoes" : "Esse ninja completo menos de 10 missoes";

    System.out.println(nivelDoNinja);
    }
}
