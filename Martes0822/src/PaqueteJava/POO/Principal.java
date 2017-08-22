
package PaqueteJava.poo;

/**
 *
 * @author Admin
 */
public class Principal {
    // psvm+tab escribe la linea del main
    public static void main(String[] args) {
        System.out.println("****Soy la clase principal******");
        System.out.println("--------------------------------");
        
        // Voy a crear un objeto
        // Sintaxis de crear un objeto
        // <nombredelaClase> <nombreDelObjeto> = new <metodoConstructor>
//        Elevador elevadorChico = new Elevador(5,400);
//        
//        // accedo a los atributos
//        System.out.println("Capacidad del elevador chico:"
//                +elevadorChico.capacidadMaxPersona);
//        System.out.println("Peso maximo elevador chico:"
//                +elevadorChico.pesoMaximo);
//        elevadorChico.cerrarPuertas();
//        elevadorChico.abrirPuertas();
//        System.out.println(elevadorChico.subirPiso(4));
//        System.out.println("Voy a bajar al piso:"+
//                elevadorChico.bajarPiso(4));
//        Elevador elevadorGrande = new Elevador(10,800);
//        System.out.println("Capacidad max de elevador grande:"
//                +elevadorGrande.capacidadMaxPersona);
//        System.out.println("Peso maximo elevador grande:"+
//                elevadorGrande.pesoMaximo);
//        
//        Elevador elevadorPrueba = new Elevador();
//        System.out.println("Capacidad max de elevador prueba:"
//                +elevadorPrueba.capacidadMaxPersona);
//        System.out.println("Peso maximo elevador prueba:"+
//                elevadorPrueba.pesoMaximo);

        Persona Alumno = new Persona();
        Alumno.obtener();
        if (Alumno.esMayor()) {
            System.out.println(Alumno.getNombre() + " es mayor de edad.\n Su edad es " + Alumno.edad);
        }else {
            System.out.println(Alumno.getNombre() + " es menor de edad.\n Su edad es " + Alumno.edad);
        }
        
        Persona Alumno2 = new Persona();
        Alumno2.obtener();
        if (Alumno2.esMayor()) {
            System.out.println(Alumno2.getNombre() + " es mayor de edad.\n Su edad es " + Alumno2.edad);
        }else {
            System.out.println(Alumno2.getNombre() + " es menor de edad.\n Su edad es " + Alumno2.edad);
        }
        
        Persona Alumno3 = new Persona();
        Alumno3.obtener();
        if (Alumno3.esMayor()) {
            System.out.println(Alumno3.getNombre() + " es mayor de edad.\n Su edad es " + Alumno3.edad);
        }else {
            System.out.println(Alumno3.getNombre() + " es menor de edad.\n Su edad es " + Alumno3.edad);
        }
    }
}
