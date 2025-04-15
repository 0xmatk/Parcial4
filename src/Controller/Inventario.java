package Controller;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Libro> libros;

    public Inventario() {
        this.libros = new ArrayList<Libro>();
    }

    public void agregarLibro(Libro nuevoLibro){
        if(!this.libros.contains(nuevoLibro) && nuevoLibro != null){
            this.libros.add(nuevoLibro);
        }else{
            System.out.println("No se puede agregar el libro");
        }
    }

    public void buscarLibroPorAutor(String autor){
        for(Libro libro : this.libros){
            if(libro.getAutor().equals(autor)){
                System.out.println(libro);
            }else{
                System.out.println(libro.getAutor() + " no tiene libros");
            }
        }
    }

    public void buscarLibrosPorTitulo(String titulo){
        for(Libro libro : this.libros){
            if(libro.getTitulo().equals(titulo)){
                System.out.println(libro);
            }else{
                System.out.println(libro.getTitulo() + " no existe");
            }
        }
    }

    public int cantidadDeLibros(){
        return this.libros.size();
    }

    public void listadoDeLibros(){
        for(Libro libro : this.libros){
            System.out.println(libro);
        }
    }

    public boolean eliminarLibro(String tituloDeLibroAEliminar){
        for(Libro libro : this.libros){
            if(tituloDeLibroAEliminar.equals(libro.getTitulo())){
                this.libros.remove(libro);
                return true;
            }
        }

        return false;
    }

}
