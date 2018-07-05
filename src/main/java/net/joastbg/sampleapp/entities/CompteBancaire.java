package net.joastbg.sampleapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity

@Table(name="CompteBancaire")
public class CompteBancaire {

    
      @Id
  @Column(name = "iban")
  @GeneratedValue
    private String iban;

      
        @Column(name = "proprietaire")
      private String proprietaire;
      
      
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return Bic;
    }

    public String getProprietaire() {
        return proprietaire;
    }

     @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idClient", nullable = false)
    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public void setBic(String Bic) {
        this.Bic = Bic;
    }

        
        @Column(name = "Bic")
      private String Bic;


}
