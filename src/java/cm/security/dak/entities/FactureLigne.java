/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cm.security.dak.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Muanza Kangudie
 */
@Entity
@Table(name = "facture_ligne")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FactureLigne.findAll", query = "SELECT f FROM FactureLigne f"),
    @NamedQuery(name = "FactureLigne.findByIdfactureLigne", query = "SELECT f FROM FactureLigne f WHERE f.idfactureLigne = :idfactureLigne"),
    @NamedQuery(name = "FactureLigne.findByLibelle", query = "SELECT f FROM FactureLigne f WHERE f.libelle = :libelle"),
    @NamedQuery(name = "FactureLigne.findByMontant", query = "SELECT f FROM FactureLigne f WHERE f.montant = :montant")})
public class FactureLigne implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfacture_ligne")
    private Integer idfactureLigne;
    @Size(max = 45)
    @Column(name = "libelle")
    private String libelle;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "montant")
    private Double montant;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "justificatif")
    private String justificatif;
    @JoinColumn(name = "idfacture", referencedColumnName = "idfacture")
    @ManyToOne
    private Facture idfacture;

    public FactureLigne() {
    }

    public FactureLigne(Integer idfactureLigne) {
        this.idfactureLigne = idfactureLigne;
    }

    public Integer getIdfactureLigne() {
        return idfactureLigne;
    }

    public void setIdfactureLigne(Integer idfactureLigne) {
        this.idfactureLigne = idfactureLigne;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getJustificatif() {
        return justificatif;
    }

    public void setJustificatif(String justificatif) {
        this.justificatif = justificatif;
    }

    public Facture getIdfacture() {
        return idfacture;
    }

    public void setIdfacture(Facture idfacture) {
        this.idfacture = idfacture;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfactureLigne != null ? idfactureLigne.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FactureLigne)) {
            return false;
        }
        FactureLigne other = (FactureLigne) object;
        if ((this.idfactureLigne == null && other.idfactureLigne != null) || (this.idfactureLigne != null && !this.idfactureLigne.equals(other.idfactureLigne))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.FactureLigne[ idfactureLigne=" + idfactureLigne + " ]";
    }
    
}
