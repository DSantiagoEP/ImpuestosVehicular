/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestosvehicular;

import java.util.*;

public class ListaVehiculos extends Vehiculo{

private ArrayList <Vehiculo> listaVehiculos;

  public ListaVehiculos (){
      
       listaVehiculos= new ArrayList <Vehiculo> ();
}

       public void addVehiculo (Vehiculo vehículo) {

       listaVehiculos.add(vehículo); 
}

public void listar (){
       System.out.println ("Se muestra los datos de los vehículos");

 for (Vehiculo tmp: listaVehiculos){

      tmp.mostrarDatos();

}
}
}