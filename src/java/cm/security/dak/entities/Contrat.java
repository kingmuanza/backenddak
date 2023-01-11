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
@Table(name = "contrat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contrat.findAll", query = "SELECT c FROM Contrat c"),
    @NamedQuery(name = "Contrat.findByIdcontrat", query = "SELECT c FROM Contrat c WHERE c.idcontrat = :idcontrat"),
    @NamedQuery(name = "Contrat.findByLibelle", query = "SELECT c FROM Contrat c WHERE c.libelle = :libelle"),
    @NamedQuery(name = "Contrat.findByLocalisation", query = "SELECT c FROM Contrat c WHERE c.localisation = :localisation"),
    @NamedQuery(name = "Contrat.findByDateSignature", query = "SELECT c FROM Contrat c WHERE c.dateSignature = :dateSignature"),
    @NamedQuery(name = "Contrat.findByDateDebut", query = "SELECT c FROM Contrat c WHERE c.dateDebut = :dateDebut"),
    @NamedQuery(name = "Contrat.findByDateFin", query = "SELECT c FROM Contrat c WHERE c.dateFin = :dateFin"),
    @NamedQuery(name = "Contrat.findByReference", query = "SELECT c FROM Contrat c WHERE c.reference = :reference"),
    @NamedQuery(name = "Contrat.findByDescription", query = "SELECT c FROM Contrat c WHERE c.description = :description"),
    @NamedQuery(name = "Contrat.findByNbPostes", query = "SELECT c FROM Contrat c WHERE c.nbPostes = :nbPostes"),
    @NamedQuery(name = "Contrat.findByNbVigileJour", query = "SELECT c FROM Contrat c WHERE c.nbVigileJour = :nbVigileJour"),
    @NamedQuery(name = "Contrat.findByNbVigileNuit", query = "SELECT c FROM Contrat c WHERE c.nbVigileNuit = :nbVigileNuit"),
    @NamedQuery(name = "Contrat.findByNoms", query = "SELECT c FROM Contrat c WHERE c.noms = :noms"),
    @NamedQuery(name = "Contrat.findByNom", query = "SELECT c FROM Contrat c WHERE c.nom = :nom"),
    @NamedQuery(name = "Contrat.findByPrenom", query = "SELECT c FROM Contrat c WHERE c.prenom = :prenom"),
    @NamedQuery(name = "Contrat.findByTel", query = "SELECT c FROM Contrat c WHERE c.tel = :tel"),
    @NamedQuery(name = "Contrat.findByEmail", query = "SELECT c FROM Contrat c WHERE c.email = :email"),
    @NamedQuery(name = "Contrat.findByNumero", query = "SELECT c FROM Contrat c WHERE c.numero = :numero"),
    @NamedQuery(name = "Contrat.findByRaisonSociale", query = "SELECT c FROM Contrat c WHERE c.raisonSociale = :raisonSociale"),
    @NamedQuery(name = "Contrat.findByAdresse", query = "SELECT c FROM Contrat c WHERE c.adresse = :adresse"),
    @NamedQuery(name = "Contrat.findByParticulier", query = "SELECT c FROM Contrat c WHERE c.particulier = :particulier"),
    @NamedQuery(name = "Contrat.findByDate", query = "SELECT c FROM Contrat c WHERE c.date = :date"),
    @NamedQuery(name = "Contrat.findByBon", query = "SELECT c FROM Contrat c WHERE c.bon = :bon"),
    @NamedQuery(name = "Contrat.findByMontant", query = "SELECT c FROM Contrat c WHERE c.montant = :montant"),
    @NamedQuery(name = "Contrat.findByIr", query = "SELECT c FROM Contrat c WHERE c.ir = :ir"),
    @NamedQuery(name = "Contrat.findByRepresentant", query = "SELECT c FROM Contrat c WHERE c.representant = :representant"),
    @NamedQuery(name = "Contrat.findByStatut", query = "SELECT c FROM Contrat c WHERE c.statut = :statut")})
