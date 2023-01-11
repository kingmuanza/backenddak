/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cm.security.dak.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Muanza Kangudie
 */
@Entity
@Table(name = "equipement_vigile")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EquipementVigile.findAll", query = "SELECT e FROM EquipementVigile e"),
    @NamedQuery(name = "EquipementVigile.findByIdequipementVigile", query = "SELECT e FROM EquipementVigile e WHERE e.idequipementVigile = :idequipementVigile"),
    @NamedQuery(name = "EquipementVigile.findByQuantite", query = "SELECT e FROM EquipementVigile e WHERE e.quantite = :quantite"),
    @NamedQuery(name = "EquipementVigile.findByRestituee", query = "SELECT e FROM EquipementVigile e WHERE e.restituee = :restituee")})
public class EquipementVigile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "idequipement_vigile")
    private String idequipementVigile;
    @Column(name = "quantite")
    private Integer quantite;
    @Column(name = "restituee")
    private Boolean restituee;
    @JoinColumn(name = "idequipement", referencedColumnName = "idequipement")
    @ManyToOne
    private Equipement idequipement;
    @JoinColumn(name = "idvigile", referencedColumnName = "idvigile")
    @ManyToOne
    private Vigile idvigile;

    public EquipementVigile() {
    }

    public EquipementVigile(String idequipementVigile) {
        this.idequipementVigile = idequipementVigile;
    }

    public String getIdequipementVigile() {
        return idequipementVigile;
    }

    public void setIdequipementVigile(String idequipementVigile) {
        this.idequipementVigile = idequipementVigile;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Boolean getRestituee() {
        return restituee;
    }

    public void setRestituee(Boolean restituee) {
        this.restituee = restituee;
    }

    public Equipement getIdequipement() {
        return idequipement;
    }

    public void setIdequipement(Equipement idequipement) {
        this.idequipement = idequipement;
    }

    public Vigile getIdvigile() {
        return idvigile;
    }

    public void setIdvigile(Vigile idvigile) {
        this.idvigile = idvigile;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idequipementVigile != null ? idequipementVigile.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquipementVigile)) {
            return false;
        }
        EquipementVigile other = (EquipementVigile) object;
        if ((this.idequipementVigile == null && other.idequipementVigile != null) || (this.idequipementVigile != null && !this.idequipementVigile.equals(other.idequipementVigile))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.EquipementVigile[ idequipementVigile=" + idequipementVigile + " ]";
    }
    
}
