package Sistema_de_Operaciones_Bancarias;

public class ServicioRetiros implements Retiros {
    @Override
    public void retirarEfectivo(double monto) {
        System.out.println("Retirando $" + monto + " en efectivo.");
    }
}
