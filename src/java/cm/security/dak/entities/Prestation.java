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
@Table(name = "prestation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prestation.findAll", query = "SELECT p FROM Prestation p"),
    @NamedQuery(name = "Prestation.findByIdprestation", query = "SELECT p FROM Prestation p WHERE p.idprestation = :idprestation"),
    @NamedQuery(name = "Prestation.findByCode", query = "SELECT p FROM Prestation p WHERE p.code = :code"),
    @NamedQuery(name = "Prestation.findByLibelle", query = "SELECT p FROM Prestation p WHERE p.libelle = :libelle")})
public class Prestation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprestation")
    private Integer idprestation;
    @Size(max = 45)
    @Column(name = "code")
    private String code;
    @Size(max = 45)
    @Column(name = "libelle")
    private String libelle;

    public Prestation() {
    }

    public Prestation(Integer idprestation) {
        this.idprestation = idprestation;
    }

    public Integer getIdprestation() {
        return idprestation;
    }

    public void setIdprestation(Integer idprestation) {
        this.idprestation = idprestation;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprestation != null ? idprestation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prestation)) {
            return false;
        }
        Prestation other = (Prestation) object;
        if ((this.idprestation == null && other.idprestation != null) || (this.idprestation != null && !this.idprestation.equals(other.idprestation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.Prestation[ idprestation=" + idprestation + " ]";
    }
    
}
