package com.example.IDM.repository;


import com.example.IDM.model.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<ItemModel, Long> {
}
