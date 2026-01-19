package NivelIntermediario.Polimofismo;

public class Uzumaki extends Ninja {
    @Override
    public void HabilidadeEspecial(){
        System.out.println(nome + " esta usando sua habilidade: respiração do vento.");

    }

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void EstrategiaDeBatalha() {
        super.EstrategiaDeBatalha();
        System.out.println("Contra atacar");
    }
    public void numeroDeMissoes() {
        System.out.println("Numero de missoes concluidas por " + nome + ": "+ missoesFeitas);
    }
}
