package br.com.alura.bytebank.modelos

import br.com.alura.bytebank.exceptions.FalhaAutenticacaoException
import br.com.alura.bytebank.exceptions.SaldoInsuficienteException
import java.lang.NumberFormatException

abstract class Conta(
    var titular: Cliente,
    val numeroConta: Int
) : Autenticavel{
    var saldo = 0.0
        protected set

    companion object {
        var totalContas = 0
            private set
    }

    init {
        println("Criando conta")
        totalContas++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "Saldo insuficiente. Saldo atual: $saldo")
        }
        if(!autentica(senha)){
            throw FalhaAutenticacaoException(mensagem = "Falha na autenticacao")
        }
        throw NumberFormatException()

        saldo -= valor
        destino.deposita(valor)

    }
}

