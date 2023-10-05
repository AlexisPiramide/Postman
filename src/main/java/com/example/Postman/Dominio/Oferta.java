package com.example.Postman.Dominio;

public class Oferta {

    private String titulo,descripcion;

    public Oferta(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Oferta{" + "titulo='" + titulo + '\'' + ", descripcion='" + descripcion + '\'' + '}';
    }
}

