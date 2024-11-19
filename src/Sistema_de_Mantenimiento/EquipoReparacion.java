package Sistema_de_Mantenimiento;

public class EquipoReparacion implements Reparacion {
    @Override
    public void realizarReparacion() {
        System.out.println("Reparando equipo...");
    }
}
