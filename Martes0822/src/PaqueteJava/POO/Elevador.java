package PaqueteJava.poo;
/**
 * Clase Elevador
 * tiene 2 atributos
 * tiene 4 metodos
 * recibe el peso maximo y la capacidad maxima
 * @author Admin
 */
public class Elevador {
   // Defino los atributos de la clase
    
    // public int pesoMaximo=400;
    public int pesoMaximo;
    // public int capacidadMaxPersona=5;
    /**
     * Capacidad de persona
     */
    public int capacidadMaxPersona;
    // Metodo constructor
    // es un metodo especial que inicializa los atributos
    // No de vuelve nada. Se llama igual que el nombre de la clase
   public Elevador(){
       
   }
    
    public Elevador(int cmax,int pmax){
        // asigno Peso Maximo en el metodo constructor
        pesoMaximo=pmax;
        // asigno Capacidad Maxima
        capacidadMaxPersona=cmax;
    }
    
    // DEfinir los metodos
    public void abrirPuertas(){
        System.out.println("Estoy abriendo puertas");
    }
    public void cerrarPuertas(){
        System.out.println("Estoy cerrando puertas");
    }
    public int subirPiso(int pisoAnterior){
       // variable auxiliar llamada valor
       int valor=pisoAnterior+1;
       return valor;
    }
    public int bajarPiso(int pisoAnterior){
        int valor=pisoAnterior-1;
        // return valor;
        return (pisoAnterior-1);
    }
    
}
