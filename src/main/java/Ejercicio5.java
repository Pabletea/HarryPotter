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

    public int contarStaff(){
        int cont=0;
        Personaje[] staff = personajes.obtenerTodos();
        int i=0;
        for(Personaje p:personajes.obtenerTodos()){
            if(p.getHogwartsStaff() && p.getAlive()){
                staff[i]=p;
                i++;
                cont++;
            }

        }




        return cont;
    }
    public int contarStaffMuertos(){
        int cont=0;
        Personaje[] staff = personajes.obtenerTodos();
        int i=0;
        for(Personaje p:personajes.obtenerTodos()){
            if(p.getHogwartsStaff() && !p.getAlive()){
                staff[i]=p;
                i++;
                cont++;
            }

        }




        return cont;
    }
    public int contarNombreLetra(char letra){
        int cont=0;
        int i =0;
        for(Personaje p:personajes.obtenerTodos()){
            if(p.getName().contains(Character.toString(letra)))
                cont++;

        }



        return cont;
    }
    public  Personaje[] personajeConString(String cadena){
        Personaje[] output = new Personaje[personajes.obtenerTodos().length];
        int i=0;
        for(Personaje p:personajes.obtenerTodos()){
            if(p.getName().contains(cadena) && p.getAlive()) {
                output[i] = p;
                i++;
            }
        }
        Personaje[] output2 = new Personaje[i];
        i=0;
        for(Personaje p :output){
            if(p != null){
                output2[i]=p;

            }
        }
        System.out.println(i);

        for(i=0;i<output2.length;i++){
            System.out.println(output2[i]);
        }
        return output2;

    }
    public Personaje[] personajeNombreActor(String nombre){
        Personaje[] output = new Personaje[personajes.obtenerTodos().length];
        int i=0;
        for(Personaje p :output){
            if(p.getActor().equals(nombre)){
                output[i]=p;
                i++;
            }
        }
        Personaje[] output2 = new Personaje[i];
        i=0;
        for(Personaje p :output){
            if(p != null){
                output2[i]=p;

            }
        }
        for(i=0;i<output2.length;i++){
            System.out.println(output2[i]);
        }
        return output2;



    }

}
