package agencia;

import javax.swing.JOptionPane;
 
public class Agencia {
    public void menu(){
        byte opc=1;
        VentaVehiculos obj = new VentaVehiculos();
        Vehiculo matCarros[][]=new Vehiculo[1][1];
        while(opc>=1&&opc<6){
         opc=Byte.parseByte(JOptionPane.showInputDialog("1.Realizar ventas\n2.Imprime ventas\n3.vehículos que tienen extras\n4.vehículos cuyo precio supera los 25 millones \n5.vehículos que tienen vehículos verdes\n6.Ahuto con el precio Mayor\n7.Salir\nDigite su opción"));
        switch(opc){
            case 1: obj.venta(matCarros);
            break;
            case 2: obj.imprimeVenta(matCarros);
            break;
            case 3: obj.imprimeExtra(matCarros);
            break;
            case 4: obj.imprimePrecioMayor(matCarros);
            break;
            case 5: obj.imprimeColorV(matCarros);
            break;
            case 6: obj.imprimeVehiculoM(matCarros);
            break;
            default: System.out.println("Saliendo....");
        }
      }
    }

    public static void main(String[] args) {
        Agencia objAgencia=new Agencia();
        objAgencia.menu();
       
        
    }
    
}
