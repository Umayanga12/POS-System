package com.example.IDM.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "stocks", uniqueConstraints = {
        @UniqueConstraint(columnNames = "stockid")
})
public class StocksModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stockId;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "itemid", referencedColumnName = "itemid")
    private ItemModel item;
}
