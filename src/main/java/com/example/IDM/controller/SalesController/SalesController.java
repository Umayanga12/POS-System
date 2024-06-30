package com.example.IDM.controller.SalesController;

import com.example.IDM.model.SalesModel;
import com.example.IDM.repository.SalesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController {
    private final SalesRepo salesRepo;

    @Autowired
    public SalesController(SalesRepo salesRepo){
        this.salesRepo = salesRepo;
    }

    @PostMapping("/add")
    SalesModel NewSalesDetail(@RequestBody SalesModel newSalesData){
        return salesRepo.save(newSalesData);
    }

    @GetMapping("/all")
    public List<SalesModel> getAllSales(){
        return salesRepo.findAll();
    }

    @GetMapping("/{id}")
    SalesModel GetSaleById(@PathVariable long id){
        return salesRepo.findById(id).orElseThrow(() -> new SalesDetailNotAvailableException(id));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<SalesModel> deleteSaleDetail(@PathVariable long id){
        if (salesRepo.existsById(id)){
            salesRepo.deleteById(id);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }

}
