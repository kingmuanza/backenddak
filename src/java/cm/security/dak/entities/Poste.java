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
@Table(name = "poste")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Poste.findAll", query = "SELECT p FROM Poste p"),
    @NamedQuery(name = "Poste.findByIdposte", query = "SELECT p FROM Poste p WHERE p.idposte = :idposte"),
    @NamedQuery(name = "Poste.findByCode", query = "SELECT p FROM Poste p WHERE p.code = :code"),
    @NamedQuery(name = "Poste.findByLibelle", query = "SELECT p FROM Poste p WHERE p.libelle = :libelle"),
    @NamedQuery(name = "Poste.findByZoneJour", query = "SELECT p FROM Poste p WHERE p.zoneJour = :zoneJour"),
    @NamedQuery(name = "Poste.findByZoneNuit", query = "SELECT p FROM Poste p WHERE p.zoneNuit = :zoneNuit"),
    @NamedQuery(name = "Poste.findByContrat", query = "SELECT p FROM Poste p WHERE p.contrat = :contrat"),
    @NamedQuery(name = "Poste.findByDebutContrat", query = "SELECT p FROM Poste p WHERE p.debutContrat = :debutContrat"),
    @NamedQuery(name = "Poste.findByFinContrat", query = "SELECT p FROM Poste p WHERE p.finContrat = :finContrat"),
    @NamedQuery(name = "Poste.findByNombreVigileJour", query = "SELECT p FROM Poste p WHERE p.nombreVigileJour = :nombreVigileJour"),
    @NamedQuery(name = "Poste.findByNombreVigileNuit", query = "SELECT p FROM Poste p WHERE p.nombreVigileNuit = :nombreVigileNuit"),
    @NamedQuery(name = "Poste.findByNombreMC", query = "SELECT p FROM Poste p WHERE p.nombreMC = :nombreMC"),
    @NamedQuery(name = "Poste.findByNombreESC", query = "SELECT p FROM Poste p WHERE p.nombreESC = :nombreESC"),
    @NamedQuery(name = "Poste.findByNombreRadio", query = "SELECT p FROM Poste p WHERE p.nombreRadio = :nombreRadio"),
    @NamedQuery(name = "Poste.findByContact", query = "SELECT p FROM Poste p WHERE p.contact = :contact"),
    @NamedQuery(name = "Poste.findByTel", query = "SELECT p FROM Poste p WHERE p.tel = :tel"),
    @NamedQuery(name = "Poste.findByPrime", query = "SELECT p FROM Poste p WHERE p.prime = :prime"),
    @NamedQuery(name = "Poste.findByAbrege", query = "SELECT p FROM Poste p WHERE p.abrege = :abrege"),
    @NamedQuery(name = "Poste.findByNote", query = "SELECT p FROM Poste p WHERE p.note = :note"),
    @NamedQuery(name = "Poste.findByLongitude", query = "SELECT p FROM Poste p WHERE p.longitude = :longitude"),
    @NamedQuery(name = "Poste.findByLatitude", query = "SELECT p FROM Poste p WHERE p.latitude = :latitude"),
    @NamedQuery(name = "Poste.findByOrganisme", query = "SELECT p FROM Poste p WHERE p.organisme = :organisme"),
    @NamedQuery(name = "Poste.findByNumero", query = "SELECT p FROM Poste p WHERE p.numero = :numero"),
    @NamedQuery(name = "Poste.findByDescription", query = "SELECT p FROM Poste p WHERE p.description = :description"),
    @NamedQuery(name = "Poste.findByBon", query = "SELECT p FROM Poste p WHERE p.bon = :bon"),
    @NamedQuery(name = "Poste.findByHoraire", query = "SELECT p FROM Poste p WHERE p.horaire = :horaire"),
    @NamedQuery(name = "Poste.findByStatut", query = "SELECT p FROM Poste p WHERE p.statut = :statut")})
