

package com.mycompany.sisgestionempleados;

public class Empleado {
    private final String nombre;
    private final int edad;
    private final double salario;
    private final String nombreEmpresa;  
    private final int añosEnEmpresa;     

    // Constructor
    public Empleado(String nombre, int edad, double salario, String nombreEmpresa, int añosEnEmpresa) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.nombreEmpresa = nombreEmpresa;
        this.añosEnEmpresa = añosEnEmpresa;
    }

    
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Empresa: " + nombreEmpresa);  // Mostrar empresa
        System.out.println("Años en la empresa: " + añosEnEmpresa);  // Mostrar tiempo en la empresa
    }
}
