package paquete1;

public class test {

    public static void main(String[] args) {
// Creo un objeto de MiSuperClase
        MiSuperClase superr = new MiSuperClase();
        superr.mostrar();
        //doy valor a los atributos
        superr.setVarCad("uno");
        superr.setVarEnt(1);
        superr.mostrar();
        System.out.println("-------------------------");
        // Creo un objeto de la clase hija
        SubClase subb=new SubClase();
        subb.mostrarSub();
        //doy valor al atributo
        subb.setVarCadSub("trestres");
        subb.mostrarSub();
        subb.setVarCad("dos");
        subb.setVarEnt(2);
        subb.mostrar();
        System.out.println("-------------------");
        subb.mostrarTodo();
        System.out.println("-------------------");
        MiSuperClase superr1=new MiSuperClase(4,"cuatro");
        superr1.mostrar();
        System.out.println("-------------------");
        SubClase subb1=new SubClase(5,"cinco","cincocinco");
        subb1.mostrarTodo();
        System.out.println("-------------------");
        System.out.println(subb1.toString());
        System.out.println(subb.toString());
        System.out.println(superr1.toString());
    }
}
