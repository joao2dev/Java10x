package NivelBasico.Arrays.Desafios;

public class Desafio01 {
    public static void main(String[] args) {
        /* nomes */
        String ninjaA = "naruto";
        String ninjaB = "boruto";
        String ninjaC = "kakashi";
        /* idades */
        int idadeNinjaA = 10;
        int idadeNinjaB =14;
        int idadeNinjaC = 18;
        /* missoes*/
        String missao1 = "coletar madeira";
        char dificuldadeMissao1 = 'C';
        String missao2 = "treinar";
        char dificuldadeMissao2 = 'A';
        String missao3 = "limpar calçada";
        char dificuldadeMissao3 = 'D';

        if(idadeNinjaA < 15){
            if (dificuldadeMissao1 == 'C' || dificuldadeMissao1 == 'D'){
                boolean statusMissao = true;
                System.out.println(ninjaA.toUpperCase());
                System.out.println("Missao: "+ missao1);
                System.out.println("Nivel: "+ dificuldadeMissao1);
                System.out.println("missao Concluida: " + statusMissao);
                System.out.println("");
            }
            else {
                boolean statusMissao = false;
                System.out.println(ninjaA.toUpperCase());
                System.out.println("Missao: "+ missao1);
                System.out.println("Nivel: "+ dificuldadeMissao1);
                System.out.println("missao Concluida: " + statusMissao);
                System.out.println("");
            }

        }
        else{
            boolean statusMissao = true;
            System.out.println(ninjaA.toUpperCase()+":");
            System.out.println("Missao: "+ missao1);
            System.out.println("Nivel: "+ dificuldadeMissao1);
            System.out.println("missao Concluida: " + statusMissao);
            System.out.println("");
        } if (idadeNinjaB <= 15){
            if (dificuldadeMissao2 == 'C' || dificuldadeMissao2 == 'D'){
                boolean statusMissao = true;
                System.out.println(ninjaA.toUpperCase());
                System.out.println("Missao: "+ missao1);
                System.out.println("Nivel: "+ dificuldadeMissao1);
                System.out.println("missao Concluida: " + statusMissao);
                System.out.println("");
            }
            else {
                boolean statusMissao = false;
                System.out.println(ninjaB.toUpperCase());
                System.out.println("Missao: "+ missao2);
                System.out.println("Nivel: "+ dificuldadeMissao2);
                System.out.println("missao Concluida: " + statusMissao);
                System.out.println("");
            }

        }
        else{
            boolean statusMissao = true;
            System.out.println(ninjaB.toUpperCase());
            System.out.println("Missao: "+ missao2);
            System.out.println("Nivel: "+ dificuldadeMissao2);
            System.out.println("missao Concluida: " + statusMissao);
            System.out.println("");
        }
         if(idadeNinjaC <= 15){
             if (dificuldadeMissao3 == 'C' || dificuldadeMissao3 == 'D'){
                 boolean statusMissao = true;
                 System.out.println(ninjaC.toUpperCase());
                 System.out.println("Missao: "+ missao3);
                 System.out.println("Nivel: "+ dificuldadeMissao3);
                 System.out.println("missao Concluida: " + statusMissao);
                 System.out.println("");
             }
             else {
                 boolean statusMissao = false;
                 System.out.println(ninjaC.toUpperCase());
                 System.out.println("Missao: "+ missao3);
                 System.out.println("Nivel: "+ dificuldadeMissao3);
                 System.out.println("missao Concluida: " + statusMissao);
                 System.out.println("");
             }

         }
        else{
            boolean statusMissao = true;
            System.out.println(ninjaC.toUpperCase());
             System.out.println("Missao: "+ missao3);
             System.out.println("Nivel: "+ dificuldadeMissao3);
            System.out.println("missao Concluida: " + statusMissao);
        }

}}
