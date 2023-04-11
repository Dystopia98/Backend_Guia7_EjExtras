
package Rectangulo;

public class Rectangulo {
    public int lado1;
    public int lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public int Calcular_Area(){
        return lado1*lado2;
    }
    public void Imprimir(){
        System.out.println("Área del rectángulo 6x4 : ");
        System.out.println("         "+Calcular_Area());
    }
}
