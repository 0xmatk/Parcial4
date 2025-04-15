package Controller;

import java.util.Objects;

public class Libro {
    protected String titulo;
    protected String autor;
    protected String genero;
    protected String estadoDeConservacion;
    protected double precio;
    protected boolean disponibilidad;

    public Libro(String titulo, String estadoDeConservacion, String autor, String genero) {
        this.titulo = titulo;
        this.estadoDeConservacion = estadoDeConservacion;
        this.autor = autor;
        this.genero = genero;
        this.disponibilidad = true;
    }

    public Libro(){
        this.titulo = "";
        this.autor = "";
        this.genero = "";
        this.estadoDeConservacion = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstadoDeConservacion() {
        return estadoDeConservacion;
    }

    public void setEstadoDeConservacion(String estadoDeConservacion) {
        this.estadoDeConservacion = estadoDeConservacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public double calcularValorMonetario() {
        if (this.estadoDeConservacion.equals("bueno")) {
            return this.precio;
        } else if (this.estadoDeConservacion.equals("regular")) {
            return this.precio / 2;
        } else if (this.estadoDeConservacion.equals("malo")) {
            return this.precio * 0.25;
        } else{
            return this.precio;
        }
    }


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", estadoDeConservacion='" + estadoDeConservacion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && Objects.equals(genero, libro.genero) && Objects.equals(estadoDeConservacion, libro.estadoDeConservacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, genero, estadoDeConservacion);
    }
}
