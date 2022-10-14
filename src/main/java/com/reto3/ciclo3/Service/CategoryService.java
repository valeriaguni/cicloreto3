package com.reto3.ciclo3.Service;

import com.reto3.ciclo3.Entidad.Category;
import com.reto3.ciclo3.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.getAllCategories();
    }

    public Optional<Category> getCategory(Integer id) {
        return categoryRepository.getCategory(id);
    }

    public Category saveCategory(Category category) {
        return categoryRepository.saveCategory(category);
    }

    public Category save(Category category) {

        if (category.getId() == null) {
            return categoryRepository.saveCategory(category);
        } else {
            Optional<Category> category1 = categoryRepository.getCategory(category.getId());
            if (category1.isEmpty()) {
                return categoryRepository.saveCategory(category);
            } else {
                return category;
            }
        }
    }
}