/**
 * Esse codigo mostra como usamos e manipulamos listas sendo elas estaticas ou mutaveis  
 */
fun main() {
   val nomes = listOf("Daniel","Domingos","Akira")
   println(nomes)
   println(nomes[2])
   val sobrenomes = mutableListOf("Silva", "Lima", "Pereira")
   println(sobrenomes)
   sobrenomes.add("Fagundes")
   println(sobrenomes)
}