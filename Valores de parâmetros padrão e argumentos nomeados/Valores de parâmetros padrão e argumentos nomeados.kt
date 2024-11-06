fun printMessage(message: String): Unit {                               // 1
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

fun multiply(x: Int, y: Int) = x * y                                    // 4

fun main() {
    printMessage("Hello")                                               // 5
    printMessageWithPrefix("Hello", "Log")               // 6
    printMessageWithPrefix("Hello")                            // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello")          // 8
    println(sum(1, 2))                                           // 9
    println(multiply(2, 4))                                     // 10
}

// 1.Uma função simples que recebe um parâmetro do tipo String e retorna Unit (ou seja, nenhum valor de retorno).
// 2.Uma função que recebe um segundo parâmetro opcional com valor padrão Info.
// 3.O tipo de retorno é omitido, o que significa que é, na verdade, Unit.
// 4.Uma função que retorna um inteiro.
// 5.Uma função de expressão única que retorna um inteiro (inferido).
// 6.Chama a primeira função com o argumento Hello.
// 7.Chama a função com dois parâmetros, passando valores para ambos.
// 8.Chama a mesma função omitindo o segundo. O valor padrão Info é usado.
// 9.Chama a mesma função usando argumentos nomeados e alterando a ordem dos argumentos. Imprime o resultado da chamada da função sum.
// 10.Imprime o resultado da chamada da função multiply.