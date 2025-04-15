package View;

import Controller.Libro;
import Model.Bibliotecario;
import Model.Prestamo;
import Model.Usuario;

public class Main {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico", "bueno");
        Libro libro2 = new Libro("Fahrenheit 451", "Ray Bradbury", "Ciencia ficción", "regular");
        Libro libro3 = new Libro("La Odisea", "Homero", "clásico", "malo");

        // Crear usuarios
        Usuario usuario1 = new Usuario("Juan Pérez", "101");
        Usuario usuario2 = new Usuario("Ana García", "102");

        // Crear bibliotecario
        Bibliotecario bibliotecario = new Bibliotecario("Carlos Biblios");

        // Realizar préstamos
        bibliotecario.realizarPrestamo(usuario1, libro1, 5, 10);
        bibliotecario.realizarPrestamo(usuario2, libro2, 6, 12);

        // Imprimir información
        System.out.println("---- Usuarios y sus préstamos ----");
        System.out.println(usuario1);
        for (Prestamo p : usuario1.getLibrosPrestados()) {
            System.out.println(p);
        }

        System.out.println(usuario2);
        for (Prestamo p : usuario2.getLibrosPrestados()) {
            System.out.println(p);
        }

        // Verificar disponibilidad
        System.out.println("\n---- Disponibilidad de libros ----");
        System.out.println(libro1.getTitulo() + " disponible: " + libro1.isDisponibilidad());
        System.out.println(libro2.getTitulo() + " disponible: " + libro2.isDisponibilidad());
        System.out.println(libro3.getTitulo() + " disponible: " + libro3.isDisponibilidad());

        // Devolver un libro
        bibliotecario.realizarDevolucion(usuario1, libro1);

        // Ver disponibilidad después de la devolución
        System.out.println("\nDespués de devolver " + libro1.getTitulo() + ":");
        System.out.println(libro1.getTitulo() + " disponible: " + libro1.isDisponibilidad());

        // Valores monetarios
        System.out.println("\n---- Valores monetarios ----");
        System.out.println(libro1.getTitulo() + ": $" + libro1.calcularValorMonetario());
        System.out.println(libro2.getTitulo() + ": $" + libro2.calcularValorMonetario());
        System.out.println(libro3.getTitulo() + ": $" + libro3.calcularValorMonetario());
    }

    }
