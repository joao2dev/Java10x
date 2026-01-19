package NivelIntermediario.Deasafio1;

public class Main {
    public static void main(String[] args) {
        Uchicha sasuke = new Uchicha();
        sasuke.nome = "Sasuke Uchicha.";
        sasuke.idade = 18;
        sasuke.missao = "derrotar itachi.";
        sasuke.nivelDificuldadeMissao = "Dificil.";
        sasuke.StatusMissao = "em andamento.";
        sasuke.HabilidadeEspecial = "sharigan";
        sasuke.MostrarInformações();
        System.out.println("==============================================================================");
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki.";
        naruto.idade = 18;
        naruto.missao = "treinar.";
        naruto.nivelDificuldadeMissao = "normal.";
        naruto.StatusMissao = "concluida.";
        naruto.HabilidadeEspecial = "controle do ar";
        naruto.MostrarInformações();
    }
}
