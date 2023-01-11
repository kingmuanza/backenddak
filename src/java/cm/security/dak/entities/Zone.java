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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "zone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zone.findAll", query = "SELECT z FROM Zone z"),
    @NamedQuery(name = "Zone.findByIdzone", query = "SELECT z FROM Zone z WHERE z.idzone = :idzone"),
    @NamedQuery(name = "Zone.findByCode", query = "SELECT z FROM Zone z WHERE z.code = :code"),
    @NamedQuery(name = "Zone.findByLibelle", query = "SELECT z FROM Zone z WHERE z.libelle = :libelle"),
    @NamedQuery(name = "Zone.findByHoraire", query = "SELECT z FROM Zone z WHERE z.horaire = :horaire")})
public class Zone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idzone")
    private Integer idzone;
    @Size(max = 45)
    @Column(name = "code")
    private String code;
    @Size(max = 45)
    @Column(name = "libelle")
    private String libelle;
    @Size(max = 45)
    @Column(name = "horaire")
    private String horaire;
    @OneToMany(mappedBy = "zone")
    private Collection<SuiviPoste> suiviPosteCollection;
    @JoinColumn(name = "idville", referencedColumnName = "idville")
    @ManyToOne
    private Ville idville;
    @OneToMany(mappedBy = "idzone")
    private Collection<Quartier> quartierCollection;
    @OneToMany(mappedBy = "zone")
    private Collection<Poste> posteCollection;
    @OneToMany(mappedBy = "zone")
    private Collection<Vigile> vigileCollection;

    public Zone() {
    }

    public Zone(Integer idzone) {
        this.idzone = idzone;
    }

    public Integer getIdzone() {
        return idzone;
    }

    public void setIdzone(Integer idzone) {
        this.idzone = idzone;
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

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    @XmlTransient
    public Collection<SuiviPoste> getSuiviPosteCollection() {
        return suiviPosteCollection;
    }

    public void setSuiviPosteCollection(Collection<SuiviPoste> suiviPosteCollection) {
        this.suiviPosteCollection = suiviPosteCollection;
    }

    public Ville getIdville() {
        return idville;
    }

    public void setIdville(Ville idville) {
        this.idville = idville;
    }

    @XmlTransient
    public Collection<Quartier> getQuartierCollection() {
        return quartierCollection;
    }

    public void setQuartierCollection(Collection<Quartier> quartierCollection) {
        this.quartierCollection = quartierCollection;
    }

    @XmlTransient
    public Collection<Poste> getPosteCollection() {
        return posteCollection;
    }

    public void setPosteCollection(Collection<Poste> posteCollection) {
        this.posteCollection = posteCollection;
    }

    @XmlTransient
    public Collection<Vigile> getVigileCollection() {
        return vigileCollection;
    }

    public void setVigileCollection(Collection<Vigile> vigileCollection) {
        this.vigileCollection = vigileCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idzone != null ? idzone.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zone)) {
            return false;
        }
        Zone other = (Zone) object;
        if ((this.idzone == null && other.idzone != null) || (this.idzone != null && !this.idzone.equals(other.idzone))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.Zone[ idzone=" + idzone + " ]";
    }
    
}
