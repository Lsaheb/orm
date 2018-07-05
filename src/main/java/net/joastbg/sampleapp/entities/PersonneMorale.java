package net.joastbg.sampleapp.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@SequenceGenerator(name = "article_seq")
@Table(name="PersonneMorale")
public class PersonneMorale extends Client implements Serializable {
    

    private int Siren;
    private String Nom;
}
