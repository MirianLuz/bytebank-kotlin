class ContaCorrente(
    titular: String,
    numeroConta: Int
): Conta(titular, numeroConta) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}