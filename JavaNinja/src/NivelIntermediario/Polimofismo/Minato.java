package NivelIntermediario.Polimofismo;

public class Minato extends Uzumaki implements Hokage{
    @Override
    public void SabedoriaHokage() {
        System.out.println("Voce ganhou sabedoria");
    }

    @Override
    public void eUHokage() {
        System.out.println(nome + "e um hokage");
    }
}
