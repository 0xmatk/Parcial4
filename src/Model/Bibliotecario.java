package Model;

import Controller.Libro;

import java.util.ArrayList;
import java.util.List;

public class Bibliotecario {
    private String nombre;
    private List<Prestamo> librosPrestados;

    public Bibliotecario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Prestamo> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(List<Prestamo> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public boolean realizarPrestamo(Usuario usuario, Libro libro, int fechaPrestamo, int fechaDevolucion) {
        if(usuario != null && libro.isDisponibilidad()) {
            Prestamo prestamo = new Prestamo(libro, fechaPrestamo, fechaDevolucion);
            librosPrestados.add(prestamo);
            usuario.agregarPrestamo(prestamo);
            libro.setDisponibilidad(false);
            return true;
        }
        return false;
    }

    public boolean realizarDevolucion(Usuario usuario, Libro libro) {
        for(Prestamo prestamo : usuario.getLibrosPrestados()) {
            if(prestamo.getLibro().equals(libro)){
                libro.setDisponibilidad(true);
                usuario.removerPrestamo(prestamo);
                return true;

            }
        }
        return false;
    }

    public boolean verificarDisponibilidad(Libro libro){
        return libro.isDisponibilidad();
    }




}
