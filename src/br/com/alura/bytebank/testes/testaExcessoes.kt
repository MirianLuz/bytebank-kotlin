package br.com.alura.bytebank.testes

import br.com.alura.bytebank.modelos.Endereco
import java.lang.ClassCastException

fun testaExcessoes() {

    println("início main")
    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    try{
        for (i in 1..5) {
            val endereco = Any()
            endereco as Endereco

            println(i)
        }
    }catch(e: ClassCastException){
        e.printStackTrace()
        println("ClassCastException encontrada")
    }
    println("fim funcao2")
}

fun testaExcessoesDois() {

    println("início main")
    funcao3()
    println("fim main")
}

fun funcao3() {
    println("início funcao3")
    try {
        funcao4()
    }catch(e: ClassCastException){
        e.printStackTrace()
        println("ClassCastException foi pegada")
    }
    println("fim funcao3")
}

fun funcao4() {
    println("início funcao4")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        throw ClassCastException()
    }

    println("fim funcao4")


    println("fim main")
}