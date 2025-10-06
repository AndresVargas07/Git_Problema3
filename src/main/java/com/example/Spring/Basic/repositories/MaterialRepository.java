package com.example.Spring.Basic.repositories;

import com.example.Spring.Basic.entities.Material;
import org.springframework.stereotype.Repository;
import java.util.ArrayList; import java.util.List; import java.util.Optional;

@Repository
public class MaterialRepository {
    private final List<Material> data = new ArrayList<>();
    private long nextId = 1L;

    public Material save(Material m) {
        if (m.getId() == null) { m.setId(nextId++); data.add(m); }
        else {
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i).getId().equals(m.getId())) { data.set(i, m); }
            }
        }
        return m;
    }

    public List<Material> findAll() { return data; }
    public Optional<Material> findById(Long id) { return data.stream().filter(x -> x.getId().equals(id)).findFirst(); }

    public List<Material> findAllActive() {
        List<Material> r = new ArrayList<>();
        for (Material m : data) { if ("ACTIVO".equalsIgnoreCase(m.getEstado())) r.add(m); }
        return r;
    }

    public void deleteById(Long id) { data.removeIf(x -> x.getId().equals(id)); }
}