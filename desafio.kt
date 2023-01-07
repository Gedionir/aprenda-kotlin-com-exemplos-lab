// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }



class Usuario(val nome: String, val email: String, val senha: String, val nivelConhecimento: Nivel)



data class ConteudoEducacional(var nome: String, val duracao: Int = 90)



data class Formacao(val nome: String, val nivelDificuldade: Nivel, var conteudos: List<ConteudoEducacional>) {

  val inscritos = mutableListOf<Usuario>()

   

  fun matricular(usuario: Usuario) {

    //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")

    inscritos.add(usuario)

     

  }

   

  fun getInscritosOrdenadosPorNivelConhecimento(): List<Usuario> {

    return inscritos.sortedBy { it.nivelConhecimento }

  }

  fun usuarioEstaInscrito(usuario: Usuario): Boolean {

  return usuario in inscritos

   

}



}

fun main() {

   

   

//  TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")

  val usuario1 = Usuario("Gustavo", "gustavo@email.com", "senha102", Nivel.INTERMEDIARIO)

  val usuario2 = Usuario("Aline", "aline@email.com", "senha304", Nivel.AVANÇADO)

  val usuario3 = Usuario("Mario", "mario@email.com", "senha506", Nivel.BASICO)



   

//  TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

  val conteudo1 = ConteudoEducacional("Introdução à programação")

  val conteudo2 = ConteudoEducacional("Estruturas de dados", 90)

  val conteudo3 = ConteudoEducacional("Algoritmos de ordenação")

   

  val formacao1 = Formacao("$conteudo1", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2, conteudo3))

   

  formacao1.matricular(usuario1)

  formacao1.matricular(usuario2)

  formacao1.matricular(usuario3)

  

  println("Usuários inscritos no ${formacao1.nome}:")

  

    

  }

   

}

