sealed class Intencion {
    /*class Refrescar:Intencion()
    class RecargarMas:Intencion()*/

    object  Recargar: Intencion(){
        override fun log(){
            println("Refrescando")
        }
    }

    object CargarMasDatos: Intencion(){
        override fun log() {
            println("Cargar mas datos")
        }
    }

    data class Error(val razon: String): Intencion(){
        override fun log() {
            println("$razon")
        }
    }

    abstract  fun log()

}