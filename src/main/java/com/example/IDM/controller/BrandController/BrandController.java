package com.example.IDM.controller.BrandController;


import com.example.IDM.model.BrandModel;
import com.example.IDM.repository.BrandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/brand")
@RestController
public class BrandController {

    private final BrandRepo brandRepo;

    @Autowired
    public BrandController(BrandRepo brandRepo) {
        this.brandRepo = brandRepo;
    }

    @PostMapping("/add")
    BrandModel newBrand(@RequestBody BrandModel newBrandDetail){
        return brandRepo.save(newBrandDetail);
    }

    // Getting all brand details
    @GetMapping("/all")
    public List<BrandModel> getAllBrands() {
        return brandRepo.findAll();
    }

    //getting brand detail by id
    @GetMapping("/{id}")
    BrandModel GetBrandByID(@PathVariable Long id){
        return brandRepo.findById(id).orElseThrow(() -> new BrandDetailNotAvailableException(id));
    }


    //update brand detail
    @PutMapping("/update/{id}")
    public ResponseEntity<BrandModel> UpdateDetail(@PathVariable long id, @RequestBody BrandModel updatedBrand){
        Optional<BrandModel> BrandDetail = brandRepo.findById(id);
        if (BrandDetail.isPresent()){
            BrandModel exsistingBrand = BrandDetail.get();
            exsistingBrand.setBrandName(updatedBrand.getBrandName());
            BrandModel savedBrand = brandRepo.save(exsistingBrand);
            return ResponseEntity.ok(savedBrand);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<BrandModel> deleteBrand(@PathVariable long id){
        if (brandRepo.existsById(id)){
            brandRepo.deleteById(id);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }


}
