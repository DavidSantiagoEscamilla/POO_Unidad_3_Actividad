package Sistema_de_Mantenimiento;

public class Main {
    public static void main(String[] args) {
        Reparacion equipoReparacion = new EquipoReparacion();
        Limpieza equipoLimpieza = new EquipoLimpieza();

        equipoReparacion.realizarReparacion();
        equipoLimpieza.realizarLimpieza();
    }
}