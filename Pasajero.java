public class Pasajero {

    private String nombre;

    private int numeroPasaporte;

    private int edad;

    private String preferenciasAlimenticias;

    public void pasajero(String nombre, int numeroPasaporte, int edad, String preferenciasAlimenticias){
        this.nombre = nombre;
        this.numeroPasaporte = numeroPasaporte;
        this.edad = edad;
        this.preferenciasAlimenticias = preferenciasAlimenticias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(int numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPreferenciasAlimenticias() {
        return preferenciasAlimenticias;
    }

    public void setPreferenciasAlimenticias(String preferenciasAlimenticias) {
        this.preferenciasAlimenticias = preferenciasAlimenticias;
    }
}