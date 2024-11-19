package Sistema_de_Operaciones_Bancarias;

public class Main {
    public static void main(String[] args) {
        Transferencias servicioTransferencias = new ServicioTransferencias();
        Retiros servicioRetiros = new ServicioRetiros();
        PagoFacturas servicioPagos = new ServicioPagos();


        System.out.println("Realizando transferencia:");
        servicioTransferencias.transferirFondos("Cuenta123456", 50000.00);

        System.out.println("\nRealizando retiro:");
        servicioRetiros.retirarEfectivo(300000.00);

        System.out.println("\nRealizando pago de factura:");
        servicioPagos.pagarFactura("Empresa de Agua", 87000.00);
    }
    
    // "\n" SalvaVidas y organiza Consola jejeje
}