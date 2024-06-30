package com.example.IDM.controller.ItemController;

import com.example.IDM.model.ItemModel;
import com.example.IDM.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")
public class ItemController {
    private final ItemRepo itemRepo;

    @Autowired
    public ItemController(ItemRepo itemRepo){
        this.itemRepo = itemRepo;
    }

    @PostMapping("/add")
    ItemModel newItem(@RequestBody ItemModel newItemDetail){
        return itemRepo.save(newItemDetail);
    }

    @GetMapping("/all")
    public List<ItemModel> getAllItem(){
        return itemRepo.findAll();
    }

    @GetMapping("/{id}")
    ItemModel BetItemById(@PathVariable long id){
        return itemRepo.findById(id).orElseThrow(() ->new ItemDetailNotAvailableException(id));
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<ItemModel> updateItemDetail(@PathVariable Long id, @RequestBody ItemModel updatedDetail){
        Optional<ItemModel> item = itemRepo.findById(id);
        if (item.isPresent()){
            ItemModel exsistingitem = item.get();
            exsistingitem.setItemName(updatedDetail.getItemName());
            exsistingitem.setPrice(updatedDetail.getPrice());
            exsistingitem.setCategory(updatedDetail.getCategory());
            exsistingitem.setBrand(updatedDetail.getBrand());
            ItemModel savedUpdate = itemRepo.save(exsistingitem);
            return ResponseEntity.ok(savedUpdate);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<ItemModel> deleteItem(@PathVariable long id){
        if (itemRepo.existsById(id)){
            itemRepo.deleteById(id);
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }


}
