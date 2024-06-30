package com.example.IDM.repository;

import com.idm.edu.POS.system.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepo extends JpaRepository<CategoryModel, Long> {
}