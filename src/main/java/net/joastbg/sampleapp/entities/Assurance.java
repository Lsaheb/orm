package net.joastbg.sampleapp.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="ASSURANCE")
public class Assurance {
       @Id
  @Column(name = "idAssurance")
  @GeneratedValue
     private int idAssurance;
       @Column(name = "typeAssurance")
     private String typeAssurance ;
     @Column(name = "dateSouscription")
    private String dateSouscription ;
     @Column(name = "dateAnniversaire")
    private String dateAnniversaire ;
     @Column(name = "datePrelevement")
     private String datePrelevement ;
     
     
	  @OneToMany(fetch = FetchType.LAZY, mappedBy = "Assurance")
	   private Set<Echeances> echeances;
     
}
