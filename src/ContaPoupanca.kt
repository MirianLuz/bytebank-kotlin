class ContaPoupanca(
    titular: String,
    numeroConta: Int
): Conta(titular, numeroConta) {
    override fun saca(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }

}