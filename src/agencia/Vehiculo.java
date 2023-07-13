package agencia;

public class Vehiculo {
String Placa ;
String  Modelo;
boolean	Extras;
float	PrecioVehiculo;
String	Color;

    public Vehiculo() {
    }

    public Vehiculo(String Placa, String Modelo, boolean Extras, float PrecioVehiculo, String Color) {
        this.Placa = Placa;
        this.Modelo = Modelo;
        this.Extras = Extras;
        this.PrecioVehiculo = PrecioVehiculo;
        this.Color = Color;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public boolean isExtras() {
        return Extras;
    }

    public void setExtras(boolean Extras) {
        this.Extras = Extras;
    }

    public float getPrecioVehiculo() {
        return PrecioVehiculo;
    }

    public void setPrecioVehiculo(float PrecioVehiculo) {
        this.PrecioVehiculo = PrecioVehiculo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

}
