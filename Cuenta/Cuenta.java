package Cuenta;

import java.util.Scanner;

public class Cuenta {
    Scanner leer = new Scanner(System.in);
    public int saldo;
    public String titular;
    int retiro ;

    public Cuenta() {
        saldo = 500000;
        titular = "TITULAR";
    }
    public void Retirar_dinero(){
        System.out.println("Titular : "+titular);
        System.out.println("Saldo actual : "+saldo);
        System.out.print("Ingrese monto a retirar : ");
        retiro = leer.nextInt();
        System.out.println("----------*----------");
        if (retiro > saldo){
            do {
                System.out.println("El monto exede el limite de saldo");
                System.out.println("Ingrese un nuevo monto a retirar : ");
                retiro = leer.nextInt();
            } while (retiro > saldo);
            System.out.println("----------*----------");
        }
        System.out.println("Titular : "+titular);
        System.out.println("Monto retirado : "+retiro);
        System.out.println("Saldo actual : "+(saldo-retiro));
    }
}
