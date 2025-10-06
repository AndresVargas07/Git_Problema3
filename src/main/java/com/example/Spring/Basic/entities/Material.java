package com.example.Spring.Basic.entities;

public class Material {
    private Long id;
    private String nombre;
    private Long categoryId;
    private int cantidad;
    private Status estado;

    public Material() {}
    public Material(Long id, String nombre, Long categoryId, int cantidad, Status estado) {
        this.id = id;
        this.nombre = nombre;
        this.categoryId = categoryId;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Long getCategoryId() { return categoryId; }
    public void setCategoryId(Long categoryId) { this.categoryId = categoryId; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public Status getEstado() { return estado; }
    public void setEstado(Status estado) { this.estado = estado; }
}