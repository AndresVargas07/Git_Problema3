package com.example.Spring.Basic.services;

import com.example.Spring.Basic.entities.Material;
import java.util.List;

public interface MaterialService {
    Material create(String nombre, Long categoryId, int cantidad, String estado);
    List<Material> getAll();
    List<Material> getActive();
    Material getById(Long id);
    Material updateCantidad(Long id, int nuevaCantidad);
    void delete(Long id);
}
