package NivelIntermediario.Generics;

public class Shuriken {
    int quantidade;

    public Shuriken(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString(){
        return "Shurikens: " + quantidade;
    }
}
