/**
 * Esse codigo mostra como usamos e manipulamos Funções e os  tipos de  encapsulammento delas  como declaramos e chamamos
 */

fun novaFuncao(){
    println("Oi , tudo bem?")
}
private fun novaFuncao2(nome:String){
    println("Oi, $nome")
}

fun main() {
   novaFuncao()
   novaFuncao2("Daniel")
}