public class Poste implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idposte")
    private Integer idposte;
    @Size(max = 45)
    @Column(name = "code")
    private String code;
    @Size(max = 45)
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "zone_jour")
    private Integer zoneJour;
    @Column(name = "zone_nuit")
    private Integer zoneNuit;
    @Size(max = 45)
    @Column(name = "contrat")
    private String contrat;
    @Column(name = "debut_contrat")
    @Temporal(TemporalType.DATE)
    private Date debutContrat;
    @Column(name = "fin_contrat")
    @Temporal(TemporalType.DATE)
    private Date finContrat;
    @Column(name = "nombre_vigile_jour")
    private Integer nombreVigileJour;
    @Column(name = "nombre_vigile_nuit")
    private Integer nombreVigileNuit;
    @Column(name = "nombre_MC")
    private Integer nombreMC;
    @Column(name = "nombre_ESC")
    private Integer nombreESC;
    @Column(name = "nombre_radio")
    private Integer nombreRadio;
    @Size(max = 45)
    @Column(name = "contact")
    private String contact;
    @Size(max = 45)
    @Column(name = "tel")
    private String tel;
    @Column(name = "prime")
    private Boolean prime;
    @Size(max = 45)
    @Column(name = "abrege")
    private String abrege;
    @Column(name = "note")
    private Integer note;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "organisme")
    private Boolean organisme;
    @Column(name = "numero")
    private Integer numero;
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    @Column(name = "bon")
    private Boolean bon;
    @Size(max = 45)
    @Column(name = "horaire")
    private String horaire;
    @Size(max = 45)
    @Column(name = "statut")
    private String statut;
    @OneToMany(mappedBy = "idposte")
    private Collection<Affectation> affectationCollection;
    @OneToMany(mappedBy = "poste")
    private Collection<SuiviPoste> suiviPosteCollection;
    @OneToMany(mappedBy = "idposte")
    private Collection<PosteVigile> posteVigileCollection;
    @JoinColumn(name = "idcontratsite", referencedColumnName = "idcontrat_site")
    @ManyToOne
    private ContratSite idcontratsite;
    @JoinColumn(name = "idquartier", referencedColumnName = "idquartier")
    @ManyToOne
    private Quartier idquartier;
    @JoinColumn(name = "zone", referencedColumnName = "idzone")
    @ManyToOne
    private Zone zone;
    @OneToMany(mappedBy = "idposte")
    private Collection<PosteEquipement> posteEquipementCollection;

    public Poste() {
    }

    public Poste(Integer idposte) {
        this.idposte = idposte;
    }

    public Integer getIdposte() {
        return idposte;
    }

    public void setIdposte(Integer idposte) {
        this.idposte = idposte;
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

    public Integer getZoneJour() {
        return zoneJour;
    }

    public void setZoneJour(Integer zoneJour) {
        this.zoneJour = zoneJour;
    }

    public Integer getZoneNuit() {
        return zoneNuit;
    }

    public void setZoneNuit(Integer zoneNuit) {
        this.zoneNuit = zoneNuit;
    }

    public String getContrat() {
        return contrat;
    }

    public void setContrat(String contrat) {
        this.contrat = contrat;
    }

    public Date getDebutContrat() {
        return debutContrat;
    }

    public void setDebutContrat(Date debutContrat) {
        this.debutContrat = debutContrat;
    }

    public Date getFinContrat() {
        return finContrat;
    }

    public void setFinContrat(Date finContrat) {
        this.finContrat = finContrat;
    }

    public Integer getNombreVigileJour() {
        return nombreVigileJour;
    }

    public void setNombreVigileJour(Integer nombreVigileJour) {
        this.nombreVigileJour = nombreVigileJour;
    }

    public Integer getNombreVigileNuit() {
        return nombreVigileNuit;
    }

    public void setNombreVigileNuit(Integer nombreVigileNuit) {
        this.nombreVigileNuit = nombreVigileNuit;
    }

    public Integer getNombreMC() {
        return nombreMC;
    }

    public void setNombreMC(Integer nombreMC) {
        this.nombreMC = nombreMC;
    }

    public Integer getNombreESC() {
        return nombreESC;
    }

    public void setNombreESC(Integer nombreESC) {
        this.nombreESC = nombreESC;
    }

    public Integer getNombreRadio() {
        return nombreRadio;
    }

    public void setNombreRadio(Integer nombreRadio) {
        this.nombreRadio = nombreRadio;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Boolean getPrime() {
        return prime;
    }

    public void setPrime(Boolean prime) {
        this.prime = prime;
    }

    public String getAbrege() {
        return abrege;
    }

    public void setAbrege(String abrege) {
        this.abrege = abrege;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
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

    public Boolean getOrganisme() {
        return organisme;
    }

    public void setOrganisme(Boolean organisme) {
        this.organisme = organisme;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getBon() {
        return bon;
    }

    public void setBon(Boolean bon) {
        this.bon = bon;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @XmlTransient
    public Collection<Affectation> getAffectationCollection() {
        return affectationCollection;
    }

    public void setAffectationCollection(Collection<Affectation> affectationCollection) {
        this.affectationCollection = affectationCollection;
    }

    @XmlTransient
    public Collection<SuiviPoste> getSuiviPosteCollection() {
        return suiviPosteCollection;
    }

    public void setSuiviPosteCollection(Collection<SuiviPoste> suiviPosteCollection) {
        this.suiviPosteCollection = suiviPosteCollection;
    }

    @XmlTransient
    public Collection<PosteVigile> getPosteVigileCollection() {
        return posteVigileCollection;
    }

    public void setPosteVigileCollection(Collection<PosteVigile> posteVigileCollection) {
        this.posteVigileCollection = posteVigileCollection;
    }

    public ContratSite getIdcontratsite() {
        return idcontratsite;
    }

    public void setIdcontratsite(ContratSite idcontratsite) {
        this.idcontratsite = idcontratsite;
    }

    public Quartier getIdquartier() {
        return idquartier;
    }

    public void setIdquartier(Quartier idquartier) {
        this.idquartier = idquartier;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
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
        hash += (idposte != null ? idposte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Poste)) {
            return false;
        }
        Poste other = (Poste) object;
        if ((this.idposte == null && other.idposte != null) || (this.idposte != null && !this.idposte.equals(other.idposte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.Poste[ idposte=" + idposte + " ]";
    }
    
}
