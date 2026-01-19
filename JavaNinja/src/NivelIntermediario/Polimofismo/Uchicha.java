package NivelIntermediario.Polimofismo;

public class Uchicha extends Ninja implements ShariganInterface {
    @Override
    public void HabilidadeEspecial(){
        System.out.println(nome + " esta usando sua habilidade: Poder de fogo.");
    }

    public void AtivarSharigan(){
        System.out.println(nome + "ativou o sharigan!!!");
    }
    public Uchicha(){
        super();
    }
    public Uchicha(String nome, int idade , String aldeia){
        super(nome, aldeia, idade);
    }

    public Uchicha(String nome, String aldeia, int idade, long missoesFeitas, NivelNinja rank) {
        super(nome, aldeia, idade, missoesFeitas, rank);
    }

    @Override
    public void numeroDeMissoes() {
        System.out.println("Numero de missoes concluidas por " + nome + ": "+ missoesFeitas);
    }
    @Override
    public void InteligenciaDeCombate() {
        System.out.println("Meu nome e: "+nome+" e essa e minha Inteligencia de Combate");
    }
    @Override
    public void InteligenciaDeCombate(int qi) {
        if (qi >= 150){
            System.out.println(nome + " e um genio");
        } else if (qi >=100) {
            System.out.println(nome + " e um ninja promissor");
        }else {
            System.out.println(nome + " precisa melhorar sua estrategias de combate");
        }

    }
}
