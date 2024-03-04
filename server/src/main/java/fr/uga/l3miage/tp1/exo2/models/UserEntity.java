package fr.uga.l3miage.tp1.exo2.models;

import org.hibernate.Session;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.OffsetDateTime;

@Entity
public class UserEntity {
@Id
private  Long idUser;
private Boolean sso;
private OffsetDateTime lastConnexion;
@OneToOne
    private SessionEntity Session;
}
