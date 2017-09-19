package paquete1;

public class MiSuperClase {
// Atributos

    private int varEnt;
    private String varCad;

    public int getVarEnt() {
        return varEnt;
    }

    public String getVarCad() {
        return varCad;
    }

    public void setVarEnt(int varEnt) {
        this.varEnt = varEnt;
    }

    public void setVarCad(String varCad) {
        this.varCad = varCad;
    }

    public void mostrar() {
        System.out.println("Soy un metodo de la clase padre");
        System.out.println("varEnt=" + varEnt);
        System.out.println("varCad=" + varCad);
    }
// Metodo constructor
    public MiSuperClase(int varEnt,String varCad){
        this.varCad=varCad;
        this.varEnt=varEnt;
    }
    
    public MiSuperClase(){
       
    }
    
    @Override
    public String toString(){
        return "varEnt="+varEnt+" varCad="+varCad;
    }
    
}
