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
@Table(name = "quartier")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quartier.findAll", query = "SELECT q FROM Quartier q"),
    @NamedQuery(name = "Quartier.findByIdquartier", query = "SELECT q FROM Quartier q WHERE q.idquartier = :idquartier"),
    @NamedQuery(name = "Quartier.findByCode", query = "SELECT q FROM Quartier q WHERE q.code = :code"),
    @NamedQuery(name = "Quartier.findByNom", query = "SELECT q FROM Quartier q WHERE q.nom = :nom")})
public class Quartier implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idquartier")
    private Integer idquartier;
    @Size(max = 45)
    @Column(name = "code")
    private String code;
    @Size(max = 45)
    @Column(name = "nom")
    private String nom;
    @OneToMany(mappedBy = "idquartier")
    private Collection<ContratSite> contratSiteCollection;
    @JoinColumn(name = "idzone", referencedColumnName = "idzone")
    @ManyToOne
    private Zone idzone;
    @OneToMany(mappedBy = "idquartier")
    private Collection<Poste> posteCollection;
    @OneToMany(mappedBy = "quartier")
    private Collection<Vigile> vigileCollection;

    public Quartier() {
    }

    public Quartier(Integer idquartier) {
        this.idquartier = idquartier;
    }

    public Integer getIdquartier() {
        return idquartier;
    }

    public void setIdquartier(Integer idquartier) {
        this.idquartier = idquartier;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @XmlTransient
    public Collection<ContratSite> getContratSiteCollection() {
        return contratSiteCollection;
    }

    public void setContratSiteCollection(Collection<ContratSite> contratSiteCollection) {
        this.contratSiteCollection = contratSiteCollection;
    }

    public Zone getIdzone() {
        return idzone;
    }

    public void setIdzone(Zone idzone) {
        this.idzone = idzone;
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
        hash += (idquartier != null ? idquartier.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quartier)) {
            return false;
        }
        Quartier other = (Quartier) object;
        if ((this.idquartier == null && other.idquartier != null) || (this.idquartier != null && !this.idquartier.equals(other.idquartier))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.Quartier[ idquartier=" + idquartier + " ]";
    }
    
}
