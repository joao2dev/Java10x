package NivelIntermediario.Polimofismo;

public abstract class Hokages  {

    String nome;
    int idade;
    boolean vivoOuMorto;

    public Hokages(){

    }
    public Hokages(String nome , int idade , boolean vivoOuMorto ){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
    }
    public abstract void SabedoriaHokage();


}
