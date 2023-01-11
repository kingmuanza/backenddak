/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cm.security.dak.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Muanza Kangudie
 */
@Entity
@Table(name = "suivi_poste")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SuiviPoste.findAll", query = "SELECT s FROM SuiviPoste s"),
    @NamedQuery(name = "SuiviPoste.findByIdsuiviPoste", query = "SELECT s FROM SuiviPoste s WHERE s.idsuiviPoste = :idsuiviPoste"),
    @NamedQuery(name = "SuiviPoste.findByDateSuivi", query = "SELECT s FROM SuiviPoste s WHERE s.dateSuivi = :dateSuivi"),
    @NamedQuery(name = "SuiviPoste.findByNumero", query = "SELECT s FROM SuiviPoste s WHERE s.numero = :numero"),
    @NamedQuery(name = "SuiviPoste.findByHoraire", query = "SELECT s FROM SuiviPoste s WHERE s.horaire = :horaire"),
    @NamedQuery(name = "SuiviPoste.findByStatut", query = "SELECT s FROM SuiviPoste s WHERE s.statut = :statut"),
    @NamedQuery(name = "SuiviPoste.findByPl", query = "SELECT s FROM SuiviPoste s WHERE s.pl = :pl"),
    @NamedQuery(name = "SuiviPoste.findByNombreAbsence", query = "SELECT s FROM SuiviPoste s WHERE s.nombreAbsence = :nombreAbsence"),
    @NamedQuery(name = "SuiviPoste.findByMotifAbsence", query = "SELECT s FROM SuiviPoste s WHERE s.motifAbsence = :motifAbsence"),
    @NamedQuery(name = "SuiviPoste.findByNombreSanction", query = "SELECT s FROM SuiviPoste s WHERE s.nombreSanction = :nombreSanction"),
    @NamedQuery(name = "SuiviPoste.findByMotifSanction", query = "SELECT s FROM SuiviPoste s WHERE s.motifSanction = :motifSanction"),
    @NamedQuery(name = "SuiviPoste.findByMontantSanction", query = "SELECT s FROM SuiviPoste s WHERE s.montantSanction = :montantSanction"),
    @NamedQuery(name = "SuiviPoste.findByDateEffet", query = "SELECT s FROM SuiviPoste s WHERE s.dateEffet = :dateEffet")})
public class SuiviPoste implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsuivi_poste")
    private Integer idsuiviPoste;
    @Column(name = "date_suivi")
    @Temporal(TemporalType.DATE)
    private Date dateSuivi;
    @Size(max = 45)
    @Column(name = "numero")
    private String numero;
    @Size(max = 45)
    @Column(name = "horaire")
    private String horaire;
    @Size(max = 45)
    @Column(name = "statut")
    private String statut;
    @Size(max = 45)
    @Column(name = "pl")
    private String pl;
    @Size(max = 45)
    @Column(name = "nombre_absence")
    private String nombreAbsence;
    @Size(max = 45)
    @Column(name = "motif_absence")
    private String motifAbsence;
    @Size(max = 45)
    @Column(name = "nombre_sanction")
    private String nombreSanction;
    @Size(max = 45)
    @Column(name = "motif_sanction")
    private String motifSanction;
    @Size(max = 45)
    @Column(name = "montant_sanction")
    private String montantSanction;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "commentaire")
    private String commentaire;
    @Column(name = "date_effet")
    @Temporal(TemporalType.DATE)
    private Date dateEffet;
    @JoinColumn(name = "poste", referencedColumnName = "idposte")
    @ManyToOne
    private Poste poste;
    @JoinColumn(name = "idvigile", referencedColumnName = "idvigile")
    @ManyToOne
    private Vigile idvigile;
    @JoinColumn(name = "zone", referencedColumnName = "idzone")
    @ManyToOne
    private Zone zone;

    public SuiviPoste() {
    }

    public SuiviPoste(Integer idsuiviPoste) {
        this.idsuiviPoste = idsuiviPoste;
    }

    public Integer getIdsuiviPoste() {
        return idsuiviPoste;
    }

    public void setIdsuiviPoste(Integer idsuiviPoste) {
        this.idsuiviPoste = idsuiviPoste;
    }

    public Date getDateSuivi() {
        return dateSuivi;
    }

    public void setDateSuivi(Date dateSuivi) {
        this.dateSuivi = dateSuivi;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public String getNombreAbsence() {
        return nombreAbsence;
    }

    public void setNombreAbsence(String nombreAbsence) {
        this.nombreAbsence = nombreAbsence;
    }

    public String getMotifAbsence() {
        return motifAbsence;
    }

    public void setMotifAbsence(String motifAbsence) {
        this.motifAbsence = motifAbsence;
    }

    public String getNombreSanction() {
        return nombreSanction;
    }

    public void setNombreSanction(String nombreSanction) {
        this.nombreSanction = nombreSanction;
    }

    public String getMotifSanction() {
        return motifSanction;
    }

    public void setMotifSanction(String motifSanction) {
        this.motifSanction = motifSanction;
    }

    public String getMontantSanction() {
        return montantSanction;
    }

    public void setMontantSanction(String montantSanction) {
        this.montantSanction = montantSanction;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDateEffet() {
        return dateEffet;
    }

    public void setDateEffet(Date dateEffet) {
        this.dateEffet = dateEffet;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    public Vigile getIdvigile() {
        return idvigile;
    }

    public void setIdvigile(Vigile idvigile) {
        this.idvigile = idvigile;
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
        hash += (idsuiviPoste != null ? idsuiviPoste.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SuiviPoste)) {
            return false;
        }
        SuiviPoste other = (SuiviPoste) object;
        if ((this.idsuiviPoste == null && other.idsuiviPoste != null) || (this.idsuiviPoste != null && !this.idsuiviPoste.equals(other.idsuiviPoste))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.SuiviPoste[ idsuiviPoste=" + idsuiviPoste + " ]";
    }
    
}
