/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cm.security.dak.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Muanza Kangudie
 */
@Entity
@Table(name = "affectation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Affectation.findAll", query = "SELECT a FROM Affectation a"),
    @NamedQuery(name = "Affectation.findByIdaffectation", query = "SELECT a FROM Affectation a WHERE a.idaffectation = :idaffectation"),
    @NamedQuery(name = "Affectation.findByDateAffectation", query = "SELECT a FROM Affectation a WHERE a.dateAffectation = :dateAffectation"),
    @NamedQuery(name = "Affectation.findByQualite", query = "SELECT a FROM Affectation a WHERE a.qualite = :qualite"),
    @NamedQuery(name = "Affectation.findByHoraire", query = "SELECT a FROM Affectation a WHERE a.horaire = :horaire"),
    @NamedQuery(name = "Affectation.findByType", query = "SELECT a FROM Affectation a WHERE a.type = :type"),
    @NamedQuery(name = "Affectation.findByJourRepos", query = "SELECT a FROM Affectation a WHERE a.jourRepos = :jourRepos"),
    @NamedQuery(name = "Affectation.findByArret", query = "SELECT a FROM Affectation a WHERE a.arret = :arret"),
    @NamedQuery(name = "Affectation.findByJourPl", query = "SELECT a FROM Affectation a WHERE a.jourPl = :jourPl")})
public class Affectation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idaffectation")
    private Integer idaffectation;
    @Column(name = "date_affectation")
    @Temporal(TemporalType.DATE)
    private Date dateAffectation;
    @Size(max = 45)
    @Column(name = "qualite")
    private String qualite;
    @Size(max = 45)
    @Column(name = "horaire")
    private String horaire;
    @Size(max = 45)
    @Column(name = "type")
    private String type;
    @Size(max = 45)
    @Column(name = "jour_repos")
    private String jourRepos;
    @Column(name = "arret")
    @Temporal(TemporalType.DATE)
    private Date arret;
    @Size(max = 45)
    @Column(name = "jour_pl")
    private String jourPl;
    @JoinColumn(name = "idposte", referencedColumnName = "idposte")
    @ManyToOne
    private Poste idposte;
    @JoinColumn(name = "placement", referencedColumnName = "idvigile")
    @ManyToOne
    private Vigile placement;
    @JoinColumn(name = "remplacant", referencedColumnName = "idvigile")
    @ManyToOne
    private Vigile remplacant;
    @JoinColumn(name = "idvigile", referencedColumnName = "idvigile")
    @ManyToOne
    private Vigile idvigile;
    @OneToMany(mappedBy = "idaffectation")
    private Collection<Switch> switchCollection;

    public Affectation() {
    }

    public Affectation(Integer idaffectation) {
        this.idaffectation = idaffectation;
    }

    public Integer getIdaffectation() {
        return idaffectation;
    }

    public void setIdaffectation(Integer idaffectation) {
        this.idaffectation = idaffectation;
    }

    public Date getDateAffectation() {
        return dateAffectation;
    }

    public void setDateAffectation(Date dateAffectation) {
        this.dateAffectation = dateAffectation;
    }

    public String getQualite() {
        return qualite;
    }

    public void setQualite(String qualite) {
        this.qualite = qualite;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getJourRepos() {
        return jourRepos;
    }

    public void setJourRepos(String jourRepos) {
        this.jourRepos = jourRepos;
    }

    public Date getArret() {
        return arret;
    }

    public void setArret(Date arret) {
        this.arret = arret;
    }

    public String getJourPl() {
        return jourPl;
    }

    public void setJourPl(String jourPl) {
        this.jourPl = jourPl;
    }

    public Poste getIdposte() {
        return idposte;
    }

    public void setIdposte(Poste idposte) {
        this.idposte = idposte;
    }

    public Vigile getPlacement() {
        return placement;
    }

    public void setPlacement(Vigile placement) {
        this.placement = placement;
    }

    public Vigile getRemplacant() {
        return remplacant;
    }

    public void setRemplacant(Vigile remplacant) {
        this.remplacant = remplacant;
    }

    public Vigile getIdvigile() {
        return idvigile;
    }

    public void setIdvigile(Vigile idvigile) {
        this.idvigile = idvigile;
    }

    @XmlTransient
    public Collection<Switch> getSwitchCollection() {
        return switchCollection;
    }

    public void setSwitchCollection(Collection<Switch> switchCollection) {
        this.switchCollection = switchCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idaffectation != null ? idaffectation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Affectation)) {
            return false;
        }
        Affectation other = (Affectation) object;
        if ((this.idaffectation == null && other.idaffectation != null) || (this.idaffectation != null && !this.idaffectation.equals(other.idaffectation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.Affectation[ idaffectation=" + idaffectation + " ]";
    }
    
}
