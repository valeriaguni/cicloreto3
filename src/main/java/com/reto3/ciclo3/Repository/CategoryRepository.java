package com.reto3.ciclo3.Repository;

import com.reto3.ciclo3.CrudRepository.CategoryCrudRepository;
import com.reto3.ciclo3.Entidad.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class CategoryRepository {

    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAllCategories(){
        return (List<Category>) categoryCrudRepository.findAll();
    }

    public Optional<Category> getCategory(Integer id){
        return categoryCrudRepository.findById(id);
    }

    public Category saveCategory(Category category){
        return categoryCrudRepository.save(category);
    }
}
