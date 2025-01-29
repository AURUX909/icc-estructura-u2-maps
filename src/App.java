import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {
        runMapExamlpe();
        runEmpleadoExample();
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller emCtrl = new EmpleadoContoller();

        // Agregar empleados
        boolean result = emCtrl.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso 1: " + result); // true

        result = emCtrl.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso 2: " + result); // false (ID repetido)

        result = emCtrl.addEmpleado(new Empleado(2, "Juan", "Junior"));
        System.out.println("Ingreso 3: " + result); // true

        result = emCtrl.addEmpleado(new Empleado(3, "María", "Analista"));
        System.out.println("Ingreso 4: " + result); // true

        // Buscar empleado por ID
        Empleado empleado = emCtrl.getEmpleadoById(1);
        System.out.println("\nEmpleado encontrado (ID 1): " + empleado);

        // Mostrar solo nombres de empleados
        System.out.println("\nNombres de empleados:");
        emCtrl.displayEmpleadoSoloNombres();

        // Mostrar todas las llaves (IDs)
        System.out.println("\nIDs de empleados:");
        emCtrl.displayLlaves();

        // Mostrar todos los empleados (sin usar EntrySet)
        System.out.println("\nLista completa de empleados:");
        emCtrl.displayEmpleados();
    }

    private static void runMapExamlpe() {
        Mapa ejemploMapas = new Mapa();
        ejemploMapas.inicializarHashMap();
        ejemploMapas.inicializarLinkedHashMap();
        ejemploMapas.inicializarTreeMap();
    }

    private static void runEjerccios() {
        // Implementación de ejercicios adicionales
    }
}