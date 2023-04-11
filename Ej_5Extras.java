
import Empleado.Empleado;

/**
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, crea
 *  un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de 
 *  su edad y salario actual. El aumento salarial debe ser del 10% si el empleado tiene más 
 *  de 30 años o del 5% si tiene menos de 30 años.
 */
public class Ej_5Extras {

    public static void main(String[] args) {
        Empleado E = new Empleado();
        E.Datos();
        E.Calcular_Aumento();
        E.Mostrar();
    }
    
}
