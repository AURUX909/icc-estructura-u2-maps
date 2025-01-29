package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapa {
    // Constructor vacío (opcional)
    public Mapa() {
    }

    // Método para HashMap
    public void inicializarHashMap() {
        HashMap<String, Integer> mapa = new HashMap<>();
        ejecutarEjemplo(mapa, "HashMap");
    }

    // Método para LinkedHashMap
    public void inicializarLinkedHashMap() {
        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();
        ejecutarEjemplo(mapa, "LinkedHashMap");
    }

    // Método para TreeMap
    public void inicializarTreeMap() {
        TreeMap<String, Integer> mapa = new TreeMap<>();
        ejecutarEjemplo(mapa, "TreeMap");
    }

    // Método genérico para evitar código repetido
    private void ejecutarEjemplo(java.util.Map<String, Integer> mapa, String tipoMapa) {
        System.out.println("\n--- Ejemplo con " + tipoMapa + " ---");
        // Agregar elementos
        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Naranja", 12);
        mapa.put("Platano", 13);
        // Mostrar mapa
        System.out.println("Contenido inicial: " + mapa);
        // Verificar existencia de claves
        System.out.println("¿Hay Pera? " + mapa.containsKey("Pera"));
        System.out.println("¿Hay Kiwi? " + mapa.containsKey("Kiwi"));
        // Obtener valor
        System.out.println("Valor de Pera: " + mapa.get("Pera"));
        // Eliminar elemento
        mapa.remove("Naranja");
        System.out.println("Después de eliminar Naranja: " + mapa);
    }
}