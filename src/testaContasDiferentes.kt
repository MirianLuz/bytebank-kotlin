fun testaCotasDiferentes() {
    val contaCorrente = ContaCorrente("Alex", 1000)
    val contaPoupanca = ContaPoupanca("Fran", 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo conta poupança: ${contaPoupanca.saldo}")
    println("Saldo conta corrente: ${contaCorrente.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo após saque conta poupança: ${contaPoupanca.saldo}")
    println("Saldo após saque conta corrente: ${contaCorrente.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo corrente após transferir conta poupança: ${contaCorrente.saldo}")
    println("Saldo poupança após transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("Saldo poupança após transferir conta poupança: ${contaPoupanca.saldo}")
    println("Saldo corrente após transferencia: ${contaCorrente.saldo}")
}
