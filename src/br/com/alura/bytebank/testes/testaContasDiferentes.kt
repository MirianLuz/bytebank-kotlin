import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.ContaCorrente
import br.com.alura.bytebank.modelos.ContaPoupanca
import br.com.alura.bytebank.modelos.Endereco

fun testaContasDiferentes() {

    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Alex",
            cpf = "111.111.111-11",
            senha = 1,
            endereco = Endereco(
                logradouro = "Rua Vergueiro"
            )
        ),
        numeroConta = 1000
    )

    println("titular ${contaCorrente.titular}")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("endereco titular ${contaCorrente.titular.endereco}")

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Fran",
            cpf = "222.222.222-22",
            senha = 2,
            endereco = Endereco(
                logradouro = "Rua Vergueiros"
            )
        ),
        numeroConta = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo conta poupança: ${contaPoupanca.saldo}")
    println("Saldo conta corrente: ${contaCorrente.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo após saque conta poupança: ${contaPoupanca.saldo}")
    println("Saldo após saque conta corrente: ${contaCorrente.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca, 1)

    println("Saldo corrente após transferir conta poupança: ${contaCorrente.saldo}")
    println("Saldo poupança após transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente, 2)

    println("Saldo poupança após transferir conta poupança: ${contaPoupanca.saldo}")
    println("Saldo corrente após transferencia: ${contaCorrente.saldo}")
}
