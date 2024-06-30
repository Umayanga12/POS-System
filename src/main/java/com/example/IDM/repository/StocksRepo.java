package com.example.IDM.repository;


import com.example.IDM.model.StocksModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StocksRepo extends JpaRepository<StocksModel,Long> {

}
