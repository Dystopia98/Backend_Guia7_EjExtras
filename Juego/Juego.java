package Juego;

import java.util.Scanner;

public class Juego {

    Scanner leer = new Scanner(System.in);
    private int j, jug2;
    public int N;
    public int Intentos;
    public int A;

    public Juego() {
        Intentos = (int) (Math.random() * 10) + 3;
    }

    public Juego(int N) {
        this.N = N;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getJug2() {
        return jug2;
    }

    public void setJug2(int jug2) {
        this.jug2 = jug2;
    }

    public void iniciarNumero() {
        System.out.println("Jugador 1 elija un número.");
        N = leer.nextInt();
    }

    public void adivinarNumero() {
        int aux1 = 0;
        System.out.println("Jugador 2... ");
        System.out.println("Adivine el número.");
        for (int i = 0; i < Intentos; i++) {
            System.out.println("Intento n°" + (i + 1) + "/" + Intentos);
            System.out.print("     ");
            A = leer.nextInt();
            if (A != N) {
                if (A > N) {
                    System.out.println("El número es MENOR a ese !");
                }
                if (A < N) {
                    System.out.println("El número es MAYOR a ese !");
                }
            }
            if (A != N && i == (Intentos - 1)) {
                System.out.println("     ¡¡¡GANADOR!!!");
                System.out.println("       Jugador 1");
                aux1 = getJ() - getJug2();
                System.out.println("     Total de intentos fallados por el jugador 2 = " + (Intentos));
                setJug2(0);
                break;
            }
            if (A == N && i <= (Intentos - 1)) {
                setJug2(getJug2()+1);
                System.out.println("     ¡¡¡GANADOR!!!");
                System.out.println("       Jugador 2");
                aux1 = getJ() - getJug2();
                System.out.println("     Intentos utilizados = " + (i + 1));
                System.out.println("     Intentos restantes = " + (Intentos - (i + 1)));
                setJug2(1);
                break;
            }
        }
        System.out.println("     ¡VICTORIAS!");
        System.out.println("---JUGADOR N°1 : "+aux1);
        System.out.println("---JUGADOR N°2 : "+(getJ()-aux1));
    }
}
