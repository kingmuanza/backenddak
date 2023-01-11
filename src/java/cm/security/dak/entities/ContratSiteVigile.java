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
@Table(name = "contrat_site_vigile")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContratSiteVigile.findAll", query = "SELECT c FROM ContratSiteVigile c"),
    @NamedQuery(name = "ContratSiteVigile.findByIdcontratSiteVigile", query = "SELECT c FROM ContratSiteVigile c WHERE c.idcontratSiteVigile = :idcontratSiteVigile"),
    @NamedQuery(name = "ContratSiteVigile.findByQuantite", query = "SELECT c FROM ContratSiteVigile c WHERE c.quantite = :quantite"),
    @NamedQuery(name = "ContratSiteVigile.findByTypeVigile", query = "SELECT c FROM ContratSiteVigile c WHERE c.typeVigile = :typeVigile"),
    @NamedQuery(name = "ContratSiteVigile.findByHoraire", query = "SELECT c FROM ContratSiteVigile c WHERE c.horaire = :horaire")})
public class ContratSiteVigile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontrat_site_vigile")
    private Integer idcontratSiteVigile;
    @Column(name = "quantite")
    private Integer quantite;
    @Size(max = 45)
    @Column(name = "type_vigile")
    private String typeVigile;
    @Size(max = 45)
    @Column(name = "horaire")
    private String horaire;
    @JoinColumn(name = "idcontratsite", referencedColumnName = "idcontrat_site")
    @ManyToOne
    private ContratSite idcontratsite;

    public ContratSiteVigile() {
    }

    public ContratSiteVigile(Integer idcontratSiteVigile) {
        this.idcontratSiteVigile = idcontratSiteVigile;
    }

    public Integer getIdcontratSiteVigile() {
        return idcontratSiteVigile;
    }

    public void setIdcontratSiteVigile(Integer idcontratSiteVigile) {
        this.idcontratSiteVigile = idcontratSiteVigile;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public String getTypeVigile() {
        return typeVigile;
    }

    public void setTypeVigile(String typeVigile) {
        this.typeVigile = typeVigile;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public ContratSite getIdcontratsite() {
        return idcontratsite;
    }

    public void setIdcontratsite(ContratSite idcontratsite) {
        this.idcontratsite = idcontratsite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontratSiteVigile != null ? idcontratSiteVigile.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContratSiteVigile)) {
            return false;
        }
        ContratSiteVigile other = (ContratSiteVigile) object;
        if ((this.idcontratSiteVigile == null && other.idcontratSiteVigile != null) || (this.idcontratSiteVigile != null && !this.idcontratSiteVigile.equals(other.idcontratSiteVigile))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.ContratSiteVigile[ idcontratSiteVigile=" + idcontratSiteVigile + " ]";
    }
    
}
