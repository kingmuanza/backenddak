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
@Table(name = "permission")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permission.findAll", query = "SELECT p FROM Permission p"),
    @NamedQuery(name = "Permission.findByIdpermission", query = "SELECT p FROM Permission p WHERE p.idpermission = :idpermission"),
    @NamedQuery(name = "Permission.findByDate", query = "SELECT p FROM Permission p WHERE p.date = :date"),
    @NamedQuery(name = "Permission.findByDateDebut", query = "SELECT p FROM Permission p WHERE p.dateDebut = :dateDebut"),
    @NamedQuery(name = "Permission.findByDateFin", query = "SELECT p FROM Permission p WHERE p.dateFin = :dateFin")})
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpermission")
    private Integer idpermission;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "date_debut")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Column(name = "date_fin")
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "commentaire")
    private String commentaire;
    @JoinColumn(name = "idvigile", referencedColumnName = "idvigile")
    @ManyToOne
    private Vigile idvigile;

    public Permission() {
    }

    public Permission(Integer idpermission) {
        this.idpermission = idpermission;
    }

    public Integer getIdpermission() {
        return idpermission;
    }

    public void setIdpermission(Integer idpermission) {
        this.idpermission = idpermission;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Vigile getIdvigile() {
        return idvigile;
    }

    public void setIdvigile(Vigile idvigile) {
        this.idvigile = idvigile;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpermission != null ? idpermission.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permission)) {
            return false;
        }
        Permission other = (Permission) object;
        if ((this.idpermission == null && other.idpermission != null) || (this.idpermission != null && !this.idpermission.equals(other.idpermission))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.Permission[ idpermission=" + idpermission + " ]";
    }
    
}
