
package impuestosvehicular;

public class Descuentos extends ListaVehiculos{
    
    private int descuentoProntoPago;
    private int descuentoServicioPublico;
    private int descuentoTrasladoCuenta;
    
    public Descuentos(){
        descuentoProntoPago=0;
        descuentoServicioPublico=0;
        descuentoServicioPublico=0;
    }
    
    public Descuentos(int descuentoProntoPago,int descuentoServicioPublico,int descuentoTrasladoCuenta){
        
        this.descuentoProntoPago= descuentoProntoPago;
        this.descuentoServicioPublico= descuentoServicioPublico;
        this.descuentoTrasladoCuenta= descuentoTrasladoCuenta;
        }

    public int getDescuentoProntoPago() {
        return descuentoProntoPago;
    }

    public int getDescuentoServicioPublico() {
        return descuentoServicioPublico;
    }

    public int getDescuentoTrasladoCuenta() {
        return descuentoTrasladoCuenta;
    }
    
    public void mostrarDatos() {
        System.out.println("Datos de los vehiculos ");
}
}
