
package Cancion;

import java.util.Scanner;

public class Cancion {
    Scanner leer = new Scanner(System.in);
    private String titulo;
    private String autor;

    public Cancion() {
        System.out.println("   Titulo.");
        setTitulo(leer.nextLine());
        System.out.println("   Autor.");
        setAutor(leer.next());
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void Mostrar(){
        System.out.println("--Canción... ");
        System.out.println("---Titulo : "+getTitulo());
        System.out.println("---Autor : "+getAutor());
    }
}
