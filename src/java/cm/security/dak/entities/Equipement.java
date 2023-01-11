/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cm.security.dak.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Muanza Kangudie
 */
@Entity
@Table(name = "equipement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipement.findAll", query = "SELECT e FROM Equipement e"),
    @NamedQuery(name = "Equipement.findByIdequipement", query = "SELECT e FROM Equipement e WHERE e.idequipement = :idequipement"),
    @NamedQuery(name = "Equipement.findByCode", query = "SELECT e FROM Equipement e WHERE e.code = :code"),
    @NamedQuery(name = "Equipement.findByLibelle", query = "SELECT e FROM Equipement e WHERE e.libelle = :libelle"),
    @NamedQuery(name = "Equipement.findByBasique", query = "SELECT e FROM Equipement e WHERE e.basique = :basique"),
    @NamedQuery(name = "Equipement.findByDefaut", query = "SELECT e FROM Equipement e WHERE e.defaut = :defaut")})
public class Equipement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idequipement")
    private Integer idequipement;
    @Size(max = 25)
    @Column(name = "code")
    private String code;
    @Size(max = 255)
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "basique")
    private Boolean basique;
    @Column(name = "defaut")
    private Integer defaut;
    @OneToMany(mappedBy = "idequipement")
    private Collection<EquipementVigile> equipementVigileCollection;
    @OneToMany(mappedBy = "idequipement")
    private Collection<PosteEquipement> posteEquipementCollection;

    public Equipement() {
    }

    public Equipement(Integer idequipement) {
        this.idequipement = idequipement;
    }

    public Integer getIdequipement() {
        return idequipement;
    }

    public void setIdequipement(Integer idequipement) {
        this.idequipement = idequipement;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Boolean getBasique() {
        return basique;
    }

    public void setBasique(Boolean basique) {
        this.basique = basique;
    }

    public Integer getDefaut() {
        return defaut;
    }

    public void setDefaut(Integer defaut) {
        this.defaut = defaut;
    }

    @XmlTransient
    public Collection<EquipementVigile> getEquipementVigileCollection() {
        return equipementVigileCollection;
    }

    public void setEquipementVigileCollection(Collection<EquipementVigile> equipementVigileCollection) {
        this.equipementVigileCollection = equipementVigileCollection;
    }

    @XmlTransient
    public Collection<PosteEquipement> getPosteEquipementCollection() {
        return posteEquipementCollection;
    }

    public void setPosteEquipementCollection(Collection<PosteEquipement> posteEquipementCollection) {
        this.posteEquipementCollection = posteEquipementCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idequipement != null ? idequipement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipement)) {
            return false;
        }
        Equipement other = (Equipement) object;
        if ((this.idequipement == null && other.idequipement != null) || (this.idequipement != null && !this.idequipement.equals(other.idequipement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.Equipement[ idequipement=" + idequipement + " ]";
    }
    
}
