package paquete1;

public class SubClase extends MiSuperClase {

    private String varCadSub;

    public String getVarCadSub() {
        return varCadSub;
    }

    public void setVarCadSub(String varCadSub) {
        this.varCadSub = varCadSub;
    }

    public void mostrarSub() {
        System.out.println("Soy un metodo de la clase hija");
        System.out.println("varCadSub=" + varCadSub);
    }

    public void mostrarTodo() {
        System.out.println("Soy un metodo de la clase hija");
        System.out.println("Voy a mostrar TODAS las variables");
        System.out.println("varCadSub=" + varCadSub);
        super.mostrar();
    }

    // Metodo constructor
    public SubClase(int varEnt, String varCad, String varCadSub) {
        super(varEnt, varCad);
        this.varCadSub = varCadSub;
    }

    public SubClase() {

    }

    @Override
    public String toString() {
//        return "varCad="+varCad+" varEnt="+varEnt
//                +" varCadSub="+varCadSub;
        return super.toString() + " varCadSub=" + varCadSub;

    }
}
