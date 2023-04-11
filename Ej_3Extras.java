
import Juego.Juego;
import java.util.Scanner;

/**
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos
 * jugadores jugar un juego de adivinanza de números. El primer jugador elige un
 * número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un
 * número limitado de intentos y recibe una pista de "más alto" o "más bajo"
 * después de cada intento. El juego termina cuando el segundo jugador adivina
 * el número o se queda sin intentos. Registra el número de intentos necesarios
 * para adivinar el número y el número de veces que cada jugador ha ganado.
 */
public class Ej_3Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Juego Numero = new Juego();
        String r ;
        int j = 0, jug = 0;
        do {
            j = j + 1;
            Numero.setJ(j);
            Numero.setJug2(jug);
        Numero.iniciarNumero();
        Numero.adivinarNumero();
        jug = jug + Numero.getJug2();
            System.out.print("          ¿Continuar...?");
            r = leer.nextLine();
        } while (!r.toUpperCase().equals("NO"));
    }

}
