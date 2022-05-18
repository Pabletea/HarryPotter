import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonajeTest {


    Ejercicio5 ej = new Ejercicio5();

    @Test
    public void test1(){
        // TODO Haz una función que te devuelva un array compuesto por:
        //  Personajes que tienen imagen asociada.
        // tip: ej.personajes.obtenerTodos()[0].getImage()
        // TODO comprueba que tu función devuelve el número correcto de elementos
        // tip: es 25
        int out_esperado =25;
        int out_actual=ej.personajesConImagen().length;
        Assertions.assertEquals(out_esperado,out_actual);
        System.out.println("Test imagen realizado");
    }


    @Test
    public void test2(){
        // TODO Comprueba que la función: obtenerPotters()
        //  nos devuelve una lista de 6 elementos
        // tip: ej.personajes.obtenerPotters()
        int out_esperado=6;
        int out_real=ej.personajes.obtenerPotters().length;
        Assertions.assertEquals(out_esperado,out_esperado);
        System.out.println("Test potters realizado");
    }

}
