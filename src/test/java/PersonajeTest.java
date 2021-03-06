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
        int out_esperado=25;
        int out_actual=ej.personajes.obtenerPersonajesConImagen().length;
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


    @Test
    public void test3(){
        // TODO Crea una función que cuente a todos los personajes que forman parte del staff de Howarts y que están vivos
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos
        int out_esperado=17;
        int out_actual= ej.contarStaff();
        Assertions.assertEquals(out_esperado,out_actual);
        System.out.println("Test Staff realizado");


    }

    @Test
    public void test4(){
        // TODO Crea una función que cuente a todos los personajes que forman parte del staff de Howarts y que están muertos
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos
        int out_esperado=8;
        int out_actual= ej.contarStaffMuertos();
        Assertions.assertEquals(out_esperado,out_actual);
        System.out.println("Test Staff muertos realizado");

    }

    @Test
    public void test5(){
        // TODO Crea una función que reciba una letra (char) y cuente todos personajes tienen esa letra en su nombre
        //
        // TODO comprueba que tu función devuelve el número correcto de elementos
        int out_esperado=245;
        int out_actual=ej.contarNombreLetra('a');
        Assertions.assertEquals(out_esperado,out_actual);
        System.out.println("Test letra realizado");

    }

    @Test
    public void test6(){
        // TODO Crea una función que reciba un string y devuelva una lista con todos los personajes que tienen ese string
        //  en su nombre y están vivos
        //
        // TODO comprueba que tu función devuelve el número correcto de elemento

        Integer out_esperado=3;
        Integer out_real=ej.personajeConString("Potter").length;
        Assertions.assertEquals(out_esperado,out_real);
        System.out.println("Test String realizado");



        }



    @Test
    public void test7(){
        // TODO Crea una función que reciba un string y devuelva una lista con todos los personajes que su actor se llama
        //  exactamente como el string recibido

        // TODO comprueba que tu función devuelve el número correcto de elementos

        Integer out_esperado=1;
        Integer out_real=ej.personajeNombreActor("Luke").length;
        Assertions.assertEquals(out_esperado,out_real);
        System.out.println("Test String realizado");


    }
}
