/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cm.security.dak.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Muanza Kangudie
 */
@Entity
@Table(name = "nationalite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nationalite.findAll", query = "SELECT n FROM Nationalite n"),
    @NamedQuery(name = "Nationalite.findByIdnationalite", query = "SELECT n FROM Nationalite n WHERE n.idnationalite = :idnationalite"),
    @NamedQuery(name = "Nationalite.findByCode", query = "SELECT n FROM Nationalite n WHERE n.code = :code"),
    @NamedQuery(name = "Nationalite.findByLibelle", query = "SELECT n FROM Nationalite n WHERE n.libelle = :libelle")})
public class Nationalite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnationalite")
    private Integer idnationalite;
    @Size(max = 45)
    @Column(name = "code")
    private String code;
    @Size(max = 45)
    @Column(name = "libelle")
    private String libelle;
    @OneToMany(mappedBy = "nationalite")
    private Collection<Vigile> vigileCollection;

    public Nationalite() {
    }

    public Nationalite(Integer idnationalite) {
        this.idnationalite = idnationalite;
    }

    public Integer getIdnationalite() {
        return idnationalite;
    }

    public void setIdnationalite(Integer idnationalite) {
        this.idnationalite = idnationalite;
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

    @XmlTransient
    public Collection<Vigile> getVigileCollection() {
        return vigileCollection;
    }

    public void setVigileCollection(Collection<Vigile> vigileCollection) {
        this.vigileCollection = vigileCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnationalite != null ? idnationalite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nationalite)) {
            return false;
        }
        Nationalite other = (Nationalite) object;
        if ((this.idnationalite == null && other.idnationalite != null) || (this.idnationalite != null && !this.idnationalite.equals(other.idnationalite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.Nationalite[ idnationalite=" + idnationalite + " ]";
    }
    
}
