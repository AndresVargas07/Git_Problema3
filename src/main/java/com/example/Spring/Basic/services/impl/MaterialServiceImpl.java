package com.example.Spring.Basic.services.impl;

import com.example.Spring.Basic.entities.Category;
import com.example.Spring.Basic.repositories.CategoryRepository;
import com.example.Spring.Basic.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Service
public class MaterialServiceImpl implements CategoryService {
    private final CategoryRepository repo;
    public MaterialServiceImpl(CategoryRepository repo) { this.repo = repo; }

    public Category create(String nombre) { return repo.save(new Category(null, nombre)); }
    public List<Category> getAll() { return repo.findAll(); }
    public Category getById(Long id) {
        return repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoría no encontrada"));
    }
}