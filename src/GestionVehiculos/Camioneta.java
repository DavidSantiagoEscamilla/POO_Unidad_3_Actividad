package GestionVehiculos;

public class Camioneta implements Conductor, CargaVehiculo {
    @Override
    public void conducir() {
        System.out.println("La camioneta está en movimiento.");
    }

    @Override
    public void cargarMercancia(double peso) {
        System.out.println("Cargando " + peso + " kg de mercancía en la camioneta.");
    }
}
