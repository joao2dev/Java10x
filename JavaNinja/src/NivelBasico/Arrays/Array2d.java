package NivelBasico.Arrays;

public class Array2d {
    public static void main(String[] args) {

        String[][] ninjaEAldeia = new String[3][3];

        ninjaEAldeia[0][0] = "Konoha";
        ninjaEAldeia[0][1] = "naruto Uzumaki";
        ninjaEAldeia[0][2] = "sasuke Uchicha";

        ninjaEAldeia[1][0] = "Nevoa";
        ninjaEAldeia[1][1] = "Zabuza";
        ninjaEAldeia[1][2] = "Haku";

        ninjaEAldeia[2][0] = "Deserto";
        ninjaEAldeia[2][1] = "Gaara";
        ninjaEAldeia[2][2] = "Temari";

        for (int i = 0; i < ninjaEAldeia.length; i++) {
            System.out.println("Aldeia: " + ninjaEAldeia[i][0] + ": ninjas : "+ ninjaEAldeia[i][1] + " , " + ninjaEAldeia[i][2]  );
        }
    }
}
