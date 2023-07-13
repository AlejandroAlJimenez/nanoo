package agencia;

import javax.swing.JOptionPane;

public class VentaVehiculos {
    public void venta(Vehiculo matCarros[][]){
        for(int fila=0; fila<matCarros.length;fila++){
            for(int col=0; col<matCarros[fila].length;col++){
                matCarros[fila][col]= new Vehiculo();
                matCarros[fila][col].setPlaca(JOptionPane.showInputDialog("Digite la placa"));
                matCarros[fila][col].setModelo(JOptionPane.showInputDialog("Digite el modelo"));
                matCarros[fila][col].setColor(JOptionPane.showInputDialog("Digite el color"));
                matCarros[fila][col].setPrecioVehiculo(Float.parseFloat(JOptionPane.showInputDialog("Digite el precio")));
                byte extra=Byte.parseByte(JOptionPane.showInputDialog("1.Extra\n2.Sin Extra\nDigite su opción"));
                    if(extra==1)
                        matCarros[fila][col].setExtras(true);
                    else
                        matCarros[fila][col].setExtras(false);
            }
        }
    }
    
    public void imprimeVenta(Vehiculo matCarros[][]){
        for(int fila=0; fila<matCarros.length;fila++){
            for(int col=0; col<matCarros[fila].length;col++){
                System.out.println("Placa "+matCarros[fila][col].getPlaca());
                System.out.println("Modelo "+matCarros[fila][col].getModelo());
                System.out.println("Precio "+matCarros[fila][col].getPrecioVehiculo());
                System.out.println("Color "+matCarros[fila][col].getColor());
                if(matCarros[fila][col].isExtras()==true)
                    System.out.println("Tine extras");
                else
                    System.out.println("NO Tine extras");
            }
        }
    }
    
    public void imprimeExtra(Vehiculo matCarros[][]){
        System.out.println("Autos que tienen Extras");
        for(int fila=0; fila<matCarros.length;fila++){
            for(int col=0; col<matCarros[fila].length;col++){
                if(matCarros[fila][col].isExtras()==true){
                    System.out.println("Placa "+matCarros[fila][col].getPlaca());
                    System.out.println("Modelo "+matCarros[fila][col].getModelo());
                }
            }
        }
    }
    
    public void imprimePrecioMayor(Vehiculo matCarros[][]){
        for(int fila=0; fila<matCarros.length;fila++){
            for(int col=0; col<matCarros[fila].length;col++){
                if(matCarros[fila][col].getPrecioVehiculo()<=25000000){
                    System.out.println("Placa "+matCarros[fila][col].getPlaca());
                    System.out.println("Modelo "+matCarros[fila][col].getModelo());
                }
            }
        }
        
    }
    
    public void imprimeColorV(Vehiculo matCarros[][]){
        for(int fila=0; fila<matCarros.length;fila++){
            for(int col=0; col<matCarros[fila].length;col++){
                if(matCarros[fila][col].getColor()=="Verde"||matCarros[fila][col].getColor()=="verde"){
                    System.out.println("Placa "+matCarros[fila][col].getPlaca());
                    System.out.println("Modelo "+matCarros[fila][col].getModelo());
                }
            }
        }   
    }
    
    public void imprimeVehiculoM(Vehiculo matCarros[][]){
        System.out.println("Auto mas caro");
        float precio=matCarros[0][0].getPrecioVehiculo();
        int i=0, j=0;
        for(int fila=0; fila<matCarros.length;fila++){
            for(int col=0; col<matCarros[fila].length;col++){
                if(matCarros[fila][col].getPrecioVehiculo()>precio){
                    precio=matCarros[fila][col].getPrecioVehiculo();
                    i=fila;
                    j=col;
                }
            }
        }
        System.out.println("Placa "+matCarros[i][j].getPlaca());
        System.out.println("Modelo "+matCarros[i][j].getModelo());
    }
    
}
