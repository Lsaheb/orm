package net.joastbg.sampleapp.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="ECHEANCE")
public class Echeances {
		
	
	public int getIdEcheance() {
		return idEcheance;
	}
	public void setIdEcheance(int idEchance) {
		this.idEcheance = idEchance;
	}
	
	  @Id
	  @Column(name = "idEcheance")
	  @GeneratedValue
	private int idEcheance;
	
	  @Column(name = "prix")
	private int prix ;
	  @Column(name = "dateEmission")
	private  String dateEmission ;
	  @Column(name = "datePaiement")
	private String datePaiement;
	  @Column(name = "dateEmmisionFacture") 
	private String dateEmmisionFacture ; 
	  
	  
	  @ManyToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name = "idClient", nullable = false)
	  private String assurance;
		
	    public String getAssurance() {
		return assurance;
	}
		public void setAssurance(String assurance) {
	        this.assurance = assurance;
	    }

	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getDateEmission() {
		return dateEmission;
	}
	public void setDateEmission(String dateEmission) {
		this.dateEmission = dateEmission;
	}
	public String getDatePaiement() {
		return datePaiement;
	}
	public void setDatePaiement(String datePaiement) {
		this.datePaiement = datePaiement;
	}
	public String getDateEmmisionFacture() {
		return dateEmmisionFacture;
	}
	public void setDateEmmisionFacture(String dateEmmisionFacture) {
		this.dateEmmisionFacture = dateEmmisionFacture;
	}
	
}
