package net.joastbg.sampleapp.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ASSURANCE")
public class AssuranceAuto  extends  Assurance{
    
   private String Immatriculation;
   private String Bonus;
}
