package Sistema_de_Mantenimiento;

public class EquipoReparacion implements Reparacion {
    @Override
    public void realizarReparacion() {
        System.out.println("Reparando equipo...");
    }

    @Override
    public void realizarLimpieza() {
        
        throw new UnsupportedOperationException("Operación no soportada");
    }
}
