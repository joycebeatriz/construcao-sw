public class ContaBancaria {
    private Double saldo;

    public ContaBancaria(Double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(Double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(Double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo restante: " + saldo);
        }
    }

    public Double getSaldo() {
        return saldo;
    }
}
