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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Muanza Kangudie
 */
@Entity
@Table(name = "vigile_conge")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VigileConge.findAll", query = "SELECT v FROM VigileConge v"),
    @NamedQuery(name = "VigileConge.findByIdvigileConge", query = "SELECT v FROM VigileConge v WHERE v.idvigileConge = :idvigileConge"),
    @NamedQuery(name = "VigileConge.findByDateDebut", query = "SELECT v FROM VigileConge v WHERE v.dateDebut = :dateDebut"),
    @NamedQuery(name = "VigileConge.findByDateFin", query = "SELECT v FROM VigileConge v WHERE v.dateFin = :dateFin")})
public class VigileConge implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvigile_conge")
    private Integer idvigileConge;
    @Column(name = "date_debut")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Column(name = "date_fin")
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @JoinColumn(name = "idvigile", referencedColumnName = "idvigile")
    @ManyToOne
    private Vigile idvigile;

    public VigileConge() {
    }

    public VigileConge(Integer idvigileConge) {
        this.idvigileConge = idvigileConge;
    }

    public Integer getIdvigileConge() {
        return idvigileConge;
    }

    public void setIdvigileConge(Integer idvigileConge) {
        this.idvigileConge = idvigileConge;
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

    public Vigile getIdvigile() {
        return idvigile;
    }

    public void setIdvigile(Vigile idvigile) {
        this.idvigile = idvigile;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvigileConge != null ? idvigileConge.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VigileConge)) {
            return false;
        }
        VigileConge other = (VigileConge) object;
        if ((this.idvigileConge == null && other.idvigileConge != null) || (this.idvigileConge != null && !this.idvigileConge.equals(other.idvigileConge))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.VigileConge[ idvigileConge=" + idvigileConge + " ]";
    }
    
}
