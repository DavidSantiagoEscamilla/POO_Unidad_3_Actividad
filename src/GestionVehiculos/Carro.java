package GestionVehiculos;

public class Carro implements Conductor{
    @Override
    public void conducir() {
        System.out.println("El carro está en movimiento.");
    }

}
