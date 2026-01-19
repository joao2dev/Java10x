package NivelIntermediario.Deasafio1;

public class Uzumaki extends Ninja implements Habilidade {
    @Override
    public void HabilidadeAtivada(){
        System.out.println("a Habilidade espeical: "+ HabilidadeEspecial +", de " + nome + " esta ativado!!!");
    }

    @Override
    public void MostrarInformações() {
        super.MostrarInformações();
        HabilidadeAtivada();
    }
}
