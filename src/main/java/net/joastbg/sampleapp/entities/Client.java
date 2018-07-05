package net.joastbg.sampleapp.entities;

import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="CLIENT")
public class Client  {
   @Id
  @Column(name = "idClient")
  @GeneratedValue
   private int idClient;
   
   @OneToOne(cascade = CascadeType.MERGE)
  @PrimaryKeyJoinColumn
   private int comptePrincipal ;
   
   @ManyToOne
   @JoinColumn(name="iban", nullable=false)
   private Set<CompteBancaire> Compte;

   @OneToMany(fetch = FetchType.LAZY, mappedBy = "Client")
   private Set<CompteBancaire> contact;

     @OneToMany(fetch = FetchType.LAZY, mappedBy = "Client")
            private Set<Contact> contacts;
   
    public int getIdClient() {
        return idClient;
    }
    

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getComptePrincipal() {
        return comptePrincipal;
    }

    public void setComptePrincipal(int comptePrincipal) {
        this.comptePrincipal = comptePrincipal;
    }

    public Set<CompteBancaire> getCompte() {
        return Compte;
    }

    public void setCompte(Set<CompteBancaire> Compte) {
        this.Compte = Compte;
    }
   
 
   
	


        
}



