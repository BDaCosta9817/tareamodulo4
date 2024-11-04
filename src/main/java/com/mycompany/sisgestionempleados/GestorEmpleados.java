
package com.mycompany.sisgestionempleados;

import java.util.ArrayList;

public class GestorEmpleados {
    
    // Lista de empleados
    private final ArrayList<Empleado> empleados;

   
    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado exitosamente.");
    }

    
    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado empleado : empleados) {
                empleado.imprimirDetalles();
                System.out.println("----------------------");
            }
        }
    }
}