package com.example.IDM.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.apachecommons.CommonsLog;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "brand", uniqueConstraints = {
        @UniqueConstraint(columnNames = "brand_id"),
        @UniqueConstraint(columnNames = "brandname")
})
public class BrandModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long brandId;

    @Column(name = "brandname", length = 11)
    private String brandName;

    @Column(name = "agent_contect")
    private String brandAgentContact;

    @Column(name = "brand_mail")
    private String brandEmail;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ItemModel> items;
}