import br.com.alura.bytebank.exceptions.FalhaAutenticacaoException
import br.com.alura.bytebank.exceptions.SaldoInsuficienteException
import br.com.alura.bytebank.modelos.Cliente
import br.com.alura.bytebank.modelos.ContaCorrente
import br.com.alura.bytebank.modelos.ContaPoupanca
import br.com.alura.bytebank.modelos.Endereco

fun testaComportamentosConta() {
    val contaFran = ContaPoupanca(
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
    contaFran.deposita(300.0)

    val contaAlex = ContaCorrente(
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
    try{
        contaFran.transfere(250.0, contaAlex, 2)
        println("Transferencia sucedida")
    } catch(e: SaldoInsuficienteException) {
        println("Saldo insuficiente")
            e.printStackTrace()
    }catch(e: FalhaAutenticacaoException){
        println("Falha na autenticação")
        e.printStackTrace()
    }catch(e: Exception){
        println("Erro desconhecido")
    }
    println(contaAlex.saldo)
    println(contaFran.saldo)
}