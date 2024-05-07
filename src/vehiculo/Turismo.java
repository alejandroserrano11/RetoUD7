package vehiculo;
public abstract class Turismo extends Vehiculo {

    // atributos

    private Asientos tiposAsiento;

    // constructor

    public Turismo(String marca, String modelo, String bastidor, int puertas, Asientos tipoAsiento) {
        super(marca, modelo, bastidor, puertas);
        this.tiposAsiento = tipoAsiento;
    }

    // getters y setters

    public Asientos getTiposAsiento() {
        return tiposAsiento;
    }

    public void setTiposAsiento(Asientos tiposAsiento) {
        this.tiposAsiento = tiposAsiento;
    }

    @Override
    public String toString() {
        return super.toString() + "; TipoAsiento: " + tiposAsiento;
    }

    public abstract double calcularPrecioAlquiler(int numDias);
    public abstract int getMaxVelocidad();

    
    
}
