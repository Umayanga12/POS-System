package com.example.IDM.repository;


import com.example.IDM.model.SalesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepo extends JpaRepository<SalesModel,Long> {
}
