package com.example.Spring.Basic.controller;

import com.example.Spring.Basic.entities.Material;
import com.example.Spring.Basic.services.MaterialService;
import com.example.Spring.Basic.services.impl.MaterialServiceImpl;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/materials")
public class MaterialController {
    private final MaterialService service;
    public MaterialController(MaterialServiceImpl service) { this.service = service; }

    @PostMapping("/crear")
    public Material crear(@RequestParam String nombre,
                          @RequestParam Long categoryId,
                          @RequestParam int cantidad,
                          @RequestParam String estado) {
        return service.create(nombre, categoryId, cantidad, estado);
    }

    @GetMapping
    public List<Material> getAll() { return service.getAll(); }

    @GetMapping("/activos")
    public List<Material> getActivos() { return service.getActive(); }

    @GetMapping("/{id}")
    public Material getById(@PathVariable Long id) { return service.getById(id); }

    @PutMapping("/{id}/cantidad")
    public Material actualizarCantidad(@PathVariable Long id, @RequestParam int value) {
        return service.updateCantidad(id, value);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) { service.delete(id); }
}