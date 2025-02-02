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
    Ejercicios ejercicios = new Ejercicios();
    
    // Pruebas para areAnagrams
    System.out.println("\n--- Pruebas de Anagramas ---");
    System.out.println("'listen' y 'silent': " + Ejercicios.areAnagrams("listen", "silent")); // true
    System.out.println("'hello' y 'bello': " + Ejercicios.areAnagrams("hello", "bello")); // false
    System.out.println("'triangle' y 'integral': " + Ejercicios.areAnagrams("triangle", "integral")); // true

    // Pruebas para sumatoriaDeDos
    System.out.println("\n--- Pruebas de Sumatoria de Dos ---");
    int[] nums1 = {9, 2, 3, 6};
    int objetivo1 = 5;
    int[] resultado1 = ejercicios.sumatoriaDeDos(nums1, objetivo1);
    System.out.print("nums = [9,2,3,6], objetivo = 5: ");
    if (resultado1 != null) {
        System.out.println("[" + resultado1[0] + ", " + resultado1[1] + "]");
    } else {
        System.out.println("null");
    }

    int objetivo2 = 10;
    int[] resultado2 = ejercicios.sumatoriaDeDos(nums1, objetivo2);
    System.out.print("nums = [9,2,3,6], objetivo = 10: ");
    if (resultado2 != null) {
        System.out.println("[" + resultado2[0] + ", " + resultado2[1] + "]");
    } else {
        System.out.println("null");
    }
    }
}
