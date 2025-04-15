package Model;

import Controller.Libro;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
    private String nombre;
    private String identificacion;
    private List<Prestamo> librosPrestados;

    public Usuario(String nombre, String identificacion) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
        this.identificacion = identificacion;
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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }


    public void agregarPrestamo(Prestamo prestamo) {
        this.librosPrestados.add(prestamo);
    }

    public void removerPrestamo(Prestamo prestamo) {
        this.librosPrestados.remove(prestamo);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", librosPrestados=" + librosPrestados +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(identificacion, usuario.identificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identificacion);
    }

}
