package NivelIntermediario.Desafio5;

public class Desafio5 {
    public static void main(String[] args) {
        ContaCorrente naruto = new ContaCorrente(200,TipoDeConta.CORRENTE);
        naruto.Depositar(200.00);
        naruto.ConsultarSaldo();
        naruto.ConsultarSaldo();


        ContaPoupanca sasuke = new ContaPoupanca(200,TipoDeConta.POUPANCA);
        sasuke.Depositar(100.00);
        sasuke.ConsultarSaldo();
        sasuke.tranferenciaEntreContas(naruto,200.00);
        sasuke.ConsultarSaldo();
        naruto.ConsultarSaldo();
    }

}
