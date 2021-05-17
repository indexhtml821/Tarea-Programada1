import java.util.*;
public class Jugador {
    private String nombre;
    private int puntos;
    private String[] eleccion;
    int capacidad;
    int numeracion;
    

    public Jugador(String nombre ) {
       
        this.nombre = nombre;
        this.puntos = 0;
        eleccion = new String [10];
        
    }
    public Jugador(int capacidad){
    this.capacidad = capacidad;
   eleccion = new String [capacidad];
        
    }
    public int getCount(){
        return numeracion;
    }
    //Para obtener la referencia donde está el arreglo por completo
    public String[] getPersons()
    {
        return eleccion;
    }

    //Para obtener la referencia de X objeto de tipo String del mismo arreglo
    public String getPerson(int index)
    {
        return eleccion[index];
    }

    //Inserta una referencia de un objeto de tipo String en el arreglo
    public void add(String refPerson)
    {
        ++numeracion;
        if(numeracion > capacidad)
        {
            capacidad += 10;
            eleccion = Arrays.copyOf(eleccion, capacidad);
        }
        eleccion[numeracion - 1] = refPerson;
    }


    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setNombre() {

    }

    public void setPuntos(int puntos) {
        this.puntos += puntos;
    }

   
}
