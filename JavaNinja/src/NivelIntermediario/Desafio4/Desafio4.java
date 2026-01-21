package NivelIntermediario.Desafio4;

public class Desafio4 {
    public static void main(String[] args) {

        System.out.println("--------------- NARUTO UZUMAKI -----------------");
        NinjaBasico naruto = new NinjaBasico("Naruto Uzumaki", 15, "Controle do vento" ,TipoHabilidade.GENJUTSU);
        naruto.mostrarInformações();
        naruto.executarHabilidades();
        System.out.println("--------------- KAKASHI HATAKE -----------------");
        NinjaAvancado kakashi = new NinjaAvancado("Kakashi Hatake",50,"sharigan","qi de combate alto",TipoHabilidade.NINJUTSU);
        kakashi.mostrarInformações();
        kakashi.executarHabilidades();
    }
}
