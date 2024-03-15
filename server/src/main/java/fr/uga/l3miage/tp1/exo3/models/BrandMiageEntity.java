package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.models.enums.BrandType;

import javax.persistence.*;

@Entity
@Table(name="brand_miage")
public class BrandMiageEntity {
    @Id
    @Column(name="siretNumber", length =11)
    private  String siretNumber;
    @Column(name="compagny_name")
    private  String compagny_name;
    @Enumerated(EnumType.STRING)
    private BrandType type ;
}
