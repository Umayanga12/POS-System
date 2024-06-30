package com.example.IDM.repository;

import com.idm.edu.POS.system.model.stockDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StocksDetailRepo extends JpaRepository<stockDetailsModel, Long> {

}
