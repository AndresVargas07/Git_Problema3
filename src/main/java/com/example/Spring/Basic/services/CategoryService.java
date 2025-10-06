package com.example.Spring.Basic.services;

import com.example.Spring.Basic.entities.Category;
import java.util.List;

public interface CategoryService {
    Category create(String nombre);
    List<Category> getAll();
    Category getById(Long id);
}