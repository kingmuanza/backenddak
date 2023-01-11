package cm.security.dak.entities;

import cm.security.dak.entities.Affectation;
import cm.security.dak.entities.EquipementVigile;
import cm.security.dak.entities.Nationalite;
import cm.security.dak.entities.Quartier;
import cm.security.dak.entities.SuiviPoste;
import cm.security.dak.entities.Ville;
import cm.security.dak.entities.Zone;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-25T14:51:22")
@StaticMetamodel(Vigile.class)
public class Vigile_ { 

    public static volatile SingularAttribute<Vigile, String> horaire;
    public static volatile SingularAttribute<Vigile, Integer> note;
    public static volatile SingularAttribute<Vigile, String> numero;
    public static volatile SingularAttribute<Vigile, String> matricule;
    public static volatile SingularAttribute<Vigile, String> sommeil;
    public static volatile SingularAttribute<Vigile, Boolean> estRemplacant;
    public static volatile CollectionAttribute<Vigile, SuiviPoste> suiviPosteCollection;
    public static volatile SingularAttribute<Vigile, Date> dteNce;
    public static volatile SingularAttribute<Vigile, String> nom;
    public static volatile SingularAttribute<Vigile, String> refPaie0;
    public static volatile SingularAttribute<Vigile, String> parrain;
    public static volatile SingularAttribute<Vigile, Date> debutConge;
    public static volatile SingularAttribute<Vigile, Integer> jourRepos;
    public static volatile CollectionAttribute<Vigile, EquipementVigile> equipementVigileCollection;
    public static volatile SingularAttribute<Vigile, String> noms;
    public static volatile SingularAttribute<Vigile, Zone> zone;
    public static volatile SingularAttribute<Vigile, Quartier> quartier;
    public static volatile CollectionAttribute<Vigile, Affectation> affectationCollection2;
    public static volatile SingularAttribute<Vigile, String> tel;
    public static volatile SingularAttribute<Vigile, Integer> poste;
    public static volatile SingularAttribute<Vigile, String> motif;
    public static volatile SingularAttribute<Vigile, String> prenom;
    public static volatile CollectionAttribute<Vigile, Affectation> affectationCollection1;
    public static volatile SingularAttribute<Vigile, Nationalite> nationalite;
    public static volatile CollectionAttribute<Vigile, Affectation> affectationCollection;
    public static volatile SingularAttribute<Vigile, Ville> ville;
    public static volatile SingularAttribute<Vigile, String> refPaie;
    public static volatile SingularAttribute<Vigile, Date> dateSortie;
    public static volatile SingularAttribute<Vigile, String> photo;
    public static volatile SingularAttribute<Vigile, Date> finConge;
    public static volatile SingularAttribute<Vigile, Date> dateEntree;
    public static volatile SingularAttribute<Vigile, String> statutPaie;
    public static volatile SingularAttribute<Vigile, Integer> idvigile;
    public static volatile SingularAttribute<Vigile, String> fonction;
    public static volatile SingularAttribute<Vigile, String> mumCni;
    public static volatile SingularAttribute<Vigile, String> statut;

}