
//Blanca Da costa Gomez Carcamo//
//202310010031
//Realizar un programa usando clases y capsulamiento adecuado para la gestion de empleados, permitiendonos agregar datos como ser
//nombre, edad, salario y extras como año de inicio en la empresa como el nombre de la empresa, luego nos muestra 
//el resumen de los datos ingresados.

package com.mycompany.sisgestionempleados;

import java.util.Scanner;

public class SisGestionEmpleados {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            GestorEmpleados gestor = new GestorEmpleados();
            System.out.println("Sistema de Gestión de Empleados");
            boolean continuar = true;
            while (continuar) {

                //  empleados
                System.out.println("Ingrese nombre del empleado:");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese edad del empleado:");
                int edad = scanner.nextInt();
                System.out.println("Ingrese salario del empleado:");
                double salario = scanner.nextDouble();
                scanner.nextLine(); 
                System.out.println("Ingrese nombre de la empresa:");
                String nombreEmpresa = scanner.nextLine();
                System.out.println("Ingrese los años que ha trabajado en la empresa:");
                int añosEnEmpresa = scanner.nextInt();
                scanner.nextLine();  

                
                Empleado empleado = new Empleado(nombre, edad, salario, nombreEmpresa, añosEnEmpresa);
                gestor.agregarEmpleado(empleado);

               
                System.out.println("¿Desea agregar otro empleado? (s/n)");
                String respuesta = scanner.nextLine();
                continuar = respuesta.equalsIgnoreCase("s");
            }
            
            // salida de datos
            System.out.println("Lista de empleados registrados:");
            gestor.mostrarEmpleados();
        }
    }
}
