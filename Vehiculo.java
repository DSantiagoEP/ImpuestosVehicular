
package impuestosvehicular;

public class Vehiculo {
    
    private String marca;
    private String linea;
    private int modelo;
    
    public Vehiculo (){
        
        marca="";
        linea="";
        modelo=0;   
    
    }
    
    public Vehiculo (String marca, String linea, int modelo){
        
        this.marca=marca;
        this.linea=linea;
        this.modelo=modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getLinea() {
        return linea;
    }

    public int getModelo() {
        return modelo;
    }
    
    public void mostrarDatos(){
        System.out.println("Datos del vehiculo: "
        +getMarca()+" "+getLinea()+"Sacado en el año: "
        +getLinea());
    }
}
