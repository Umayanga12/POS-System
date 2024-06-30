package com.example.IDM.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "stocksdetails", uniqueConstraints = {
        @UniqueConstraint(columnNames = "detailid")
})
public class StockDetailsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Detailid;
    @Column(name = "date")
    private  String DateTime;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "itemid", referencedColumnName = "itemid")
    private ItemModel item;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "userid", referencedColumnName = "userId")
    private UserModel user;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "stockid", referencedColumnName = "stockId")
    private StocksModel stock;
}
