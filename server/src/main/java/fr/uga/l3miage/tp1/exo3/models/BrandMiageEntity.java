package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="brand_miage")
public class BrandMiageEntity {
    @Id
    @Column(name="siretNumber", length =11)
    private  String siretNumber;
    @Column(name="compagny_name")
    private  String compagny_name;
    @Column(name="type")
    private String type;
}
