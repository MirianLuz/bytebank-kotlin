package br.com.alura.bytebank.exceptions

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticacao"
) : Exception(mensagem)