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
import javax.persistence.Lob;
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
@Table(name = "contrat_site")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContratSite.findAll", query = "SELECT c FROM ContratSite c"),
    @NamedQuery(name = "ContratSite.findByIdcontratSite", query = "SELECT c FROM ContratSite c WHERE c.idcontratSite = :idcontratSite"),
    @NamedQuery(name = "ContratSite.findByNom", query = "SELECT c FROM ContratSite c WHERE c.nom = :nom"),
    @NamedQuery(name = "ContratSite.findByLocalisation", query = "SELECT c FROM ContratSite c WHERE c.localisation = :localisation"),
    @NamedQuery(name = "ContratSite.findByPersonne", query = "SELECT c FROM ContratSite c WHERE c.personne = :personne"),
    @NamedQuery(name = "ContratSite.findByTel", query = "SELECT c FROM ContratSite c WHERE c.tel = :tel"),
    @NamedQuery(name = "ContratSite.findByLongitude", query = "SELECT c FROM ContratSite c WHERE c.longitude = :longitude"),
    @NamedQuery(name = "ContratSite.findByLatitude", query = "SELECT c FROM ContratSite c WHERE c.latitude = :latitude")})
public class ContratSite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontrat_site")
    private Integer idcontratSite;
    @Size(max = 45)
    @Column(name = "nom")
    private String nom;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;
    @Size(max = 45)
    @Column(name = "localisation")
    private String localisation;
    @Size(max = 45)
    @Column(name = "personne")
    private String personne;
    @Size(max = 45)
    @Column(name = "tel")
    private String tel;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "latitude")
    private Double latitude;
    @JoinColumn(name = "idcontrat", referencedColumnName = "idcontrat")
    @ManyToOne
    private Contrat idcontrat;
    @JoinColumn(name = "idquartier", referencedColumnName = "idquartier")
    @ManyToOne
    private Quartier idquartier;
    @OneToMany(mappedBy = "idcontratsite")
    private Collection<ContratSiteVigile> contratSiteVigileCollection;
    @OneToMany(mappedBy = "idcontratsite")
    private Collection<Poste> posteCollection;

    public ContratSite() {
    }

    public ContratSite(Integer idcontratSite) {
        this.idcontratSite = idcontratSite;
    }

    public Integer getIdcontratSite() {
        return idcontratSite;
    }

    public void setIdcontratSite(Integer idcontratSite) {
        this.idcontratSite = idcontratSite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getPersonne() {
        return personne;
    }

    public void setPersonne(String personne) {
        this.personne = personne;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Contrat getIdcontrat() {
        return idcontrat;
    }

    public void setIdcontrat(Contrat idcontrat) {
        this.idcontrat = idcontrat;
    }

    public Quartier getIdquartier() {
        return idquartier;
    }

    public void setIdquartier(Quartier idquartier) {
        this.idquartier = idquartier;
    }

    @XmlTransient
    public Collection<ContratSiteVigile> getContratSiteVigileCollection() {
        return contratSiteVigileCollection;
    }

    public void setContratSiteVigileCollection(Collection<ContratSiteVigile> contratSiteVigileCollection) {
        this.contratSiteVigileCollection = contratSiteVigileCollection;
    }

    @XmlTransient
    public Collection<Poste> getPosteCollection() {
        return posteCollection;
    }

    public void setPosteCollection(Collection<Poste> posteCollection) {
        this.posteCollection = posteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontratSite != null ? idcontratSite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContratSite)) {
            return false;
        }
        ContratSite other = (ContratSite) object;
        if ((this.idcontratSite == null && other.idcontratSite != null) || (this.idcontratSite != null && !this.idcontratSite.equals(other.idcontratSite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.ContratSite[ idcontratSite=" + idcontratSite + " ]";
    }
    
}
