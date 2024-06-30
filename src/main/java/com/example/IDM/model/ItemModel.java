package com.example.IDM.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "item", uniqueConstraints = {
        @UniqueConstraint(columnNames = "itemid")
})
public class ItemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemid;

    @Column(name = "itemname")
    private String ItemName;

    @Column(name = "price")
    private int Price;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryid", referencedColumnName = "CategoryId")
    private CategoryModel category;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "brandid", referencedColumnName = "BrandId")
    private BrandModel brand;

    @OneToMany(mappedBy = "item", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<StocksModel> stocks;
}