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
@Table(name = "vigile")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vigile.findAll", query = "SELECT v FROM Vigile v"),
    @NamedQuery(name = "Vigile.findByIdvigile", query = "SELECT v FROM Vigile v WHERE v.idvigile = :idvigile"),
    @NamedQuery(name = "Vigile.findByNumero", query = "SELECT v FROM Vigile v WHERE v.numero = :numero"),
    @NamedQuery(name = "Vigile.findByMatricule", query = "SELECT v FROM Vigile v WHERE v.matricule = :matricule"),
    @NamedQuery(name = "Vigile.findByNoms", query = "SELECT v FROM Vigile v WHERE v.noms = :noms"),
    @NamedQuery(name = "Vigile.findByRefPaie0", query = "SELECT v FROM Vigile v WHERE v.refPaie0 = :refPaie0"),
    @NamedQuery(name = "Vigile.findByRefPaie", query = "SELECT v FROM Vigile v WHERE v.refPaie = :refPaie"),
    @NamedQuery(name = "Vigile.findByStatutPaie", query = "SELECT v FROM Vigile v WHERE v.statutPaie = :statutPaie"),
    @NamedQuery(name = "Vigile.findByDteNce", query = "SELECT v FROM Vigile v WHERE v.dteNce = :dteNce"),
    @NamedQuery(name = "Vigile.findByMumCni", query = "SELECT v FROM Vigile v WHERE v.mumCni = :mumCni"),
    @NamedQuery(name = "Vigile.findByTel", query = "SELECT v FROM Vigile v WHERE v.tel = :tel"),
    @NamedQuery(name = "Vigile.findByFonction", query = "SELECT v FROM Vigile v WHERE v.fonction = :fonction"),
    @NamedQuery(name = "Vigile.findByDateEntree", query = "SELECT v FROM Vigile v WHERE v.dateEntree = :dateEntree"),
    @NamedQuery(name = "Vigile.findByDateSortie", query = "SELECT v FROM Vigile v WHERE v.dateSortie = :dateSortie"),
    @NamedQuery(name = "Vigile.findByDebutConge", query = "SELECT v FROM Vigile v WHERE v.debutConge = :debutConge"),
    @NamedQuery(name = "Vigile.findByFinConge", query = "SELECT v FROM Vigile v WHERE v.finConge = :finConge"),
    @NamedQuery(name = "Vigile.findByStatut", query = "SELECT v FROM Vigile v WHERE v.statut = :statut"),
    @NamedQuery(name = "Vigile.findByJourRepos", query = "SELECT v FROM Vigile v WHERE v.jourRepos = :jourRepos"),
    @NamedQuery(name = "Vigile.findByParrain", query = "SELECT v FROM Vigile v WHERE v.parrain = :parrain"),
    @NamedQuery(name = "Vigile.findByPhoto", query = "SELECT v FROM Vigile v WHERE v.photo = :photo"),
    @NamedQuery(name = "Vigile.findByPoste", query = "SELECT v FROM Vigile v WHERE v.poste = :poste"),
    @NamedQuery(name = "Vigile.findBySommeil", query = "SELECT v FROM Vigile v WHERE v.sommeil = :sommeil"),
    @NamedQuery(name = "Vigile.findByMotif", query = "SELECT v FROM Vigile v WHERE v.motif = :motif"),
    @NamedQuery(name = "Vigile.findByNom", query = "SELECT v FROM Vigile v WHERE v.nom = :nom"),
    @NamedQuery(name = "Vigile.findByPrenom", query = "SELECT v FROM Vigile v WHERE v.prenom = :prenom"),
    @NamedQuery(name = "Vigile.findByNote", query = "SELECT v FROM Vigile v WHERE v.note = :note"),
    @NamedQuery(name = "Vigile.findByEstRemplacant", query = "SELECT v FROM Vigile v WHERE v.estRemplacant = :estRemplacant"),
    @NamedQuery(name = "Vigile.findByHoraire", query = "SELECT v FROM Vigile v WHERE v.horaire = :horaire"),
    @NamedQuery(name = "Vigile.findByEstRemplacantConge", query = "SELECT v FROM Vigile v WHERE v.estRemplacantConge = :estRemplacantConge"),
    @NamedQuery(name = "Vigile.findByImage", query = "SELECT v FROM Vigile v WHERE v.image = :image"),
    @NamedQuery(name = "Vigile.findByDetteConges", query = "SELECT v FROM Vigile v WHERE v.detteConges = :detteConges"),
    @NamedQuery(name = "Vigile.findByBadge", query = "SELECT v FROM Vigile v WHERE v.badge = :badge")})
