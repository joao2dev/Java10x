package NivelIntermediario;

public class Ninjas {
    String nome;
    String aldeia;
    int idade;



    public String Saudacao(){
        return "oi eu sou um ninja";
    }

    public int TempoDeFormacao(int tempoDeFormacao){
        return tempoDeFormacao - idade;
    }
}
