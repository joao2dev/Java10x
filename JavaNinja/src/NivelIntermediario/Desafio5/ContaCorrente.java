package NivelIntermediario.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente(double saldo, TipoDeConta tipoConta) {
        super(saldo, tipoConta);
    }



    @Override
    public void Depositar(Double valor) {
        saldo+= valor;
        System.out.println("saldo atualizado!!!");
    }
    @Override
    public void ConsultarSaldo() {
        System.out.println("seu saldo e de: " + saldo);
    }
}
