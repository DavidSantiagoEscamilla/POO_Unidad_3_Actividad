package GestionVehiculos;

public class Main {
    public static void main(String[] args) {
        Conductor carro = new Carro();
        carro.conducir();

        CargaVehiculo camion = new Camion();
        camion.cargarMercancia(20000);

        Camioneta camioneta = new Camioneta();
        camioneta.conducir();
        camioneta.cargarMercancia(1300);
    }
}
