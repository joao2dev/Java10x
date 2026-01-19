package NivelIntermediario.Polimofismo;

public class Hatake extends Ninja implements ShariganInterface,AnbuIntefarce,Hokage{

    public Hatake(){
        super();
    }
    public Hatake(String nome, int idade , String aldeia){
        super(nome, aldeia, idade);
    }

    @Override
    public void AtivarSharigan() {
        System.out.println(nome + " ativou o sharigan!!!");
    }

    @Override
    public void membroAnbu() {
        System.out.println("eu me chamo " + nome + " e sou um ninja de elite da anbu");
    }

    @Override
    public void eUHokage() {
        System.out.println(nome +" e um hokage");
    }

    @Override
    public void SabedoriaHokage() {
        System.out.println(nome +" tem a sabedoria hokage");
    }
    public void numeroDeMissoes() {
        System.out.println("Numero de missoes concluidas por " + nome + ": "+ missoesFeitas);
    }
}
