package com.example.Spring.Basic.repositories;

import com.example.Spring.Basic.entities.Category;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
class CategoryRepository {
    private final List<Category> data = new ArrayList<>();
    private long nextId = 1L;

    public Category save(Category c) {
        if (c.getId() == null) {
            c.setId(nextId++);
            data.add(c);
        } else {
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i).getId().equals(c.getId())) {
                    data.set(i, c);
                }
            }
        }
        return c;
    }

    public List<Category> findAll() { return data; }

    public Optional<Category> findById(Long id) {
        return data.stream().filter(c -> c.getId().equals(id)).findFirst();
    }
}