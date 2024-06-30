package com.example.IDM.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sales", uniqueConstraints = {
        @UniqueConstraint(columnNames = "saleid")
})
public class SalesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SaleId;

    @Column(name = "date")
    private String DateTime;

    @Column(name = "count")
    private int Count;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "itemid", referencedColumnName = "itemid")
    private ItemModel item;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "userid", referencedColumnName = "userId")
    private UserModel user;
}
