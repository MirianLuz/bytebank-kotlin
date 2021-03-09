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
        "Jose",
        "333.333.333-33",
        5678
    )

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(diretora, 4321)
    sistemaInterno.entra(gerente, 1234)
    sistemaInterno.entra(cliente, 5678)
}
