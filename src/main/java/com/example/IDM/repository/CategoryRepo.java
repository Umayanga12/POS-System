package com.example.IDM.repository;


import com.example.IDM.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<CategoryModel, Long> {
}