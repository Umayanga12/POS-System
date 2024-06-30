package com.example.IDM.repository;


import com.example.IDM.model.StockDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StocksDetailRepo extends JpaRepository<StockDetailsModel, Long> {

}
