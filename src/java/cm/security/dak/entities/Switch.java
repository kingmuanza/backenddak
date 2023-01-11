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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Muanza Kangudie
 */
@Entity
@Table(name = "switch")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Switch.findAll", query = "SELECT s FROM Switch s"),
    @NamedQuery(name = "Switch.findByIdswitch", query = "SELECT s FROM Switch s WHERE s.idswitch = :idswitch"),
    @NamedQuery(name = "Switch.findByDate", query = "SELECT s FROM Switch s WHERE s.date = :date"),
    @NamedQuery(name = "Switch.findByStatut", query = "SELECT s FROM Switch s WHERE s.statut = :statut")})
public class Switch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idswitch")
    private Integer idswitch;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Size(max = 45)
    @Column(name = "statut")
    private String statut;
    @JoinColumn(name = "idaffectation", referencedColumnName = "idaffectation")
    @ManyToOne
    private Affectation idaffectation;
    @JoinColumn(name = "idvigile_base", referencedColumnName = "idvigile")
    @ManyToOne
    private Vigile idvigileBase;
    @JoinColumn(name = "idvigile_switch", referencedColumnName = "idvigile")
    @ManyToOne
    private Vigile idvigileSwitch;

    public Switch() {
    }

    public Switch(Integer idswitch) {
        this.idswitch = idswitch;
    }

    public Integer getIdswitch() {
        return idswitch;
    }

    public void setIdswitch(Integer idswitch) {
        this.idswitch = idswitch;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Affectation getIdaffectation() {
        return idaffectation;
    }

    public void setIdaffectation(Affectation idaffectation) {
        this.idaffectation = idaffectation;
    }

    public Vigile getIdvigileBase() {
        return idvigileBase;
    }

    public void setIdvigileBase(Vigile idvigileBase) {
        this.idvigileBase = idvigileBase;
    }

    public Vigile getIdvigileSwitch() {
        return idvigileSwitch;
    }

    public void setIdvigileSwitch(Vigile idvigileSwitch) {
        this.idvigileSwitch = idvigileSwitch;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idswitch != null ? idswitch.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Switch)) {
            return false;
        }
        Switch other = (Switch) object;
        if ((this.idswitch == null && other.idswitch != null) || (this.idswitch != null && !this.idswitch.equals(other.idswitch))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.Switch[ idswitch=" + idswitch + " ]";
    }
    
}
