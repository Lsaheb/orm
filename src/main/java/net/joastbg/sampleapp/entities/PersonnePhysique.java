package net.joastbg.sampleapp.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="PERSONNE")
public class PersonnePhysique extends Client{
       private String nom;
       private String Prenom;
       private Date dateNaissance;
}
