package NivelIntermediario.Deasafio1;

public class Uchicha extends Ninja implements Habilidade{

    @Override
    public void HabilidadeAtivada(){
        System.out.println("a Hablidade espeical: "+ HabilidadeEspecial +", de " + nome + " esta ativado!!!");
    }

    @Override
    public void MostrarInformações() {
        super.MostrarInformações();
        HabilidadeAtivada();
    }
}
