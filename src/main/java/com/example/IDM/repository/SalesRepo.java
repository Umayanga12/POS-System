package com.example.IDM.repository;

import com.idm.edu.POS.system.model.salesModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SalesRepo extends JpaRepository<salesModel,Long> {
}
