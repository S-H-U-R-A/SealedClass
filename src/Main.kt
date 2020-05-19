/**
 * Las sealed class son enums de Java con super poderes
 * Esto que quiere decir: que una sealed class a diferencia de los enumerados podemos
 * definir diferentes objetos del mismo tipo
 */
/

fun main(args: Array<String>) {

    /*val inte: Intencion = Intencion.Refrescar()

    val output = when(inte){
        is Intencion.Refrescar      -> "Refrescar"
        is Intencion.RecargarMas    -> "Recargar Mas"
    }

    println(output)*/

    val inte:Intencion =  Intencion.Error("Me quede sin Internet")

    val output = when(inte){
        is Intencion.CargarMasDatos     -> "Carga mas datos"
        is Intencion.Recargar           -> "Recargar Datos"
        is Intencion.Error              -> "Error"
    }

    inte.log()

    println(output)

}