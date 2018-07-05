package net.joastbg.sampleapp.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="CONTACT")
public class Contact {
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idClient", nullable = false)
    private int idClient;
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
        
}
