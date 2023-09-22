// [Template Base no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val idade: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String,val nivel: Nivel ,val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    //Método
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
      
    println("${usuario.nome} está na $nome Nível: $nivel estudando : \n $conteudos")
    }
   
}

fun main() {
    //add conteúdo educacional Kotlin
   val conteudoBasico = listOf(ConteudoEducacional("Kotlin e Sua Documentação",1),
                               ConteudoEducacional("Introdução Prática",2),
                               ConteudoEducacional("Controle de Fluxo e Coleções",2),
                               ConteudoEducacional("OO e Tipos de Classes",2),
                               ConteudoEducacional("O Poder das Funções",2),
                               ConteudoEducacional("Tratamento de Exceções",2))

   val conteudoIntermediario = listOf(ConteudoEducacional("Mercado de Desenvolvimento",1),
                               		 ConteudoEducacional("Instalando e configurando uma IDE",2),
                               		 ConteudoEducacional("Entendendo a Estrutura e Depurando Apps Android",2),
                               		 ConteudoEducacional("Interface de Usuário e Layouts Android",2),
                               		 ConteudoEducacional("Manipulando Entradas do Usuário em Apps Android",3),
                               		 ConteudoEducacional("Rede em Apps Android com Kotlin",2),
                                     ConteudoEducacional("Armazenamento de Dados Essenciais",3))

   val conteudoAvancado = listOf(ConteudoEducacional("Visão Geral Sobre o Android Jetpack",1),
                               	 ConteudoEducacional("Material Desing",2),
                                 ConteudoEducacional("Fluxo de Navegação de Apps Android",2),
                               	 ConteudoEducacional("Fluxo de Vida Android ViewModel, LiveData e Coroutines",4),
                               	 ConteudoEducacional("Persistencia de Dados no Android Com Room",3),
                               	 ConteudoEducacional("Jetpack Compose",2))

   //add Formação
   val formacaoBasica = Formacao("Formação Básica",Nivel.BASICO,conteudoBasico)
   val formacaoIntermediaria = Formacao("Formação Intermediária",Nivel.INTERMEDIARIO,conteudoIntermediario )
   val formacaoAvancada = Formacao("Formação Avançada",Nivel.AVANCADO,conteudoAvancado )
   
   //add Usuários
   val user1 = Usuario("Yuji Itadori",15)
   val user2 = Usuario("Megume Fushiguro",16)
   val user3 = Usuario("Saturo Gojo",28)
   val user4 = Usuario("Kento Nanami",27)
   val user5 = Usuario("Suguro Geto",27)
   
   //add Formação
   formacaoBasica.matricular(user1)
   formacaoIntermediaria.matricular(user2)
   formacaoAvancada.matricular(user3)
   formacaoAvancada.matricular(user4)
   formacaoAvancada.matricular(user5)
   
}
