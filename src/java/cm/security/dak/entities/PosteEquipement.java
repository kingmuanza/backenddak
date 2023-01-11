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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Muanza Kangudie
 */
@Entity
@Table(name = "poste_equipement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PosteEquipement.findAll", query = "SELECT p FROM PosteEquipement p"),
    @NamedQuery(name = "PosteEquipement.findByIdposteEquipement", query = "SELECT p FROM PosteEquipement p WHERE p.idposteEquipement = :idposteEquipement"),
    @NamedQuery(name = "PosteEquipement.findByQuantite", query = "SELECT p FROM PosteEquipement p WHERE p.quantite = :quantite")})
public class PosteEquipement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idposte_equipement")
    private Integer idposteEquipement;
    @Column(name = "quantite")
    private Integer quantite;
    @JoinColumn(name = "idequipement", referencedColumnName = "idequipement")
    @ManyToOne
    private Equipement idequipement;
    @JoinColumn(name = "idposte", referencedColumnName = "idposte")
    @ManyToOne
    private Poste idposte;

    public PosteEquipement() {
    }

    public PosteEquipement(Integer idposteEquipement) {
        this.idposteEquipement = idposteEquipement;
    }

    public Integer getIdposteEquipement() {
        return idposteEquipement;
    }

    public void setIdposteEquipement(Integer idposteEquipement) {
        this.idposteEquipement = idposteEquipement;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Equipement getIdequipement() {
        return idequipement;
    }

    public void setIdequipement(Equipement idequipement) {
        this.idequipement = idequipement;
    }

    public Poste getIdposte() {
        return idposte;
    }

    public void setIdposte(Poste idposte) {
        this.idposte = idposte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idposteEquipement != null ? idposteEquipement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PosteEquipement)) {
            return false;
        }
        PosteEquipement other = (PosteEquipement) object;
        if ((this.idposteEquipement == null && other.idposteEquipement != null) || (this.idposteEquipement != null && !this.idposteEquipement.equals(other.idposteEquipement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.PosteEquipement[ idposteEquipement=" + idposteEquipement + " ]";
    }
    
}
