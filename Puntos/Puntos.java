package Puntos;

import java.util.Scanner;

public class Puntos {

    Scanner leer = new Scanner(System.in);
    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void crearPuntos() {
        System.out.println("Punto 1 :");
        System.out.print(" X = ");
        this.x1 = leer.nextInt();
        System.out.print(" Y = ");
        this.y1 = leer.nextInt();
        System.out.println("Punto 2 :");
        System.out.print(" X = ");
        this.x2 = leer.nextInt();
        System.out.print(" Y = ");
        this.y2 = leer.nextInt();
    }

    public double Calcular() {
        return  (double) (Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }

    public void Mostrar() {
        if (((int) Calcular())*10 ==  (int)(Calcular()*10)) {
            System.out.println("Distancia = " + (int)Calcular());
        } else {
            System.out.println("Distancia = 2√" + (int) (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        }
    }
}
