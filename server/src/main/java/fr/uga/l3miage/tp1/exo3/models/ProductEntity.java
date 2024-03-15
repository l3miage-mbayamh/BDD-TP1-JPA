package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProductEntity {
    @Id
    @Column(name="bar_code_number")
    private  String bar_code_number;
    @Column(name = "name")
    private String name;
    @Column(name="consumable")
    private Boolean consumable;
    @ManyToOne
    private  BrandMiageEntity BrandMiage;
}
