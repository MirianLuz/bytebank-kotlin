fun testaComportamentosConta() {
    val contaFran = Conta("Fran", 1000)
    contaFran.deposita(300.0)

    val contaAlex = Conta("Alex", 1001)
    contaAlex.deposita(200.0)

    println(contaAlex.titular)
    println(contaAlex.numeroConta)
    println(contaAlex.saldo)

    println(contaFran.titular)
    println(contaFran.numeroConta)
    println(contaFran.saldo)

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando da conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("Sacando da conta da Fran")
    contaFran.saca(70.0)
    println(contaFran.saldo)

    println("Transferindo da conta da Fran para Alex")
    if (contaFran.transfere(70.0, contaAlex)) {
        println("Transferencia sucedida")
    } else {
        println("Transferencia falhou")
    }
    println(contaAlex.saldo)
    println(contaFran.saldo)
}