public class Contrat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontrat")
    private Integer idcontrat;
    @Size(max = 45)
    @Column(name = "libelle")
    private String libelle;
    @Size(max = 255)
    @Column(name = "localisation")
    private String localisation;
    @Column(name = "date_signature")
    @Temporal(TemporalType.DATE)
    private Date dateSignature;
    @Column(name = "date_debut")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Column(name = "date_fin")
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @Size(max = 45)
    @Column(name = "reference")
    private String reference;
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    @Column(name = "nb_postes")
    private Integer nbPostes;
    @Column(name = "nb_vigile_jour")
    private Integer nbVigileJour;
    @Column(name = "nb_vigile_nuit")
    private Integer nbVigileNuit;
    @Size(max = 45)
    @Column(name = "noms")
    private String noms;
    @Size(max = 45)
    @Column(name = "nom")
    private String nom;
    @Size(max = 45)
    @Column(name = "prenom")
    private String prenom;
    @Size(max = 45)
    @Column(name = "tel")
    private String tel;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @Size(max = 45)
    @Column(name = "numero")
    private String numero;
    @Size(max = 45)
    @Column(name = "raison_sociale")
    private String raisonSociale;
    @Size(max = 255)
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "particulier")
    private Boolean particulier;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "bon")
    private Boolean bon;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "montant")
    private Double montant;
    @Column(name = "ir")
    private Double ir;
    @Size(max = 45)
    @Column(name = "representant")
    private String representant;
    @Size(max = 45)
    @Column(name = "statut")
    private String statut;
    @OneToMany(mappedBy = "idcontrat")
    private Collection<ContratSite> contratSiteCollection;
    @OneToMany(mappedBy = "idparent")
    private Collection<Contrat> contratCollection;
    @JoinColumn(name = "idparent", referencedColumnName = "idcontrat")
    @ManyToOne
    private Contrat idparent;

    public Contrat() {
    }

    public Contrat(Integer idcontrat) {
        this.idcontrat = idcontrat;
    }

    public Integer getIdcontrat() {
        return idcontrat;
    }

    public void setIdcontrat(Integer idcontrat) {
        this.idcontrat = idcontrat;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public Date getDateSignature() {
        return dateSignature;
    }

    public void setDateSignature(Date dateSignature) {
        this.dateSignature = dateSignature;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNbPostes() {
        return nbPostes;
    }

    public void setNbPostes(Integer nbPostes) {
        this.nbPostes = nbPostes;
    }

    public Integer getNbVigileJour() {
        return nbVigileJour;
    }

    public void setNbVigileJour(Integer nbVigileJour) {
        this.nbVigileJour = nbVigileJour;
    }

    public Integer getNbVigileNuit() {
        return nbVigileNuit;
    }

    public void setNbVigileNuit(Integer nbVigileNuit) {
        this.nbVigileNuit = nbVigileNuit;
    }

    public String getNoms() {
        return noms;
    }

    public void setNoms(String noms) {
        this.noms = noms;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Boolean getParticulier() {
        return particulier;
    }

    public void setParticulier(Boolean particulier) {
        this.particulier = particulier;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getBon() {
        return bon;
    }

    public void setBon(Boolean bon) {
        this.bon = bon;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Double getIr() {
        return ir;
    }

    public void setIr(Double ir) {
        this.ir = ir;
    }

    public String getRepresentant() {
        return representant;
    }

    public void setRepresentant(String representant) {
        this.representant = representant;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @XmlTransient
    public Collection<ContratSite> getContratSiteCollection() {
        return contratSiteCollection;
    }

    public void setContratSiteCollection(Collection<ContratSite> contratSiteCollection) {
        this.contratSiteCollection = contratSiteCollection;
    }

    @XmlTransient
    public Collection<Contrat> getContratCollection() {
        return contratCollection;
    }

    public void setContratCollection(Collection<Contrat> contratCollection) {
        this.contratCollection = contratCollection;
    }

    public Contrat getIdparent() {
        return idparent;
    }

    public void setIdparent(Contrat idparent) {
        this.idparent = idparent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontrat != null ? idcontrat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrat)) {
            return false;
        }
        Contrat other = (Contrat) object;
        if ((this.idcontrat == null && other.idcontrat != null) || (this.idcontrat != null && !this.idcontrat.equals(other.idcontrat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.Contrat[ idcontrat=" + idcontrat + " ]";
    }
    
}
