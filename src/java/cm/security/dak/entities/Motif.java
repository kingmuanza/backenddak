/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cm.security.dak.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Muanza Kangudie
 */
@Entity
@Table(name = "motif")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Motif.findAll", query = "SELECT m FROM Motif m"),
    @NamedQuery(name = "Motif.findByIdmotif", query = "SELECT m FROM Motif m WHERE m.idmotif = :idmotif"),
    @NamedQuery(name = "Motif.findByCode", query = "SELECT m FROM Motif m WHERE m.code = :code"),
    @NamedQuery(name = "Motif.findByLibelle", query = "SELECT m FROM Motif m WHERE m.libelle = :libelle"),
    @NamedQuery(name = "Motif.findByTarif", query = "SELECT m FROM Motif m WHERE m.tarif = :tarif")})
public class Motif implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmotif")
    private Integer idmotif;
    @Size(max = 45)
    @Column(name = "code")
    private String code;
    @Size(max = 45)
    @Column(name = "libelle")
    private String libelle;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tarif")
    private Double tarif;

    public Motif() {
    }

    public Motif(Integer idmotif) {
        this.idmotif = idmotif;
    }

    public Integer getIdmotif() {
        return idmotif;
    }

    public void setIdmotif(Integer idmotif) {
        this.idmotif = idmotif;
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

    public Double getTarif() {
        return tarif;
    }

    public void setTarif(Double tarif) {
        this.tarif = tarif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmotif != null ? idmotif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motif)) {
            return false;
        }
        Motif other = (Motif) object;
        if ((this.idmotif == null && other.idmotif != null) || (this.idmotif != null && !this.idmotif.equals(other.idmotif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.Motif[ idmotif=" + idmotif + " ]";
    }
    
}
