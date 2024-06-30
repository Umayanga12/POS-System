package com.example.IDM.repository;


import com.example.IDM.model.BrandModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepo extends JpaRepository<BrandModel,Long> {
}