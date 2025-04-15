package Model;

import Controller.Libro;

public class Prestamo {
    private Libro libro;
    private int fechaPrestamo;
    private int fechaDevolucion;


    public Prestamo(Libro libro, int fechaDevolucion, int fechaPrestamo) {
        this.libro = libro;
        this.fechaDevolucion = fechaDevolucion;
        this.fechaPrestamo = fechaPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(int fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(int fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }


    @Override
    public String toString() {
        return "Prestamo{" +
                "libro=" + libro +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }
}
