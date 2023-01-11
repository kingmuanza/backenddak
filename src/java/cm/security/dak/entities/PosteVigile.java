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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "poste_vigile")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PosteVigile.findAll", query = "SELECT p FROM PosteVigile p"),
    @NamedQuery(name = "PosteVigile.findByIdposteVigile", query = "SELECT p FROM PosteVigile p WHERE p.idposteVigile = :idposteVigile"),
    @NamedQuery(name = "PosteVigile.findByTypeVigile", query = "SELECT p FROM PosteVigile p WHERE p.typeVigile = :typeVigile"),
    @NamedQuery(name = "PosteVigile.findByQuantite", query = "SELECT p FROM PosteVigile p WHERE p.quantite = :quantite"),
    @NamedQuery(name = "PosteVigile.findByHoraire", query = "SELECT p FROM PosteVigile p WHERE p.horaire = :horaire")})
public class PosteVigile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idposte_vigile")
    private Integer idposteVigile;
    @Size(max = 45)
    @Column(name = "type_vigile")
    private String typeVigile;
    @Column(name = "quantite")
    private Integer quantite;
    @Size(max = 45)
    @Column(name = "horaire")
    private String horaire;
    @JoinColumn(name = "idposte", referencedColumnName = "idposte")
    @ManyToOne
    private Poste idposte;

    public PosteVigile() {
    }

    public PosteVigile(Integer idposteVigile) {
        this.idposteVigile = idposteVigile;
    }

    public Integer getIdposteVigile() {
        return idposteVigile;
    }

    public void setIdposteVigile(Integer idposteVigile) {
        this.idposteVigile = idposteVigile;
    }

    public String getTypeVigile() {
        return typeVigile;
    }

    public void setTypeVigile(String typeVigile) {
        this.typeVigile = typeVigile;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public Poste getIdposte() {
        return idposte;
    }

    public void setIdposte(Poste idposte) {
        this.idposte = idposte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idposteVigile != null ? idposteVigile.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PosteVigile)) {
            return false;
        }
        PosteVigile other = (PosteVigile) object;
        if ((this.idposteVigile == null && other.idposteVigile != null) || (this.idposteVigile != null && !this.idposteVigile.equals(other.idposteVigile))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cm.security.dak.entities.PosteVigile[ idposteVigile=" + idposteVigile + " ]";
    }
    
}
