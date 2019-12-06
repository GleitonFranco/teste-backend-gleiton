package com.opovodigital.testebackend.model;

import java.util.Objects;

public class Artigo {
    private Long id;
    private String titulo;
    private String texto;

    public Artigo() {}

    public Artigo(Long id, String titulo, String texto) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Artigo)) return false;
        Artigo artigo = (Artigo) o;
        return artigo.id.equals(this.id);
    }

}
