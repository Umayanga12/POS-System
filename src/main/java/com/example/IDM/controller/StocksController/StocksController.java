package com.example.IDM.controller.StocksController;

import com.example.IDM.model.StocksModel;
import com.example.IDM.repository.StocksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stocks")
public class StocksController {
    private final StocksRepo stocksRepo;

    @Autowired
    public StocksController(StocksRepo stocksRepo) {
        this.stocksRepo = stocksRepo;
    }

    @PostMapping("/add")
    StocksModel NewStock(@RequestBody StocksModel newStock){
        return stocksRepo.save(newStock);
    }

    @GetMapping("/all")
    public List<StocksModel> GetAllStoks() {
        return stocksRepo.findAll();
    }

    @GetMapping("/{id}")
    StocksModel GetStocksById(@PathVariable long id) {
        return stocksRepo.findById(id).orElseThrow(() -> new StocksDetailNotAvailableException(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<StocksModel> updateSockCoun(@PathVariable long id, @RequestBody StocksModel updateStockCount) {
        Optional<StocksModel> StockDetail = stocksRepo.findById(id);
        if (StockDetail.isPresent()) {
            StocksModel stockCount = StockDetail.get();
            stockCount.setQuantity(updateStockCount.getQuantity());
            StocksModel updatecount = stocksRepo.save(stockCount);
            return ResponseEntity.ok(updatecount);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<StocksModel> deleteStock(@PathVariable long id) {
        if (stocksRepo.existsById(id)){
            stocksRepo.deleteById(id);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }

}

