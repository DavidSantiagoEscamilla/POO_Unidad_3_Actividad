package Sistema_de_Mantenimiento;

public class EquipoLimpieza implements Limpieza {
    
    @Override
    public void realizarLimpieza() {
        System.out.println("Limpieza en proceso...");
    }
}