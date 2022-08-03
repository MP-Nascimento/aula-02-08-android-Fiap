/**
 * Esse codigo mostra os comandos basicos de print(Imprimir)
 * Como por exemplo (println) que diferente do (print normal) ele pula a linha 
 * Logo em seguida temos o (\n) que quebra a linha em duas
 * Temos tambem o exempo do (\t) ele coloca uma tabulação
 * E por ultimo temos o (Pair) que concatena tudo que está dentro dele independente da tipagem do valor 
 */
fun main() {
    println("Hello, world!!!")
    println("Este texto \"quebra \" em \nduas linhas")
    println("Nota:\t 10")
    
    val (endereco, numero) = Pair("Paulista", 1162)
    println(endereco)
    println(numero)
}