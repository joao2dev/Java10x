package NivelBasico.Arrays.Condicoes;

public class IfElse {
    public static void main(String[] args) {

        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 10;

        if (numeroDeMissoes == 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        } else if(numeroDeMissoes >= 2) {
            System.out.println("Rank: Jounin");
        }else {
            System.out.println("rank Gennin");
        }
    }
}
