public class Ejercicio5 {

    public Personajes personajes;

    public Ejercicio5() {
        personajes = new Personajes(ObtenerPersonajesRequest.Companion.get());
    }

    // TODO Haz una función que te devuelva un array compuesto por:
    //  Personajes que tienen imagen asociada.

    public Personaje[] personajesConImagen() {
            Personaje[] out =  personajes.obtenerTodos();
            int i=0;
            for(Personaje p : personajes.obtenerTodos()){
                if(!p.getImage().isEmpty()){
                    out[i] = p;
                    i++;
                }

            }
        Personaje[] out2 = new Personaje[i];

        i = 0;

        for (Personaje p : out) {
            if (p != null) {
                out2[i] = p;
                i++;

            }
        }


            return out2;
    }

}
