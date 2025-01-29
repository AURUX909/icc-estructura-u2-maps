package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {

    private Map<Integer, Empleado> empleados;

    public EmpleadoContoller() {
        empleados = new HashMap<>();
    }

    public boolean addEmpleado(Empleado empleado) {
        if (empleados.containsKey(empleado.getId())) {
            return false;
        }
        empleados.put(empleado.getId(), empleado);
        return true;
    }

    /**
     * Busca un empleado por su id (corregido el tipo de dato del parámetro)
     * 
     * @param id del empleado a buscar (tipo int)
     * @return Empleado según id
     */
    public Empleado getEmpleadoById(int id) { // Cambiado de String a int
        return empleados.get(id);
    }

    public void displayEmpleado() {
        for (Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()) {
            System.out.println(empleadoEntry.getKey() + " - " + empleadoEntry.getValue());
        }
    }

    public void displayEmpleadoSoloNombres() {
        for (Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()) {
            System.out.println(empleadoEntry.getValue().getName());
        }
    }

    // Si usar Entry Set imprimir todas las llaves
    public void displayLlaves() {
        for (int llave : empleados.keySet()) {
            System.out.println(llave);
        }
    }

    // Sin usar Entry Set imprimir todos los empleados
    public void displayEmpleados() {
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado);
        }
    }
}