package NivelIntermediario.Polimofismo;

public abstract class Ninja implements EstrategiaNinja{

    //TODO: adicionar novas variaveis, nivel e missoesFeitas
    String nome;
    String aldeia;
    int idade;
    long missoesFeitas;
    NivelNinja rank;


    public Ninja() {
    }
    //TODO:sobrecarregar construtor

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, long missoesFeitas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.missoesFeitas = missoesFeitas;
        this.rank = rank;
    }

    public void HabilidadeEspecial(){
        System.out.println(nome + "esta usando sua habilidade especial.");
    }

    @Override
    public void EstrategiaDeBatalha() {
        System.out.print("Estrategia de batalha de " + nome + ": ");
    }
    public abstract void numeroDeMissoes();

    //TODO: criar metodo InteligenciaDeCombate e sua sobrecarga
    @Override
    public void InteligenciaDeCombate() {
        System.out.println("Meu nome e: "+nome+" e essa e minha Inteligencia de Combate");
    }
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
