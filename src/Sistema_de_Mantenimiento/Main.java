package Sistema_de_Mantenimiento;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de equipos especializados
        Reparacion equipoReparacion = new EquipoReparacion();
        Limpieza equipoLimpieza = new EquipoLimpieza();

        // Usar los métodos de cada interfaz
        equipoReparacion.realizarReparacion();
        equipoLimpieza.realizarLimpieza();
    }
}