package GestionVehiculos;

public class Camion implements CargaVehiculo {
    @Override
    public void cargarMercancia(double peso) {
        System.out.println("Cargando " + peso + " kg de mercancía en el camión.");
    }
}
