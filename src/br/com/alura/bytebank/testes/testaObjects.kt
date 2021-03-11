package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelos.*

fun testaObjects() {
    val fran = object : Autenticavel {
        val nome = "Fran"
        val cpf = "333.333.333-33"
        val senha = 1000

        override fun autentica(senha: Int) = this.senha == senha

    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numeroConta = 1000)
    val contaCorrente = ContaCorrente(titular = alex, numeroConta = 1001)

    println("Total de contas: ${Conta.totalContas}")
}
