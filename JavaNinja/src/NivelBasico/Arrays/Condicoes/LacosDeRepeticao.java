package NivelBasico.Arrays.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 20;

       /** while (numeroDeClones <= numeroMaximoDeClones){
            numeroDeClones++;
            System.out.println("o naruto fez " + numeroDeClones + " clones.");
        }**/

        for (int i = 0; i <= numeroMaximoDeClones ; i++) {
            System.out.println("o naruto fez " + i + " clones.");
        }
    }
}
