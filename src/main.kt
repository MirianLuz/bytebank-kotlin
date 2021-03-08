fun main() {
    println("Seja Bem Vindo ao ByteBank")

    val alex = Funcionario(
        "Alex",
        "111.111.111-11",
        1000.0,

    )

    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salario: ${alex.salario}")
    println("bonificação: ${alex.bonificacao()}")

    val fran = Gerente(
        "Fran",
        "222.222.222-22",
        2000.0,
        12345
    )

    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salario: ${fran.salario}")
    println("bonificação: ${fran.bonificacao()}")

    if(fran.autentica(12345)){
        println("Autenticado com sucesso")
    }else{
        println("Erro na autenticacao")
    }

    val gui = Diretor(
        "Gui",
        "333.333.333-33",
        4000.0,
        54321,
        400.0
    )

    println("nome: ${gui.nome}")
    println("cpf: ${gui.cpf}")
    println("salario: ${gui.salario}")
    println("bonificação: ${gui.bonificacao()}")
    println("PLR: ${gui.plr}")

    if(gui.autentica(54321)){
        println("Autenticado com sucesso")
    }else{
        println("Erro na autenticacao")
    }
}





