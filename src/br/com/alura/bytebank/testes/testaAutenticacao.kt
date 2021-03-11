import br.com.alura.bytebank.modelos.*

fun testaAutenticacao() {
    val gerente = Gerente(
        "Alex",
        "111.111.111-11",
        1000.0,
        1234
    )

    val diretora = Diretor(
        "Fran",
        "222.222.222-22",
        2000.0,
        4321,
        200.0
    )

    val cliente = Cliente(
        nome = "Jose",
        cpf = "333.333.333-33",
        senha = 2,
        endereco = Endereco(
            logradouro = "Rua Vergueiros"
        )
    )

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(diretora, 4321)
    sistemaInterno.entra(gerente, 1234)
    sistemaInterno.entra(cliente, 5678)
}
