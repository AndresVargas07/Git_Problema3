package com.example.Spring.Basic.services.impl;

import com.example.Spring.Basic.entities.Material;
import com.example.Spring.Basic.repositories.CategoryRepository;
import com.example.Spring.Basic.repositories.MaterialRepository;
import com.example.Spring.Basic.services.MaterialService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {

    private final MaterialRepository materials;
    private final CategoryRepository categories;

    public MaterialServiceImpl(MaterialRepository materials, CategoryRepository categories) {
        this.materials = materials;
        this.categories = categories;
    }

    @Override
    public Material create(String nombre, Long categoryId, int cantidad, String estado) {
        return null;
    }

    @Override
    public List<Material> getAll() {
        return List.of();
    }

    @Override
    public List<Material> getActive() {
        return List.of();
    }

    @Override
    public Material getById(Long id) {
        return null;
    }

    @Override
    public Material updateCantidad(Long id, int nuevaCantidad) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    // ...métodos que ya tienes, con las mismas firmas que la interfaz
}