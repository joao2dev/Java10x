package NivelIntermediario.Polimofismo;

public class Main {
    public static void main(String[] args) {

        NivelIntermediario.Polimofismo.Uchicha sasuke = new Uchicha();
        sasuke.nome = "Sasuke";
        sasuke.HabilidadeEspecial();

        NivelIntermediario.Polimofismo.Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.HabilidadeEspecial();
        naruto.EstrategiaDeBatalha();

        Minato minato = new Minato();

        minato.SabedoriaHokage();

        Hatake kakashi = new Hatake("kakashi",48,"aldeia da folha");
        kakashi.AtivarSharigan();
        kakashi.membroAnbu();

        Uchicha madara = new Uchicha("Madara","aldeia da folha", 50 ,900,NivelNinja.KAGE);
        madara.HabilidadeEspecial();
        madara.numeroDeMissoes();
        madara.InteligenciaDeCombate();
        madara.InteligenciaDeCombate(150);

    }
}
