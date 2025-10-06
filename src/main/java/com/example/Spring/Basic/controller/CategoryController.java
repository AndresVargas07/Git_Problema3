package com.example.Spring.Basic.controller;

import com.example.Spring.Basic.entities.Category;
import com.example.Spring.Basic.services.CategoryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService service;
    public CategoryController(@Qualifier("categoryServiceImpl") CategoryService service) { this.service = service; }

    @PostMapping("/crear")
    public Category crear(@RequestParam String nombre) {
        return service.create(nombre);
    }

    @GetMapping
    public List<Category> getAll() { return service.getAll(); }

    @GetMapping("/{id}")
    public Category getById(@PathVariable Long id) { return service.getById(id); }
}