
public class Vuelos {

    private String numero;
    private String origen;
    private String destio;
    private int fecha;
    private int horaSalida;
    private int pasajeros;




    public void vuelos(String numero, String origen, String destino, int fecha, int horaSalida, int pasajeros) {
            this.numero = numero;
            this.origen = origen;
            this.destio = destino;
            this.fecha = fecha;
            this.horaSalida = horaSalida;
            this.pasajeros = pasajeros;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestio() {
        return destio;
    }

    public void setDestio(String destio) {
        this.destio = destio;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
}
