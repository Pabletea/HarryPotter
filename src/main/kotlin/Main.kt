import com.google.gson.Gson

var gson = Gson()

fun main() {
    val ej5 = Ejercicio5()
    ej5.personajes.obtenerTodos().forEach { println(it) }
    println(ej5.personajes.obtenerPersonajesConImagen().size)
    println("Staff");
    println(ej5.contarStaffMuertos());
    println("Staff muertos");
    println(ej5.contarStaffMuertos());
    println("Contienen una letra en concreto");
    println(ej5.contarNombreLetra('a'));
    println("Personajes con un string en el nombre");
    println(ej5.personajeConString("Potter"));
    println("Personajes con un nombre de actor");
    println(ej5.personajeNombreActor("Luke"));


}

