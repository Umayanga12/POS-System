package com.example.IDM.repository;

import com.idm.edu.POS.system.model.BrandModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BrandRepo extends JpaRepository<BrandModel,Long> {
}