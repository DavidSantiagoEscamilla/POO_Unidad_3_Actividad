package Sistema_de_Operaciones_Bancarias;

public class ServicioTransferencias implements Transferencias {
    @Override
    public void transferirFondos(String cuentaDestino, double monto) {
        System.out.println("Transferencia de $" + monto + " a la cuenta: " + cuentaDestino);
    }
}