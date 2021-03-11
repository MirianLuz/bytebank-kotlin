fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("br.com.alura.bytebank.modelos.Conta é positiva")
    } else if (saldo == 0.0) {
        println("br.com.alura.bytebank.modelos.Conta é neutra")
    } else {
        println("br.com.alura.bytebank.modelos.Conta é negativa")
    }

    when {
        saldo > 0 -> println("br.com.alura.bytebank.modelos.Conta é positiva")
        saldo == 0.0 -> println("br.com.alura.bytebank.modelos.Conta é neutra")
        else -> println("br.com.alura.bytebank.modelos.Conta é negativa")
    }
}