public class Vigile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvigile")
    private Integer idvigile;
    @Size(max = 45)
    @Column(name = "numero")
    private String numero;
    @Size(max = 45)
    @Column(name = "matricule")
    private String matricule;
    @Size(max = 45)
    @Column(name = "noms")
    private String noms;
    @Size(max = 45)
    @Column(name = "ref_paie0")
    private String refPaie0;
    @Size(max = 45)
    @Column(name = "ref_paie")
    private String refPaie;
    @Size(max = 45)
    @Column(name = "statut_paie")
    private String statutPaie;
    @Column(name = "dte_nce")
    @Temporal(TemporalType.DATE)
    private Date dteNce;
    @Size(max = 45)
    @Column(name = "mum_cni")
    private String mumCni;
    @Size(max = 45)
    @Column(name = "tel")
    private String tel;
    @Size(max = 45)
    @Column(name = "fonction")
    private String fonction;
    @Column(name = "date_entree")
    @Temporal(TemporalType.DATE)
    private Date dateEntree;
    @Column(name = "date_sortie")
    @Temporal(TemporalType.DATE)
    private Date dateSortie;
    @Column(name = "debut_conge")
    @Temporal(TemporalType.DATE)
    private Date debutConge;
    @Column(name = "fin_conge")
    @Temporal(TemporalType.DATE)
    private Date finConge;
    @Size(max = 45)
    @Column(name = "statut")
    private String statut;
    @Column(name = "jour_repos")
    private Integer jourRepos;
    @Column(name = "parrain")
    private Integer parrain;
    @Size(max = 255)
    @Column(name = "photo")
    private String photo;
    @Column(name = "poste")
    private Integer poste;
    @Size(max = 45)
    @Column(name = "sommeil")
    private String sommeil;
    @Size(max = 45)
    @Column(name = "motif")
    private String motif;
    @Size(max = 45)
    @Column(name = "nom")
    private String nom;
    @Size(max = 45)
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "note")
    private Integer note;
    @Column(name = "est_remplacant")
    private Boolean estRemplacant;
    @Size(max = 45)
    @Column(name = "horaire")
    private String horaire;
    @Column(name = "est_remplacant_conge")
    private Boolean estRemplacantConge;
    @Size(max = 255)
    @Column(name = "image")
    private String image;
    @Column(name = "dette_conges")
    private Integer detteConges;
    @Column(name = "badge")
    private Boolean badge;
    @OneToMany(mappedBy = "idvigile")
    private Collection<EquipementVigile> equipementVigileCollection;
    @OneToMany(mappedBy = "idvigile")
    private Collection<Permission> permissionCollection;
    @OneToMany(mappedBy = "idvigile")
    private Collection<VigileConge> vigileCongeCollection;
    @OneToMany(mappedBy = "placement")
    private Collection<Affectation> affectationCollection;
    @OneToMany(mappedBy = "remplacant")
    private Collection<Affectation> affectationCollection1;
    @OneToMany(mappedBy = "idvigile")
    private Collection<Affectation> affectationCollection2;
    @OneToMany(mappedBy = "idvigileBase")
    private Collection<Switch> switchCollection;
    @OneToMany(mappedBy = "idvigileSwitch")
    private Collection<Switch> switchCollection1;
    @OneToMany(mappedBy = "idvigile")
    private Collection<SuiviPoste> suiviPosteCollection;
    @JoinColumn(name = "nationalite", referencedColumnName = "idnationalite")
    @ManyToOne
    private Nationalite nationalite;
    @JoinColumn(name = "quartier", referencedColumnName = "idquartier")
    @ManyToOne
    private Quartier quartier;
    @OneToMany(mappedBy = "idremplacantConge")
    private Collection<Vigile> vigileCollection;
    @JoinColumn(name = "idremplacant_conge", referencedColumnName = "idvigile")
    @ManyToOne
    private Vigile idremplacantConge;
    @JoinColumn(name = "ville", referencedColumnName = "idville")
    @ManyToOne
    private Ville ville;
    @JoinColumn(name = "zone", referencedColumnName = "idzone")
    @ManyToOne
    private Zone zone;

    public Vigile() {
    }

    public Vigile(Integer idvigile) {
        this.idvigile = idvigile;
    }

    public Integer getIdvigile() {
        return idvigile;
    }

    public void setIdvigile(Integer idvigile) {
        this.idvigile = idvigile;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNoms() {
        return noms;
    }

    public void setNoms(String noms) {
        this.noms = noms;
    }

    public String getRefPaie0() {
        return refPaie0;
    }

    public void setRefPaie0(String refPaie0) {
        this.refPaie0 = refPaie0;
    }

    public String getRefPaie() {
        return refPaie;
    }

    public void setRefPaie(String refPaie) {
        this.refPaie = refPaie;
    }

    public String getStatutPaie() {
        return statutPaie;
    }

    public void setStatutPaie(String statutPaie) {
        this.statutPaie = statutPaie;
    }

    public Date getDteNce() {
        return dteNce;
    }

    public void setDteNce(Date dteNce) {
        this.dteNce = dteNce;
    }

    public String getMumCni() {
        return mumCni;
    }

    public void setMumCni(String mumCni) {
        this.mumCni = mumCni;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public Date getDebutConge() {
        return debutConge;
    }

    public void setDebutConge(Date debutConge) {
        this.debutConge = debutConge;
    }

    public Date getFinConge() {
        return finConge;
    }

    public void setFinConge(Date finConge) {
        this.finConge = finConge;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Integer getJourRepos() {
        return jourRepos;
    }

    public void setJourRepos(Integer jourRepos) {
        this.jourRepos = jourRepos;
    }

    public Integer getParrain() {
        return parrain;
    }

    public void setParrain(Integer parrain) {
        this.parrain = parrain;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getPoste() {
        return poste;
    }

    public void setPoste(Integer poste) {
        this.poste = poste;
    }

    public String getSommeil() {
        return sommeil;
    }

    public void setSommeil(String sommeil) {
        this.sommeil = sommeil;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
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

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public Boolean getEstRemplacant() {
        return estRemplacant;
    }

    public void setEstRemplacant(Boolean estRemplacant) {
        this.estRemplacant = estRemplacant;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public Boolean getEstRemplacantConge() {
        return estRemplacantConge;
    }

    public void setEstRemplacantConge(Boolean estRemplacantConge) {
        this.estRemplacantConge = estRemplacantConge;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getDetteConges() {
        return detteConges;
    }

    public void setDetteConges(Integer detteConges) {
        this.detteConges = detteConges;
    }

    public Boolean getBadge() {
        return badge;
    }

    public void setBadge(Boolean badge) {
        this.badge = badge;
    }

    @XmlTransient
    public Collection<EquipementVigile> getEquipementVigileCollection() {
        return equipementVigileCollection;
    }

    public void setEquipementVigileCollection(Collection<EquipementVigile> equipementVigileCollection) {
        this.equipementVigileCollection = equipementVigileCollection;
    }

    @XmlTransient
    public Collection<Permission> getPermissionCollection() {
        return permissionCollection;
    }

    public void setPermissionCollection(Collection<Permission> permissionCollection) {
        this.permissionCollection = permissionCollection;
    }

    @XmlTransient
    public Collection<VigileConge> getVigileCongeCollection() {
        return vigileCongeCollection;
    }

    public void setVigileCongeCollection(Collection<VigileConge> vigileCongeCollection) {
        this.vigileCongeCollection = vigileCongeCollection;
    }

    @XmlTransient
    public Collection<Affectation> getAffectationCollection() {
        return affectationCollection;
    }

    public void setAffectationCollection(Collection<Affectation> affectationCollection) {
        this.affectationCollection = affectationCollection;
    }

    @XmlTransient
    public Collection<Affectation> getAffectationCollection1() {
        return affectationCollection1;
    }

    public void setAffectationCollection1(Collection<Affectation> affectationCollection1) {
        this.affectationCollection1 = affectationCollection1;
    }

    @XmlTransient
    public Collection<Affectation> getAffectationCollection2() {
        return affectationCollection2;
    }

    public void setAffectationCollection2(Collection<Affectation> affectationCollection2) {
        this.affectationCollection2 = affectationCollection2;
    }

    @XmlTransient
    public Collection<Switch> getSwitchCollection() {
        return switchCollection;
    }

    public void setSwitchCollection(Collection<Switch> switchCollection) {
        this.switchCollection = switchCollection;
    }

    @XmlTransient
    public Collection<Switch> getSwitchCollection1() {
        return switchCollection1;
    }

    public void setSwitchCollection1(Collection<Switch> switchCollection1) {
        this.switchCollection1 = switchCollection1;
    }

    @XmlTransient
    public Collection<SuiviPoste> getSuiviPosteCollection() {
        return suiviPosteCollection;
    }

    public void setSuiviPosteCollection(Collection<SuiviPoste> suiviPosteCollection) {
        this.suiviPosteCollection = suiviPosteCollection;
    }

    public Nationalite getNationalite() {
        return nationalite;
    }

    public void setNationalite(Nationalite nationalite) {
        this.nationalite = nationalite;
    }

    public Quartier getQuartier() {
        return quartier;
    }

    public void setQuartier(Quartier quartier) {
        this.quartier = quartier;
    }

    @XmlTransient
    public Collection<Vigile> getVigileCollection() {
        return vigileCollection;
    }

    public void setVigileCollection(Collection<Vigile> vigileCollection) {
        this.vigileCollection = vigileCollection;
    }

    public Vigile getIdremplacantConge() {
        return idremplacantConge;
    }

    public void setIdremplacantConge(Vigile idremplacantConge) {
        this.idremplacantConge = idremplacantConge;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvigile != null ? idvigile.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vigile)) {
            return false;
        }
        Vigile other = (Vigile) object;
        if ((this.idvigile == null && other.idvigile != null) || (this.idvigile != null && !this.idvigile.equals(other.idvigile))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.Vigile[ idvigile=" + idvigile + " ]";
    }
    
}
