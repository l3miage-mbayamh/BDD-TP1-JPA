package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;
import javax.persistence.*;
import java.math.BigInteger;


@Table(name="netflix_account")
@Entity
public class NetflixAccountEntity {
    @Id
    @Column(name="id")
    private Long id;
    @Column(name="nb_devices")
    private  Integer nb_devices;
    @Column(name="typeAccount")
    @Enumerated(EnumType.STRING)
    private TypeAccount typeAccount;

    @OneToOne
    @JoinColumn(name="uuid_user", referencedColumnName="uuid")
    private NetflixUserEntity netflixUser;

}
