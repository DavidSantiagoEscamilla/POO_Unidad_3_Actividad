package Sistema_de_Operaciones_Bancarias;

public class ServicioPagos implements PagoFacturas {
    @Override
    public void pagarFactura(String proveedor, double monto) {
        System.out.println("Pagando $" + monto + " a " + proveedor);
    }
}
