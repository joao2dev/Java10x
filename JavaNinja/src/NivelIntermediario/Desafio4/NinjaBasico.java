package NivelIntermediario.Desafio4;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoDeHabilidade;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public NinjaBasico(String nome, int idade, String habilidade, TipoHabilidade tipoDeHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoDeHabilidade = tipoDeHabilidade;
    }

    @Override
    public void mostrarInformações() {
        System.out.println("Nome: " + nome );
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Tipo de Habilidade: " + tipoDeHabilidade);
    }

    @Override
    public void executarHabilidades() {
        System.out.println(nome + " Ativou sua Habilidade , " + habilidade);
    }
}
