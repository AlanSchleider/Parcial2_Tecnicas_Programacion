import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Reserva resrvavuelos = new Reserva();

//numero de pasaporte es un serial de 6 digitos
        Vuelos Rusia = new Vuelos("Rusia", "MercedesBenzAirlines", 19"años", "Ensalada cesar" );
        resrvavuelos.registrarvuelo(Rusia);
        Vuelos KoreaDelSur = new Vuelos("Korea del sur", "Traveling", 65"años", "vino añejo");
        resrvavuelos.registrarvuelo(KoreaDelSur);
        Vuelos suiza = new Vuelos("suiza", "Avianca", 32"años", "agua con gas");
        resrvavuelos.registrarvuelo(suiza);
        Vuelos Londres = new Vuelos("Londres", "Avianca", 31"años", "nada");
        resrvavuelos.registrarvuelo(Londres);
        Vuelos Roma = new Vuelos("Roma", "Traveling", 44"años", "tacos al pastor");
        resrvavuelos.registrarvuelo(Roma);
    }
}