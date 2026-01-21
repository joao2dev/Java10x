package NivelIntermediario.Desafio4;

public class NinjaAvancado implements Ninja {
    String nome;
    int idade;
    String habilidade;
    String especialidade;
    TipoHabilidade tipo;

    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade, TipoHabilidade tipo) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
        this.tipo = tipo;
    }

    @Override
    public void mostrarInformações() {
        System.out.println("Nome: " + nome );
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Tipo de Habilidade: " + tipo);
    }

    @Override
    public void executarHabilidades() {
        System.out.println(nome + " Ativou sua Habilidade , " + habilidade);
    }


}
