package NivelIntermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public ContaPoupanca(double saldo, TipoDeConta tipoConta) {
        super(saldo, tipoConta);
    }



    @Override
    public void Depositar(Double valor) {
        double taxaDeDeposito = valor * 0.01;
        saldo += valor;
        saldo -= taxaDeDeposito;
        System.out.println("seu saldo foi atualizado!!!");
    }

    @Override
    public void ConsultarSaldo() {
        super.ConsultarSaldo();
    }
}
