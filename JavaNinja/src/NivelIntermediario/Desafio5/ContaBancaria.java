package NivelIntermediario.Desafio5;

public abstract class ContaBancaria  implements Conta{
        double saldo = 0;
        TipoDeConta tipoConta;

        public ContaBancaria() {
        }

        public ContaBancaria(double saldo) {
            this.saldo = saldo;
        }

        public ContaBancaria(double saldo, TipoDeConta tipoConta) {
            this(saldo);
            this.tipoConta = tipoConta;
    }

        public  void tranferenciaEntreContas(ContaBancaria destino,Double valor){
            this.saldo -= valor;
            destino.saldo += valor;
        }


        @Override
        public abstract void Depositar(Double valor);

        @Override
        public void ConsultarSaldo() {
            System.out.println("seu saldo e de: " + saldo);
        }

        public double getSaldo() {
            return saldo;
    }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
    }
}





