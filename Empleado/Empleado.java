package Empleado;

import java.util.Scanner;

public class Empleado {

    Scanner leer = new Scanner(System.in);
    public String nombre;
    public int edad;
    public int salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void Datos() {
        System.out.println("Nombre , edad y salario.");
        System.out.print("Nombre : ");
        nombre = leer.nextLine();
        System.out.print("Edad : ");
        edad = leer.nextInt();
        System.out.print("Salario : ");
        salario = leer.nextInt();
    }

    public double Calcular_Aumento() {
        if (edad >= 30) {
            return (double) ((int)(((salario * 0.10) + salario) * 100))/100;
        } else {
            return (double) ((int)(((salario * 0.05) + salario) * 100))/100;
        }
    }

    public void Mostrar() {
        double a = 3.00;
        if (edad >= 30) {
            System.out.println("     El aumento salarial de " + nombre);
            System.out.println("     de " + edad + " años de edad y");
            System.out.println("     un salario base de " + salario + " es del 10%");
            System.out.println("     dando un total de = ");
            System.out.println("          "+Calcular_Aumento());
        } else {
            System.out.println("     El aumento salarial de " + nombre);
            System.out.println("     de " + edad + " años de edad y");
            System.out.println("     un salario base de " + salario + " es del 5%");
            System.out.println("     dando un total de : ");
            System.out.println("          "+ Calcular_Aumento());
        }
    }
}
