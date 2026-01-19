package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 18;
        naruto.aldeia = "Aldeia da folha";
        naruto.ModoSabio();

        Uchicha sasuke = new Uchicha();
        sasuke.nome = "Sasuke Uchicha";
        sasuke.idade = 20;
        sasuke.aldeia = "Aldeia da folha";
        sasuke.ShariganAtivado();

        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 17;
        sakura.aldeia = "Aldeia da folha";
        sakura.Cura();

        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.idade = 17;
        hinata.aldeia = "Aldeia da folha";
        hinata.Byakugan();

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Uzumaki";
        boruto.idade = 15;
        boruto.aldeia = "Aldeia da folha";
        boruto.ModoSabio();
        boruto.Jougan();
        boruto.Karma();

    }
}
